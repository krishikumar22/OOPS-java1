
public class Array2DDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,3,5,7};
	int b[]= {2,4,6,8};
int c[]= {10,20,30,40};
int d[][]= {
		{1,3,5,7},
		{2,64,6,8},
		{10,20,30,40}
};
for (int i=0;i<3;i++)
{
	for(int j=0;j<4;j++) {
		System.out.print(" "+d[i][j]);
	}
	System.out.println();
}
}
}