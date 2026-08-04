package MERGE_SORT;

import java.util.Scanner;

public class TWO_SORTED_ARRAYS {
    public static void sorted_Arr(int a[], int b[], int c[]) {
        int i = 0, j = 0, k = 0;
        while (k != c.length) {
            if (i != a.length && j != b.length) {
                // prefer <= for stability purpose
                if (a[i] <= b[j]) {
                    c[k] = a[i];
                    i++;
                    k++;
                } else {
                    c[k] = b[j];
                    j++;
                    k++;
                }

            } else if (i == a.length) {
                c[k] = b[j];
                k++;
                j++;

            } else if (j == b.length) {
                c[k] = a[i];
                k++;
                i++;
            }
        }
        // for (int x = 0; x < c.length; x++) {
        // System.out.print(c[x] + " ");
        // }

    }

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of both arrays : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int arr1[] = new int[num1];
        int arr2[] = new int[num2];

        System.out.println("Enter value of arrays one : ");
        for (int i = 0; i < num1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter value of arrays two : ");
        for (int i = 0; i < num2; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();

        sorted_Arr(arr1, arr2, new int[num1 + num2]);

    }
}
