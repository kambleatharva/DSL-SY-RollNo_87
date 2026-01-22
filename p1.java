import java.util.*;

public class p1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice = 0;

        while (choice != 7) {
            System.out.println("\nMENU");
            System.out.println("1. Display array");
            System.out.println("2. Sum of elements");
            System.out.println("3. Maximum element");
            System.out.println("4. Minimum element");
            System.out.println("5. Search element");
            System.out.println("6. Reverse array");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Array elements: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    break;

                case 2:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += arr[i];
                    }
                    System.out.println("Sum = " + sum);
                    break;

                case 3:
                    int max = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max)
                            max = arr[i];
                    }
                    System.out.println("Maximum = " + max);
                    break;

                case 4:
                    int min = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] < min)
                            min = arr[i];
                    }
                    System.out.println("Minimum = " + min);
                    break;

                case 5:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at index " + i);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Element not found");
                    break;

                case 6:
                    System.out.print("Reversed array: ");
                    for (int i = n - 1; i >= 0; i--) {
                        System.out.print(arr[i] + " ");
                    }
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
