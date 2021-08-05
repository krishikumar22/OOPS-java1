class Calc
{
	int num1;
	int num2;
	int res;
	
	public void operations()
	{
		res=num1*num2;
	}
}
public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calc obj=new Calc();
obj.num1=10;
obj.num2=28;
obj.operations();
System.out.println("the answer is "+obj.res);
	}

}
