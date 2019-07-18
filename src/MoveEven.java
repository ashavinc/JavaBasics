
public class MoveEven {

	public static int[] main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {3,5,7,4,2,12,13,9,10};
     int temp=0; int a=0;
     for(int i=1;i<arr.length;i++)
     {
    	 if (arr[i-1]%2==0){
    		 
    		for( int j=1;j>a;j++)
    		{
    		 temp=arr[i-1];
    		 arr[i-1]=arr[i];
    		 arr[i]=temp;
       	     }a++;
          }
     }
    	 
     return arr;
     }
	}


