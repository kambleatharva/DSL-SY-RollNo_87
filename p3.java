import java.util.*;

public class p3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target;
        System.out.print("Enter target element to search: ");
        target = sc.nextInt();

        int found = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index " + i);
                found = 1;
                break;
            }
        }

        if (found == 0) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
