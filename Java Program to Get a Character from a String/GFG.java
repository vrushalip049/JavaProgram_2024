// Java program to get a specific character
// from a given String at a specific index

class GFG{

    // Driver code
    public static void main(String[] args)
    {

       String str1="Welcome World ";
       String str2="India";
       System.out.println("Before------------");
       System.out.println(str1);
       System.out.println(str2);
       
       String str3=str1.concat(str2);
       System.out.println("After-------------");
       System.out.println(str1);
       System.out.println(str2);
       System.out.println(str3);
        
       char ch=str3.charAt(6);
       String str4="";
       System.out.println("Char at 6->"+ch);
       for (int i=str3.length();i>=0;i--)
       {
    	   str4=str4 +charAt(i);
    	   System.out.println(str4);
       }
       
       
    }

	private static String charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}

