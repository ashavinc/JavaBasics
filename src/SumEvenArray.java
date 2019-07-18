
public class SumEvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr= {2,5,3,4,7,1,6,11};
		
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]+arr[j])%2==0)
				{
					System.out.println(arr[i]+"+"+arr[j]+" = "+(arr[i]+arr[j]));
				}
			}
		}
	
		

	}

}
