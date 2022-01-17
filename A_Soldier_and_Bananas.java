import java.util.*;
public class A_Soldier_and_Bananas{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
       
        int n=sc.nextInt();
        int w=sc.nextInt();
        int amount = ((w*(w + 1))/2)*k;
        if(amount - n < 0){
            System.out.println(0);
        }else{
            System.out.println(amount - n);
        }
        
        
    }
}