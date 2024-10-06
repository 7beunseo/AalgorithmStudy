package ch02;

public class Selection {
    // k번째로 큰 수 찾기
    static int selection(int[] S, int n, int k) {
        int p = 0;
        int q = n + 1;
        k = k - 1; // 순서 인덱스에 맞추기 위해 -1

        while(p <= q) {
            int j = q;
            j = partition(S, p, j);
            if(p == k) return S[p];
            else if(p > k) q = j;
            else p = j + 1;
        }

        return -1;
    }

    static int partition(int S[], int p, int j) {
        int x = S[p]; // 첫번째 값을 저장해둠
        int i = p;
        while(true) {
            do {
                i++;
            }while(S[i] < x);

            do {
                j--;
            }while(j > p && S[j] > x);

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
        int[] S = new int[] {1, 6, 22, 45, 66, 72, 89, 9999};
        int index = selection(S, 6, 3); // 22가 나와야 정답
        System.out.println(index);
    }
}
