import java.util.Scanner;
class Main{
  public static void main(String[] args) {
        System.out.println(" Please enter the input string :" );
        Scanner in = new Scanner (System.in);
        String s=in.nextLine();
        countnoofwords(s);
        //System.out.println("The first non //repeated character is :  " + c);
  }

   public static void  countnoofwords(String str)
    {
        
        int i,length,j ;
        Character c ;
        length= str.length();   

        //Default set the word count as 1 if length of string is more than 0
        int wordcount = 0; 
        if(length > 0) {
          wordcount = wordcount +1;
        }
     
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
