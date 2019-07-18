
public class ArrayOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {23,15,6,8,9,11,7};
		
		System.out.println("Odd numbers in array are: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
			System.out.println(arr[i]+" ");
			}
		}
		
	}

}
