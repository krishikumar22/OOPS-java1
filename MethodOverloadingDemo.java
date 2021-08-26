package javaclass;
class M{
	void Vidhya() {
		System.out.println("hi");
	}
	
	void Vidhya(String a) {
		System.out.println("poda naye");
		
	}
	void Vidhya(String a,int b) {
		System.out.println("poda panni");

	}
	}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
M s=new M();
s.Vidhya("INBA",20);
s.Vidhya();
s.Vidhya("sudar");
	}

}
