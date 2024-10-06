package ch01;


public class 이분검색 {
    public int solution(int[] S, int n, int x) {
        int low = 0, high = n - 1, mid;
        // location 변수를 두고, mid가 일치하면 location = mid 한 후 비교 조건에 location != 0을 하는 방법도 있음

        while(low <= high) { // 아직 검사할 항목이 있고 찾지 못하였는가?
            mid = (low + high) / 2;
            if(S[mid] == x) return mid;
            else if(S[mid] > x) high = mid - 1;
            else low = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        이분검색 T = new 이분검색();

        int[] S = new int[] {1, 4, 6, 8, 11, 34, 55};

        System.out.println(T.solution(S, 7, 4));
    }
}
