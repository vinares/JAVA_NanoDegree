package api;

import model.Customer;
import model.IRoom;
import model.Reservation;
import service.ReservationService;

import java.util.Collection;
import java.util.Date;

public class HotelResource {
    private static HotelResource hotelResource;

    public Customer getCustomer(String email){return service.CustomerSevice.getCustomer(email);}

    public void createACustomer(String email, String firstName, String lastName){service.CustomerSevice.addCustomer(firstName,lastName,email);}

    public IRoom getRoom(String roomNumber){return ReservationService.getARoom(roomNumber);}

    public Reservation bookARoom(String customerEmail, IRoom room, Date checkInDate, Date checkOutDate){
        return ReservationService.reserveARoom(getCustomer(customerEmail), room, checkInDate, checkOutDate);
    }

    public Collection<Reservation> getCustomerReservations(String customerEmail){
        return ReservationService.getCustomersReservation(getCustomer(customerEmail));
    }

    public Collection<IRoom> findARoom(Date checkIn, Date checkOut){
        return ReservationService.findRooms(checkIn, checkOut);
    }
}
