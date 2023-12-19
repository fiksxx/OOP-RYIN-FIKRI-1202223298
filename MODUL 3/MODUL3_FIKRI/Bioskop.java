public class Bioskop {
    // TO DO: Create Private Attributes of rows and assign rows to 5
    private int rows = 5;
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    private int seatsPerRows = 10;
    // TO DO: Create 2 dimensional array to store seat reservation status
    private int[][] seats = new int[rows][seatsPerRows];
    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
        seats[1][3] = 1;
        seats[4][7] = 1;
    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRows; j++) {
                    System.out.print(seats[i][j] + " ");
                }
            }
            System.out.println("");
        }
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        if (row >= 0 && row < rows && seat >= 0 && seat < seatsPerRows) {
            if (seats[row][seat] == 0) {
                seats[row][seat] = 1;
                System.out.println("");
            } else {
                System.out.println("");
            }
        } else {
            System.out.println("");
        }
        // Display the updated seating layout}
    }
}