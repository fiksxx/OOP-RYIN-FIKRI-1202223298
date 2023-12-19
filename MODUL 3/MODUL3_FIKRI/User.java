import java.util.Scanner;

public class User {
   // TO DO: Create Private Attributes of User (nama, noHandphone)
   private String nama;
   private String phoneNumber;
   // TO DO: Create Constructor of User
   public User(String nama, String phoneNumnber){
      this.nama = nama;
      this.phoneNumber = phoneNumnber;
   }
   public void setName(String nama) {
         this.nama = nama;
      }

   public void setNoHandPhone(String phoneNumber) {
         this.phoneNumber = phoneNumber;
      }
   // TO DO: Create register Method to show information about name and phone number
   public void register(){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Masukkan nama: ");
      setName(scanner.nextLine());
      System.out.print("Masukkan nomor telephone: ");
      setNoHandPhone(scanner.nextLine());
      System.out.println("=============================");
      System.out.println("Register Berhasil");
      System.out.println("Nama: " + getName());
      System.out.println("Nomor telephone: " + getnoHandPhone());
      System.out.println("Selamat Datang di Bioskop EAD");
      scanner.close();
    }
   // TO DO: Create method to return name and phone number
   
   public String getName() {
      return nama;
  }

   public String getnoHandPhone() {
     return phoneNumber;
  }
}






  