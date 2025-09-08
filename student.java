package java_oop;

public class student {
	public String Name = "maruthi";
	public int Age =22;
	public int Sem;
	public int ID_NO;
	protected String Courses;
	
	
	public int getSem1() {
		return Sem;
	}

	public int getIdNo() {
		return ID_NO;
	}
	
	
	
	//method or function of Age
	public void getAge() {
		System.out.println(Age);
	}
	
	//method or function of name
	public String getName() {
		return Name;
	}

	//method or fuction of Sem
	public int getSem() {
		return Sem;
	}
	
	protected String getCourses() {
		return Courses;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
