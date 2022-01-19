import java.util.*;
public class A_Even_Odds{
         public static void main(String[] args){
             Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             int k=sc.nextInt();
             int ans=0;

             while(n-->0 || k>0){
                 if(n%2!=0){
                   ans=n;

                    k--;
                 }
             }

             if(k>0){
                while(n-->0 || k>0){
                    if(n%2==0){
                      ans=n;
   
                       k--;
                    }
                }
             }



             System.out.println(ans);


         }
}