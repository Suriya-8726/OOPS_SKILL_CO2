import java.util.Scanner;

class ReplaceValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter old value to replace: ");
        int oldVal = sc.nextInt();
        System.out.print("Enter new value: ");
        int newVal = sc.nextInt();

        for(int i = 0; i < n; i++) {
            if(arr[i] == oldVal)
                arr[i] = newVal;
        }

        System.out.println("Updated Array:");
        for(int x : arr)
            System.out.print(x + " ");
    }
}
