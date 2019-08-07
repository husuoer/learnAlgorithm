package easy;

public class Problem1 {

    public int aplusb(int a,int b){
        int sum = a;
        while(b!=0){
            sum = a^b;
            b = (a&b)<<1;
            a = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        System.out.println(p.aplusb(19,11));
    }
}
