package ch01;


public class 순차검색 {
    static int location;

    public void solution(int[] S, int n, int x) {
        location = 0;
        while(location < n && S[location] != x) // 아직 검사할 항목이 있고, x를 찾지 못했는가?
            location ++;

        if(location >= n) // 모두 검사하였으나, x를 찾지 못하였는가?
            location = -1;
    }

    public static void main(String[] args) {
        순차검색 T = new 순차검색();

        int[] S = new int[] {1, 5, 7, 2, 45, 12};
        T.solution(S, 5, 45);

        System.out.println(location);
    }
}
