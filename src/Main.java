import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr={4,5,2,23,4,4,32,2};
        System.out.println("input what do you want to kill");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                for(int j=i;j<arr.length;j++){
                    if(j+1!=arr.length){
                        arr[j]=arr[j+1];
                    }else{
                        arr[j]=0;
                    }
                }
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}