package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set 
{
    private java.util.Set hashSet;
    private java.util.Set treeSet;

    public Set() 
    {
        hashSet = new HashSet();
        treeSet = new TreeSet();
        addElements();
    }

    private void addElements() {
        String[] names = {"Amit", "Bharat", "Chitra", "Deepak", "Esha", "Farhan", "Geeta", "Hiren", "Isha", "Jay"};
        for (String name : names)
        {
            hashSet.add(name);
            treeSet.add(name);
        }
    }

    public java.util.Set getHashSet() {
        return hashSet;
    }

    public java.util.Set getTreeSet() {
        return treeSet;
    }

    public void displaySets() {
        System.out.println("HashSet:");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println("TreeSet:");
        it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
