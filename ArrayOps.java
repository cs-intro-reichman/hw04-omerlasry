public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
	public static int findMissingInt (int [] array) 
	{
        // Write your code here:
		if(array.length==1)
			return 1;
		boolean test = false;
		for(int i =0 ; i<array.length ; i++)
		{
			test = false;
			for(int j= 0 ; j<array.length;j++)
				if(array[j]==i)
					test = true;
			if(test==false)
				return i;
		}
		return -1;
		
    }


	public static int secondMaxValue(int [] array) 
	{
        // Write your code here:
		int count = 0 ;
		int temp = array[0];
		int max = array[0];
		for(int i = 0 ; i <array.length ; i++)
		{
			if(array[i]>max)
				max = array[i];
		}
		for(int i = 0 ; i<array.length;i++)
		{
			if(array[i]==max)
				count++;
			if(array[i]>temp && array[i]!=max)
				temp = array[i];
		}
		if(count >= 2)
			return max;
        return temp;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2)
	{
        // Write your code here:
		boolean t = false;
		for(int i = 0 ; i<array1.length ; i++)
		{
			t = false;
			for(int j = 0 ; j<array2.length ; j++)
				if(array1[i]==array2[j])
					t = true;
			if(t==false)
				return false;
			
		}
		return true;
	}

    public static boolean isSorted(int [] array) 
	{
        // Write your code here:
		if(array[0]>array[1])
		{
			for(int i = 1 ; i<array.length-1;i++)
			{
				if(array[i]<array[i+1])
					return false;
			}
		}
		for(int i = 1 ; i<array.length-1;i++)
			if(array[i]>=array[i+1])
				return false;
		return true;	
	}

}
