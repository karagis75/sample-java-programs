import java.util.HashMap;
import java.util.Scanner;
class CountWords{
  public static void main(String[] args) {
        System.out.println(" Please enter the input string :" );
        Scanner in = new Scanner (System.in);
        String s=in.nextLine();
        countnoofwords(s);
        //System.out.println("The first non //repeated character is :  " + c);
  }

   public static void  countnoofwords(String str)
    {
        HashMap<Integer,Character>  characterhashtable= 
                     new HashMap<Integer,Character>();
        int i,length,j ;
        Character c ;
        length= str.length();  // Scan string and build hash table
        int wordcount = 0; 
        if(length > 0) {
          wordcount = wordcount +1;
        }
        StringBuffer tmp = new StringBuffer("");
        for (i=0;i < length;i++)
        {  
            c=str.charAt(i);
            String Curr = new String();
             Curr = " "+c+ " ";
            if (Curr.equalsIgnoreCase("   ")) 
            {      wordcount = wordcount +1; }
           
        }

        
        System.out.println("wordcount :  " + wordcount);
    }
} 
