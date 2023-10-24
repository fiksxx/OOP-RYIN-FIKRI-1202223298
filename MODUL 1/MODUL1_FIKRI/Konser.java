public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
        private String bandName;
        private String date;
        private String location;
        private double ticketPrice;

        public Konser(String bandName, String date, String location, double ticketPrice) {
            this.bandName = bandName;
            this.date = date;
            this.location = location;
            this.ticketPrice = ticketPrice;
        }
        public void setBandName(String bandName){
            this.bandName = bandName;
        }
        public String getBandName(){
            return bandName;
        }
        public void setDate(String date){
            this.date = date;
        }
        public String getDate(){
            return date;
        }
        public void setLocation(String location){
            this.location = location;
        }
        public String getLocation(){
            return location;
        }
        public void setTicketPrice(double ticketPrice){
            this.ticketPrice = ticketPrice;
        }
        public double getTicketPrice(){
            return ticketPrice;
        }
}
