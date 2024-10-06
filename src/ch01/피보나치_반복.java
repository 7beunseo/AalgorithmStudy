package ch01;

public class 피보나치_반복 {
    private static int fib(int n) {
        int[] f = new int[n];
        f[0] = 1;

        if(n >= 1) {
            f[1] = 1;
            for(int i = 2; i < n; i++) // 교재에는 i <= n이라고 되어있음 -> 여쭤보기
                f[i] = f[i - 1] + f[i - 2];
        }

        return f[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
