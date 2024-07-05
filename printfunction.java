import java.util.*;
public class printfunction {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            System.out.println(name);
        }
    }
}