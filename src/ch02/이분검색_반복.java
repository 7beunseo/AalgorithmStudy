package ch02;

public class 이분검색_반복 {
    private static int x = 72;

    private static int BYSRCH(int[] S, int n) {
        int location = -1;
        int low = 0, high = n - 1;
        while(low <= high && location == -1) {
            int mid = (low + high) / 2;
            if(S[mid] == x) location = mid;
            else if(S[mid] > x) high = mid - 1;
            else low = mid + 1;
        }
        return location;
    }

    public static void main(String[] args) {
        int[] S = new int[] {1, 6, 22, 45, 66, 72, 89};
        System.out.println(BYSRCH(S, 7));
    }
}
