import java.util.Scanner;
public class factorial {
    public static void printFactorial(int n){
        if (n < 0) {
            System.out.println("Invalid input");
            return;
        }
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printFactorial(n);
        }
    }
    
}
