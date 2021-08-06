class A{
	int num1;
	int num2;
	int result;
	

public A()
{
	num1=5;
	num2=10;
}
public A(int n) {
	n=num1;
	num2=n;
}
}
public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj=new A(3);
System.out.println(obj.num2);
	}

}
