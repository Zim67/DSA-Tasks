import java.util.Scanner;

public class SingleDimensionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store the numbers
        int[] numbers = new int[n];

        // Input values into the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of the array values
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        // Calculate the average of the array values
        double average = (double) sum / n;

        // Display the contents of the array
        System.out.print("The contents of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Display the sum and average of the array values
        System.out.println("The sum of the array values is: " + sum);
        System.out.printf("The average of the array values is: %.2f\n", average);
    }
}
