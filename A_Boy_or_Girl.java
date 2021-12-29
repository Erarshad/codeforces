import java.util.*;

import javax.swing.text.DefaultStyledDocument.ElementSpec;
public class A_Boy_or_Girl{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();

        for(char ele:name.toCharArray()){
            if(map.containsKey(ele)){
                int val=map.get(ele);
                map.put(ele,val+1);
          
            }else{
                map.put(ele,1);
            }
        }


       int count=0;
        for(Character key:map.keySet()){
            if(map.get(key)==1){
              count++;
            }else if(map.get(key)>=2){
                count+=1;

            }

        }


        if(count%2!=0){
            System.out.println("IGNORE HIM!");
        }else{
           System.out.println("CHAT WITH HER!");
        }
       

       
    }
}