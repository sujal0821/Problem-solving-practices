public class recursionoutloop {
    public static void printGFG(int N) {
        
        if (N == 0) {
            return;
        }
        System.out.println("GFG");
        
        printGFG(N - 1);
    }

    public static void main(String[] args) {
        int N = 5;
        printGFG(N);
    }

}
