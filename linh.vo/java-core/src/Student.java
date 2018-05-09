
class Student{  
	int id; //field or data member or instance variable  
	int rollno;  
	String name; 
	
	void insertRecord(int r, String n){  
		rollno=r;  
		name=n;  
	}  
	
	void displayInformation(){System.out.println(rollno+" "+name);}  

	public static void main(String args[]){  
		TestStudent4.main(args);
	}  
}  

class TestStudent1{  
	public static void main(String args[]){  
		Student s1=new Student();  
		System.out.println(s1.id);  
		System.out.println(s1.name);  
	}  
}

class TestStudent2{  
	public static void main(String args[]){  
		Student s1=new Student();  
		s1.id=101;  
		s1.name="Sonoo";  
		System.out.println(s1.id+" "+s1.name);//printing members with a white space  
	}  
} 

class TestStudent3{  
	public static void main(String args[]){  
		//Creating objects  
		Student s1=new Student();  
		Student s2=new Student();  
		//Initializing objects  
		s1.id=101;  
		s1.name="Sonoo";  
		s2.id=102;  
		s2.name="Amit";  
		//Printing data  
		System.out.println(s1.id+" "+s1.name);  
		System.out.println(s2.id+" "+s2.name);  
	}  
} 

class TestStudent4{  
	public static void main(String args[]){  
		Student s1=new Student();  
		Student s2=new Student();  
		s1.insertRecord(111,"Karan");  
		s2.insertRecord(222,"Aryan");  
		s1.displayInformation();  
		s2.displayInformation();
	}  
}  
