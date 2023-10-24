import java.util.Scanner;

public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
    private String nama;
    private String phoneNumber;

    public void setName(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message
    public void registerUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama: ");
        this.nama = scanner.nextLine();
        System.out.println("Nomor telfon: ");
        this.phoneNumber = scanner.nextLine();

        System.out.println("Nama: " + this.nama);
        System.out.println("nomor telfon: " + this.phoneNumber);
        System.out.println("Registrasi Berhasil!");
    }
    public static void main(String[] args) {
        User user = new User();
        user.registerUser();
    }
}
