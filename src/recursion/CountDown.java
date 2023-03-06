package recursion;

public class CountDown {
    public static void main(String[] args) {
        int n = 10000;
        doCountDown(n);
    }

    public static void doCountDown(int n) {
        if (n != 0) {
            System.out.println(n);
            n--;
            doCountDown(n);
        } else {
            System.out.println(n);
        }
    }
}
