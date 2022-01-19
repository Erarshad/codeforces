import java.util.*;
public class sonu_monu{
         public static void main(String[] args){
             Scanner sc=new Scanner(System.in);
               int n=sc.nextInt();
               int[] game=new int[n];
               for(int i=0;i<n;i++){
                   game[i]=sc.nextInt();
               }
              boolean ans= gamify(game,0,0,0,game.length-1,1);

              System.out.println(ans);

         }

         public static boolean gamify(int[] num,int sonu, int monu, int start, int end,int move){
             if(start>=end){
                 if(sonu>=monu){
                     return true;
                 }
              
                 return false;
             }

             if(end<=start){
                if(sonu>=monu){
                    return true;
                }
             
                return false;
             }


            int max=-1;

            if(num[start]<num[end]){
               max=num[end];
               end=end-1;


            }else{
                max=num[start];
                 start=start+1;

            }

           
            

           return gamify(num, move%2!=0?sonu+max:sonu, move%2==0?monu+max:monu, start, end,move+1);
         }
}