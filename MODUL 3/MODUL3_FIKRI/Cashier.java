public class Cashier extends Bioskop {
    private Boolean isBooked[][];

    public void printTicket(User user, int row, int seat) {
        if (isBooked[row][seat]) {
            System.out.println("=======================");
            System.out.println("Nama: " + user.getName());
            System.out.println("No hp: " + user.getnoHandPhone());
            System.out.println("Seat : " + (row + 1) + "," + (seat + 1));
            System.out.println("=======================");
            System.out.println("Selamat Menonton");
        } else {
            System.out.println("Kursi belum dipesan.");
        }
    }
}

