import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // TODO: Create Database Object
        Database database = new Database();

        // TODO: Create Konser Object and Set the Attributes
        Konser konser = new Konser("Rex Orange Country", "24-10-2023", "Sukabirus", 500000.0);

        // TODO: Insert Konser Object to Database
        database.insertKonser(konser);

        // TODO: Display Greeting Message and Prompt User to Register
        System.out.println("Selamat Datang di Konser EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");

        // TODO: Create a User Object and Set the Attributes
        User user = new User();
        user.registerUser();

        // TODO: Display Main Menu and Prompt User to Choose Menu
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMain Menu:");
            System.out.println("1. Lihat Konser");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Keluar");
            System.out.print("Silahkan Pilih Menu: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nKonser yang tersedia:");
                    database.showKonser();
                    break;
                case 2:
                    System.out.println("\nPembelian Tiket:");
                    System.out.println("Berapa banyak tiket yang mau anda beli: ");
                    int numTickets = scanner.nextInt();
                    double totalPrice = database.buyTicket(konser, numTickets);
                    break;
                case 3:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Pilih 1,2,3 aja");
            }
        } while (choice != 3);
    }
}
