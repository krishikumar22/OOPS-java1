interface Xyz{
	public void See();
}

public class AnonymousclassInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Xyz obj=new Xyz()
{
	public void See() {
		System.out.println("im the best");
	}
};
obj.See();

	}

}
