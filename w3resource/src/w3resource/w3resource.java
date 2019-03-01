package w3resource;

public class w3resource {

	
	 public static void main(String[] args){	
		 
		 int [] arr1 = {1,-4,5,6};
		 int [] arr2 = {1,4,6,6};
		 int[] array_nums = {11, 15, 13, 10, 45, 20};
		String res =  multipleArraysItem(arr1,arr2);
		 System.out.print(NewArray(array_nums));
		 System.out.print(findItemInArray(arr2, 6));
        System.out.print(res);
	 }
		public static String multipleArraysItem(int [] arr1, int []arr2)	 
		 
		{
			String res = ""; 
		 for(int i= 0; i< arr1.length; i++)
		 {
			res +=  " " + arr1[i]*arr2[i];
		 }
		 return res;
		 }
		
		
		public static boolean findItemInArray(int [] arr, int number) {
			
			int result = 0;
			int x =number;
			
			for(int i = 0; i< arr.length ; i++)
			{
				if(arr[i] != number && arr[i+1] != number )
				{
					result = 1;
				}
				
			}
			if(result == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public static int[] NewArray(int []arr)
		{
			
			int one = arr[0];
	
			for(int i= 1 ; i < arr.length; i++)
			{
				arr[i-1] = arr[i];
				
			}
			arr[arr.length-1] = one;
			return arr;
		}
		
	 } 
	 
