class Subtraction
{
	int num1;
	int num2;
	int res1;
	int res2;
	int res3;
	int res4;
	
	public void Perform() {
	res1=num1*num2;
	res2=num1-num2;
    res3=num1%num2;
    res4=num1/num2;
	}
}
public class ClassSubDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Subtraction obj=new Subtraction();
obj.num1=4;
obj.num2=19;
obj.Perform();
System.out.println(obj.res1);
System.out.println(obj.res2);
System.out.println(obj.res3);
System.out.println(obj.res4);
	}

}
