public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String s) 
	{
        // Write your code here:
		String ans = "" ;
		boolean test =false;
		for(int i = 0 ; i<s.length() ; i++)
		{
			test =false;
			char ch = s.charAt(i);
			if(ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch ==117 )
			{
				ans = ans + (char)(s.charAt(i)-32);
				test = true;
			}
			if(ch>65&&ch<=90&&ch!=69&&ch!=73&&ch!=79&&ch!=80)
				ans = ans +(char)(s.charAt(i)+32);
				else if(ch>=65&&ch<=90)
					ans = ans + (char)s.charAt(i);
			else
				if(test == false)
					ans = ans + (char)s.charAt(i);
		}
        return ans;
    }

    public static String camelCase (String s) 
	{
        // One two tH:
		String ans = "" ;
		for(int i = 0 ; i<s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(ch>=65&&ch<=90)
				ans = ans +(char)(s.charAt(i)+32);
			else if(ch!=32)
				ans = ans +(char)(s.charAt(i));	
			if(ch == 32 && s.charAt(i+1)!=32)
			{
				if(s.charAt(i+1)>=97 && s.charAt(i+1)<=122)
					ans = ans +(char)(s.charAt(i+1)-32);
				else
					ans = ans +(char)(s.charAt(i+1));
				i++;		
			}	
		
		}
			
        return ans;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
