import java.util.HashMap;
import java.util.Scanner;
class Palindrome {
  public static void main(String[] args) {
   // System.out.println("Hello world!");
     System.out.println(" Please enter the input string :" );
        Scanner in = new Scanner (System.in);
        String s=in.nextLine();
        printallcharactersinreverse(s);
        //System.out.println("The first non //repeated character is :  " + c);
  }

   public static void  printallcharactersinreverse(String str)
    {
        HashMap<Integer,Character>  characterhashtable= 
                     new HashMap<Integer,Character>();
        int i,length,j ;
        Character c ;
        length= str.length();  // Scan string and build hash table
        StringBuffer tmp = new StringBuffer("");
        for (i=0;i < length;i++)
        {
            c=str.charAt(i);
            characterhashtable.put(i,c);
           
        }

        for (j=length; j>=0; j--){ 

          
          if(characterhashtable.get(j)!=null) {
          tmp.append(characterhashtable.get(j)); }
        
        }
        System.out.println("Final value :  " + tmp);
    }
} 