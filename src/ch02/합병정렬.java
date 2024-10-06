package ch02;

import java.util.Arrays;

public class 합병정렬 {
    static void merge(int h, int m, int[] U, int[] V, int[] S) {
        int i = 0, j = 0, k = 0;
        while(i < h && j < m) {
            if(U[i] < V[j]) {
                S[k] = U[i];
                i++;
            }
            else {
                S[k] = V[j];
                j++;
            }
            k++;
        }

        while(j < m) {
            S[k] = V[j];
            j++;
            k++;
        }
        while(i < h) {
            S[k] = U[i];
            i++;
            k++;
        }
    }

    static void mergesort(int[] S, int n) {
        // 종료 조건 꼭 명시!
        if(n <= 1) return;

        int h = n / 2;
        int m = n - h;
        int[] U = new int[h];
        int[] V = new int[m];

        for(int i = 0; i < h; i++)
            U[i] = S[i];
        for(int i = 0; i < m; i++)
            V[i] = S[h + i];

        mergesort(U, h);
        mergesort(V, m);
        merge(h, m, U, V, S);
    }

    public static void main(String[] args) {
        int S[] = new int[] {7,23,65,2,45,6,77};
        mergesort(S, 7);
        System.out.println(Arrays.toString(S));
        // [2, 6, 7, 23, 45, 65, 77]
    }
}
