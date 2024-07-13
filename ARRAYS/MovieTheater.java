public class MovieTheater {
    private char[][] seatingChart;

    // Constructor to initialize the seating chart with '0' indicating available seats
    public MovieTheater(int rows, int cols) {
        seatingChart = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seatingChart[i][j] = '0';
            }
        }
    }

    // Method to display the seating chart
    public void displaySeatingChart() {
        for (int i = 0; i < seatingChart.length; i++) {
            for (int j = 0; j < seatingChart[i].length; j++) {
                System.out.print(seatingChart[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to reserve a seat
    public void reserveSeat(int row, int col) {
        if (row < 0 || row >= seatingChart.length || col < 0 || col >= seatingChart[0].length) {
            System.out.println("Invalid seat position.");
            return;
        }

        if (seatingChart[row][col] == 'X') {
            System.out.println("Seat is already taken.");
        } else {
            seatingChart[row][col] = 'X';
            System.out.println("Seat reserved successfully.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a MovieTheater object with 5 rows and 5 columns
        MovieTheater theater = new MovieTheater(5, 5);

        // Display the initial seating chart
        theater.displaySeatingChart();

        // Try reserving some seats
        theater.reserveSeat(2, 3); // Reserve a seat at row 2, column 3
        theater.reserveSeat(2, 3); // Attempt to reserve the same seat again
        theater.reserveSeat(1, 1); // Reserve a seat at row 1, column 1
        theater.reserveSeat(6, 1); // Attempt to reserve an invalid seat

        // Display the seating chart again to see the changes
        theater.displaySeatingChart();
    }
}

