interface tell{
	void afk();
	default void yell() {
		System.out.println("yell nowe");
	}
}
class Dell implements tell{
	public void afk() {
		System.out.println("in abc");
		
	}
	public void yell() {
		System.out.println("new  Yell");
	}
}
public class Defaultmethodinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
tell obj=new Dell();
obj.afk();
obj.yell();
	}

}
