import java.util.Scanner;
public class printtablereverse {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 10 ;
        while ( i >= 1 ){
            System.out.println(n*i);
            i--;
        }
    }
}


