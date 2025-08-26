import java.util.Scanner;

class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and cols: ");
        int r = sc.nextInt(), c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] C = new int[r][c];

        System.out.println("Enter Matrix A:");
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B:");
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                B[i][j] = sc.nextInt();

        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                C[i][j] = A[i][j] + B[i][j];

        System.out.println("Resultant Matrix:");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }
    }
}
