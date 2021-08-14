class Student
{
	static int age=15;
	static String school="srv";
	int marks=100;
	String name="xyz";
}
public abstract class Array1DDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int num[]= {4,8,15,16,23,42};
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		
		Student s[]= {s1,s2,s3,s4};
		
for(int i=0;i<=3;i++)
{
	System.out.println(s[i]);
}
	}

}
