import java.util.Scanner;
public class A_Team{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      int test_cases=sc.nextInt();
      int count=0;
        while(test_cases-->0){
            int first_friend=sc.nextInt();
            int second_frnd=sc.nextInt();
            int thrd_frnd=sc.nextInt();
            if(first_friend==1 && second_frnd ==1 ){
                count++;
            }else if(first_friend ==1 && thrd_frnd==1){
                count++;
            }else if(second_frnd==1 && thrd_frnd==1){
                count++;
            }

            

         
            
    
    
    
        }


      System.out.println(count);
}
}