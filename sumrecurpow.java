public class sumrecurpow {
    public static long sumOfSeries(long n) {

        long sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += (long) i * i * i;
        }
        return sum;
    }

        
    public static void main(String[] args) {
        long n =  26501;
        long sum = sumOfSeries(n);
        System.out.println(sum);
    }
}
