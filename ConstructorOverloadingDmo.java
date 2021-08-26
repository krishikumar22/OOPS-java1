package javaclass;
class V{
	int x;
	String y;//instance variable global variable
	double z;
	V(){
		
	}
	V(int x ,String y){
	this.x=x;//local variable
	this.y=y;
	}
	V(int a,String b,double c){
		this(a,b);
		z=c;
	}
	void Pgv() {
		System.out.println(x+"|"+y+"|"+z);
	}
}
public class ConstructorOverloadingDmo {

	public static void main(String[] args) {
		
	V o1=new V();
	V o2=new V(20,"inba");
	V o3=new V(25,"Ayyapan",26.9);
	o1.Pgv();
	o2.Pgv();
	o3.Pgv();
		
		// TODO Auto-generated method stub

	}

}
