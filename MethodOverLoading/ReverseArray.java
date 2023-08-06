package MethodOverLoading;


public class ReverseArray {
    int[] reverse(int A[]) {
        int b[] = new int[A.length];
        for (int i = A.length - 1, j = 0; i >= 0; i--, j++) {
            b[j] = A[i];
        }
        return b;
    }

    public static void main(String[] args) {
        int Arr[] = { 10, 20, 30, 40, 50, 60 };
        ReverseArray r = new ReverseArray();

        int d[] = r.reverse(Arr);

        for (int num : d) {
            System.out.print(num + " ");
        }
    }
}