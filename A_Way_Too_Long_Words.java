import java.util.Scanner;

public class A_Way_Too_Long_Words{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      int test_cases=sc.nextInt();
        while(test_cases>0){
         
            String word=sc.next();
            if(word.length()>10){
                char first_char=word.charAt(0);
                char last_char=word.charAt(word.length()-1);
                int remaining_length=word.length()-2;
                String ans=""+first_char+remaining_length+last_char;

                System.out.println(ans);
              

            }else{
                 System.out.println(word);
            }

            test_cases--;
    
    
    
        }

      
    
}
}