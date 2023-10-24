import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO: Create List of Konser Object to Store Konser from Konser Class
    private List<Konser> konserList;

    public Database() {
        konserList = new ArrayList<>();
    }

    // TODO: Create Method to insert Konser to Database
    public void insertKonser(Konser konser) {
        konserList.add(konser);
    }

    // TODO: Create Method to Show Konser from Database
    public void showKonser() {
        for (Konser konser : konserList) {
            System.out.println(konser);
        }
    }

    // TODO: Create Method to Buy Ticket and Show the Total Price
    public double buyTicket(Konser konser, int amount) {
        if (konser.getTicketPrice() >= amount) {
            konser.setTicketPrice(konser.getTicketPrice() - amount);
            double totalPrice = konser.getTicketPrice() * amount;
            System.out.println("Selamat anda berhasil membeli tiket!");
            System.out.println("Jumlah tiket yang dibeli: " + amount);
            System.out.println("Total harga: " + totalPrice);
            return totalPrice;
        } else {
            System.out.println("Tidak ada tiket yang tersedia.");
            return 0;
        }
    }
}
