import java.util.*;
public class A_Three_swimmers{
public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    for(int i = 0;i<t;i++){
        int mytime = scn.nextInt();
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        while(true){
            int diff1 = a - mytime;
            int diff2 = b - mytime;
            int diff3 = c - mytime;
            int min = Integer.MAX_VALUE;
            if(diff1 >= 0){
                min = Math.min(diff1, min);
            }
            if(diff2 >= 0){
                min = Math.min(diff2, min);
            }
            if(diff3 >= 0){
                min = Math.min(diff3, min);
            }
            if(min == Integer.MAX_VALUE){
                a = 2*a;
                b = 2*b;
                c = 2*c;
            }else{
                System.out.println(min);
                break;
            }
        }
    }
}
}