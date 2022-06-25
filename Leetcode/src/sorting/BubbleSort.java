package sorting;

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] a = {2,34,1,0,3,5,6,13};
		for (int i = 0; i < a.length; i++) {
			int temp =0;
			for (int j = 1; j < (a.length-i); j++) {				
				if(a[j-1]<a[j])
				{
					temp = a[j-1];
					a[j-1]=a[j];
					a[j]=temp;		
				}
			}
		}		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
		
		
	}

}
