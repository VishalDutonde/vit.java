
public class StaticNonStaticAssiement {
	public static void main(String[] args) {
		Student s=new Student();
		Student s1=new Student();
	}
}


class Student{
	
	int sid=getSid();

	{
		System.out.println("Instance Block ");
	}
	
	String sName=getStudName();
	static int classId=getId();

	{
		System.out.println("Static Block 1");
	}
	static String className=getClassName();
	
	{
		System.out.println("Instance Block 1");
	}
	
	

	{
		System.out.println("Static Block 2");
	}
	
	
	public static String getClassName() {
		System.out.println("Static Method 1");
		return "SR Sable IT Services";
	}
	
	public int getSid() {
		System.out.println("instance method1");
		return 34;
	}
	
	public String getStudName() {
		System.out.println("Instance method 2");
		return "Rama";
	}
	
	public static int getId() {
		System.out.println("static method 2");
		return 2;
	}
	
	
}
