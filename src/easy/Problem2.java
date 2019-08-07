package easy;

/**
 * @ClassName Problem2
 * @Description //TODO
 * @Author 江宏岩
 * @Date 2019-08-07 14:54
 * @Version 1.0
 **/
public class Problem2 {
    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long sum = 0;
        while (n != 0) {
            sum += n / 5;
            n /= 5;
        }
        return sum;
        //
    }
}
