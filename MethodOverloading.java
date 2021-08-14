class Casio{
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void ad(double a,double b,double c) {
		System.out.println(a+b+c);
		
	}
	public void ad(double a,int b,int c) {
		System.out.println(a+b+c);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Casio obj=new Casio();
	obj.add(4, 6);

	obj.add(3, 9);
	}

}
