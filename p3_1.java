import java.util.*;

class p3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Choose searching method:");
        System.out.println("Press 1 for Linear Search");
        System.out.println("Press 2 for Binary Search");
        int choice = sc.nextInt();

        System.out.println("Enter element you want to search:");
        int key = sc.nextInt();

        int index = -1;

        if (choice == 1) {
            System.out.println("Linear search started...");
            for (int i = 0; i < n; i++) {
                if (a[i] == key) {
                    index = i;
                    break;
                }
            }
        } else if (choice == 2) {
            System.out.println("Binary search started...");
            Arrays.sort(a);
            int low = 0, high = n - 1;

            while (low <= high) {
                int mid = (low + high) / 2;
                if (a[mid] == key) {
                    index = mid;
                    break;
                } else if (a[mid] < key) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Oops! Element not found in the array.");
        }
    }
}
