interface  Writer{
	public  void write();
}
class Pen implements Writer{
	public void write() {
		System.out.println("im a pen");
	}
}
class Pencil implements Writer{
	public void write() {
		System.out.println("im a pencil");
	}
}
class Kit {
	public void action(Writer p) {
		p.write();
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Kit k=new Kit();
Writer pc=new Pencil();
Writer p=new Pen();
k.action(pc);
	}

}
