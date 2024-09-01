import java.util.*;
public class Primeindexsum {
    public static boolean isPrime(int n) {
         if(n<=1){
             return false;
         }
         for(int i=2;i<=Math.sqrt(n);i++){
             if(n%i==0){
                 return false;
             }
         }
         return true;
    }
    public static int Sumprimeindex(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(isPrime(i)){
                sum+=arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        System.out.println(Sumprimeindex(arr));
    }
}