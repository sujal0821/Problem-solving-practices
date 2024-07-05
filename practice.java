import java.util.Scanner;
public class practice 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (Character.isAlphabetic(ch)) 
        {
            if (ch >= 'A' && ch <= 'Z') 
            {
                System.out.println(1);
            } 
            else if (ch >= 'a' && ch <= 'z') 
            {
                System.out.println(0);
            }
        } 
        else 
        {
            System.out.println(-1);
        }
    }        
}

