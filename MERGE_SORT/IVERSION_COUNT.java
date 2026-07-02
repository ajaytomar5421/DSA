package MERGE_SORT;

public class IVERSION_COUNT {
    static int count = 0;

    public static void sort_arr(int a[], int b[], int c[]) {
        // int count = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        while (k < c.length) {
            if (i < a.length && j < b.length) {
                if (a[i] <= b[j]) {
                    c[k] = a[i];
                    k++;
                    i++;
                } else {
                    // count += (a.length - i);
                    c[k] = b[j];
                    j++;
                    k++;
                }
            } else if (i == a.length) {
                c[k] = b[j];
                j++;
                k++;
            } else if (j == b.length) {
                c[k] = a[i];
                i++;
                k++;
            }

        }

        i = 0;
        j = 0;
        while (i < a.length && j < b.length) {
            // if (a[i] >= b[j]) >= this will not work because we are counting the number of inversions, so we need to check if a[i] > b[j
            if (a[i] > b[j]) {
                count += (a.length - i);
                j++;
            } else {
                i++;
            }
        }
        // return count;

    }

    public static void inversion_merge(int arr[]) {
        int n = arr.length;
        if (n == 1)
            return;

        int a[] = new int[n / 2];
        int b[] = new int[n - n / 2];

        for (int i = 0; i < n / 2; i++) {
            a[i] = arr[i];
        }
        for (int j = 0; j < (n - n / 2); j++) {
            b[j] = arr[j + (n / 2)];
        }

        inversion_merge(a);
        inversion_merge(b);

        sort_arr(a, b, arr);

    }

    public static void main(String[] args) {
        inversion_merge(new int[] { 8, 2, 5, 3, 1, 4 });
        System.out.println(count);
    }
}
