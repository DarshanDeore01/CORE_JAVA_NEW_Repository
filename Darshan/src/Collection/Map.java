package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Set;

public class Map {
    private java.util.Map hashMap;
    private java.util.Map treeMap;

    public Map() {
        hashMap = new HashMap();
        treeMap = new TreeMap();
        addElements();
    }

    private void addElements() {
        String[] names = {"Amit", "Bharat", "Chitra", "Deepak", "Esha", "Farhan", "Geeta", "Hiren", "Isha", "Jay"};
        for (int i = 0; i < names.length; i++) {
            hashMap.put(i, names[i]);
            treeMap.put(i, names[i]);
        }
    }

    public java.util.Map getHashMap() {
        return hashMap;
    }

    public java.util.Map getTreeMap() {
        return treeMap;
    }

    public void displayMaps() {
        System.out.println("HashMap:");
        Set set = hashMap.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("TreeMap:");
        set = treeMap.entrySet();
        it = set.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
