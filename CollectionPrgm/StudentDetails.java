package CollectionPrgm;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	String name;
	int rollno;
	int age;

	Student(String name, int rollno, int age){
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
}

public class StudentDetails {

	public static void main(String[] args) {
	Student s1 = new Student("Ram", 104, 20);
	Student s2 = new Student("Seeta",123, 19);
	Student s3 = new Student("Lakshman",53,21);

	ArrayList<Student> std=new ArrayList<Student>();  
	std.add(s1);
	std.add(s2);  
	std.add(s3);  

	Iterator itr=std.iterator(); 
	while(itr.hasNext()) {
		Student st=(Student)itr.next();  
		System.out.println(st.name+" "+st.rollno+" "+st.age);
	}

	}
}
