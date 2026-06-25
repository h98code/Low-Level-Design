package HD.LLD.DesignPatterns.Structural.Facade;

public class Main {
    public static void main(String[] args) {
        MovieBookingFacade movieBookingFacade = new MovieBookingFacade();
        movieBookingFacade.bookTicket();
    }
}
