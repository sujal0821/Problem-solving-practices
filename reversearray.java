import java.util.Scanner;

public class reversearray {
    public static void reverseArray(int[] arr, int i){
        int a = arr.length;

        if (i >= a/2 ){
            return;
        }
        int temp = arr[i];
        arr[i]=arr[a-i-1];
        arr[a-i-1]= temp;

        reverseArray(arr, i + 1);
    }
    public static void main(String[] args) {
        int [] arr ={1,2,4,5,7};

        reverseArray(arr, 0);

        for (int j : arr){
            System.out.print(j +" ");
        }
    }
}
