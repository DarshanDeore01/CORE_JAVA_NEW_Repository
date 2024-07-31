package reflection;



public class Student {
	 
		int rollno;
		String name;
		double marks;
		
		
		
		public Student() {
			rollno=10;
			name="Abc";
			marks= 66.33;
		}
		public Student(int rollno, String name, double marks) {
			
			this.rollno = rollno;
			this.name = name;
			this.marks = marks;
		}
		@Override
		public String toString() {
			return   rollno + " " + name + " " + marks ;
		}
		
	}
