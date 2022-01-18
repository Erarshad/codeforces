import java.util.*;
public class A_Twins{
    static int min;
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        int sum = 0;
        for(int i =0; i<n; i++){
            arr[i] = scn.nextInt();
            sum += arr[i];
        }
        min = Integer.MAX_VALUE;
        comb(arr, 0, sum, 0, 0);
        System.out.println(min);
    }
    public static void comb(int [] arr, int idx, int sum, int ssf, int coins){
        // if(ssf > sum){
        //     min = Math.min(coins, min);
        //     return;
        // }
        if(idx == arr.length){
            if(ssf > sum){
                min = Math.min(min, coins);
            }
            return;
        }
        comb(arr, idx + 1, sum - arr[idx], ssf + arr[idx], coins + 1);
        comb(arr, idx + 1, sum, ssf, coins);
    }

    
}