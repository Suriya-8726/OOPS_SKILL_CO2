import java.util.Scanner;

class TraceMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] A = new int[n][n];

        System.out.println("Enter Matrix:");
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                A[i][j] = sc.nextInt();

        int trace = 0;
        for(int i=0; i<n; i++)
            trace += A[i][i];

        System.out.println("Trace = " + trace);
    }
}

