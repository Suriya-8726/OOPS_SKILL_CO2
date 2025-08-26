import java.util.Scanner;

class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and cols: ");
        int r = sc.nextInt(), c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] T = new int[c][r];

        System.out.println("Enter Matrix:");
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                A[i][j] = sc.nextInt();

        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                T[j][i] = A[i][j];

        System.out.println("Transpose:");
        for(int i=0; i<c; i++) {
            for(int j=0; j<r; j++)
                System.out.print(T[i][j] + " ");
            System.out.println();
        }
    }
}

