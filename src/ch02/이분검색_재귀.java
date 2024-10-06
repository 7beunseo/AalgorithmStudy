package ch02;

public class 이분검색_재귀 {
    private static int[] S = new int[] {1, 6, 22, 45, 66, 72, 89};
    private static int x = 72;
    private static int BYSRCH(int low, int high) {
        if(low > high) return -1; // 조심
        int mid = (low + high) / 2;
        if(S[mid] == x) return mid;
        else if(S[mid] > x) return BYSRCH(low, mid - 1);
        else return BYSRCH(mid + 1, high);
    }

    public static void main(String[] args) {
        System.out.println(BYSRCH(1, 7));
    }
}
