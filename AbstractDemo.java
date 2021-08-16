abstract class Human{//abstract class
	public abstract void eat();

public void sleep() {
	System.out.println("you sleep");
}
}
class Man extends Human{    //concreteclass
	public void eat() {
		System.out.println("men eats");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Human obj=new Man();  //reference of abstract class object of concrete class
obj.eat();
obj.sleep();
	}

}
