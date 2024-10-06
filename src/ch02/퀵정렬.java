package ch02;

import java.util.Arrays;

public class 퀵정렬 {
    private static int[] S = new int[] {16, 6, 22, 45, 4, 72, 8, 9999};

    static void quicksort(int p, int q) {
        if(p >= q) return;
        int j = q + 1;
        j = partition(p, j); // j를 리턴하도록 했음
        quicksort(p, j - 1);
        quicksort(j + 1, q);
    }

    static int partition(int p, int j) {
        int x = S[p]; // 첫번째 값을 저장해둠
        int i = p;
        while(true) {
            do {
                i++;
            }while(S[i] < x);

            do {
                j--;
            }while(S[j] > x);

            if(i < j) {
                int temp = S[i];
                S[i] = S[j];
                S[j] = temp;
            }
            else
                break;
        }
        S[p] = S[j];
        S[j] = x;
        return j;
    }

    public static void main(String[] args) {
        quicksort(0, 6);
        System.out.println(Arrays.toString(S));
        // [4, 6, 8, 16, 22, 45, 72, 9999]
    }
}
