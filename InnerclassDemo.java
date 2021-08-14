class Outer{
	static int a;
	public static void show() {
		
	}
	static class inner{
		
		public void display(){
			System.out.println("static class");
		}
		
	}
}
public class InnerclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Outer obj=new Outer();
obj.show();
Outer.inner obj1=new Outer.inner();
obj1.display();
	}

}
