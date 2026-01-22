import java.util.*;

public class p2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int choice = 0;

        System.out.println("Enter elements of Matrix A (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        while (choice != 8) {
            System.out.println("\nMENU");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Identity Matrix");
            System.out.println("5. Transpose of both matrices");
            System.out.println("6. Inverse of Matrix A");
            System.out.println("7. Inverse of Matrix B");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Addition Result:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print((A[i][j] + B[i][j]) + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2: 
                    System.out.println("Subtraction Result (A - B):");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print((A[i][j] - B[i][j]) + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    int[][] mul = new int[3][3];
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            mul[i][j] = 0;
                            for (int k = 0; k < 3; k++) {
                                mul[i][j] += A[i][k] * B[k][j];
                            }
                            System.out.print(mul[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4: 
                    System.out.println("Identity Matrix:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (i == j)
                                System.out.print("1 ");
                            else
                                System.out.print("0 ");
                        }
                        System.out.println();
                    }
                    break;

                case 5: 
                    System.out.println("Transpose of Matrix A:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(A[j][i] + " ");
                        }
                        System.out.println();
                    }

                    System.out.println("Transpose of Matrix B:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(B[j][i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 6: 
                    inverseMatrix(A);
                    break;

                case 7:
                    inverseMatrix(B);
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }

    static void inverseMatrix(int[][] m) {
        int det =
                m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]) -
                m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]) +
                m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);

        if (det == 0) {
            System.out.println("Inverse does not exist (Determinant = 0)");
            return;
        }

        System.out.println("Inverse Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double value =
                        ((m[(j + 1) % 3][(i + 1) % 3] * m[(j + 2) % 3][(i + 2) % 3]) -
                         (m[(j + 1) % 3][(i + 2) % 3] * m[(j + 2) % 3][(i + 1) % 3]))
                                / (double) det;
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
    }
}
