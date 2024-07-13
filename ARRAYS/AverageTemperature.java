import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many temperatures they will enter
        System.out.print("How many temperatures will you enter? ");
        int numberOfTemperatures = scanner.nextInt();

        // Array to store the temperatures
        double[] temperatures = new double[numberOfTemperatures];
        
        // Read the temperatures from the user
        for (int i = 0; i < numberOfTemperatures; i++) {
            System.out.print("Enter temperature " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // Calculate the average temperature
        double sum = 0;
        for (int i = 0; i < numberOfTemperatures; i++) {
            sum += temperatures[i];
        }
        double average = sum / numberOfTemperatures;

        // Print the average temperature
        System.out.printf("The average temperature is: %.2f\n", average);
    }
}
