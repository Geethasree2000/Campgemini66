package com.cap;

class Student extends Object{
	//@Override
	/*public String toString(){
		return "name" + this.name + "id" + this.id;
	}*/
	/*@Override
	
	public boolean equals(Student obj){
		Student s = (Student) obj;
		if(this.name.equalsIgnaoreCase(s.getName())){
			return ture;
		}else{
			return false;
		}
	}*/

}
public class Demo {
	public static void main(String[] args) {
		Student st = new Student();
		//getting current class
		System.out.println(st.getClass());
		
		//hashCode --> return the hash code value of object.Used for hashing.give index and search for object. 
		System.out.println(st.hashCode());
		
		//toString --> package name + class (com.cap.Student@15db9742(hex))
		System.out.println(st.toString());
		//internally calls to string method
		System.out.println(st);
		
		//equals --. check bothh the bbjoects are equal or not
		System.out.println(st.equals(st));
		
		Student st2 = null;
		System.out.println(st.equals(st2));
		
		//copy and create and retrun the same object
		//Student s3 = st.clone();
		
		//thread used for s
		
		st.notify();
	}

}
