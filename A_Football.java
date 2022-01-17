import java.util.*;


public class A_Football{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        if(input.length()<7){
            System.out.println("NO");
            return;
        }

        int start=0; 
        int end=6;

         boolean ans=false;
        
        while(start<input.length() && end<input.length()){

            ans=is_danger(input,start, end);
            if(ans){
                break;
            }
            start++;
            end++;




            
        } 



        System.out.println(ans==true?"YES":"NO");
       












    }


    private static boolean is_danger(String input, int start_idx, int end_idx){
        char prev=input.charAt(start_idx);
        int count=0;
        for(int i=start_idx+1;i<=end_idx;i++){
            char curr=input.charAt(i);
            if(prev==curr){
                count++;

            }else{
                count=0;
            }


            prev=curr;


        }

    

        if(count+1>=7){
            return true;
        }

      return false;
    }

}


