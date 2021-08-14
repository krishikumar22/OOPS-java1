class Casio{
	int num1;
	int num2;
	String op;
	public Casio() {
		
	}
	public Casio(int i) {
		num1=i;
	}
	public Casio(int i,int j) {
		num1=i;
		num2=j;
	}
	public Casio(int i,int j,String operation) {
		num1=i;
		num2=j;
		op=operation;
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Casio obj=new Casio(3,6,"add");
	}

}
