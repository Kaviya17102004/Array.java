import java.util.Scanner;
public class MultiDArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of 2D matrices (depth): ");
        int depth = sc.nextInt();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][][] arr = new int[depth][rows][cols];
        System.out.println("\nEnter the elements of the 3D array:");
        for (int d = 0; d < depth; d++) {
            System.out.println("Matrix " + (d + 1) + ":");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Element [" + d + "][" + i + "][" + j + "]: ");
                    arr[d][i][j] = sc.nextInt();
                }
            }
        }
        System.out.println("\nThe 3D array is:");
        for (int d = 0; d < depth; d++) {
            System.out.println("Matrix " + (d + 1) + ":");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(arr[d][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
