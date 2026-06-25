package HD.LLD.DesignPatterns.Structural.Facade;

public class MovieBookingFacade {
    NotficationService notficationService;
    PaymentService paymentService;
    SeatBookingService seatBookingService;

    MovieBookingFacade() {
        this.notficationService = new  NotficationService();
        this.paymentService = new  PaymentService();
        this.seatBookingService = new   SeatBookingService();
    }

    public void bookTicket() {
        seatBookingService.bookSeat();
        paymentService.processPayment();
        notficationService.notifyUser();
        System.out.println("Ticket booked successfully!");
    }
}
