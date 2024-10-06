package ch01;

public class 피보나치_재귀 {
    private static int count = 0;

    private static int fib(int n) {
        count++;
        // 종료 조건 꼭 포함해야 함
        if(n <= 1) return n;
        return (fib(n - 1) + fib(n - 2));
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println("fib 함수 호출 횟수 " + count);
    }
}
