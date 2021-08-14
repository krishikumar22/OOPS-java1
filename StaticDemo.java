class Emp{
	int eid;
	int salary;
	static String ceo;
	
	public Emp()
	{
		eid=15;
		salary=20000;
		
	}
	
	static {
		ceo="larry";
	}
	
	public void show()
	{
		System.out.println(eid+":"+salary+":"+ceo);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp Krishi=new Emp();
Emp Karan=new Emp();
Krishi.show();
Karan.show();
	}

}
