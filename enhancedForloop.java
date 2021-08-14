
public class enhancedForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,7};
		int b[]= {2,4,6,8};
	int c[]= {10,20,30,40};
	int d[][]= {
			{1,3,5,7},
			{2,64,6},
			{10,20,30,40,70,90}
	};
	for (int i=0;i<d.length;i++)
	{
		for(int j=0;j<d[i].length;j++) {
			System.out.print(" "+d[i][j]);
		}
		System.out.println();
	}
	for(int k[]:d)
	{
		for(int l:k) {
			System.out.print(" "+l);
		}
		System.out.println();
	}
	}
	}


