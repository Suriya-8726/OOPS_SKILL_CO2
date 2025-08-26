import java.util.Scanner;

class SearchCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter value to search: ");
        int val = sc.nextInt();

        int count = 0;
        for(int x : arr) {
            if(x == val) count++;
        }

        System.out.println(val + " occurs " + count + " times.");
    }
}

