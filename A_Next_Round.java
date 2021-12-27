 import java.util.*;
 public class A_Next_Round{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] students=new int[n+1];// 1--n
    int cuttoff=0;
    for(int i=1;i<=n;i++){
        students[i]=sc.nextInt();
        if(i==k){
         cuttoff=students[i];
        }
    }
   int cnt=0;


    for(int i=1;i<=n;i++){
        if(students[i]>=cuttoff && students[i]>0){
          cnt++;
        }
    }


    System.out.println(cnt);

}
}