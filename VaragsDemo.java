class Rety{
	public int add(int  ...n) {
		int sum=0;
		for(int i:n) {
			
			sum=sum+i;
		
		}
		return sum;
	}
}
public class VaragsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rety obj=new Rety();
System.out.println(obj.add(2,4,6,8,9,10));
	}

}
