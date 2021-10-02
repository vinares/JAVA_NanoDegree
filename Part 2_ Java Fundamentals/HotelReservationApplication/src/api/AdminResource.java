package api;

import model.Customer;
import model.IRoom;
import service.CustomerSevice;
import service.ReservationService;

import java.util.Collection;
import java.util.List;

public class AdminResource {
    private static AdminResource adminResource;

    public Customer getCustomer(String email){return service.CustomerSevice.getCustomer(email);}

    public void addRoom(List<IRoom> rooms){
        for (IRoom room : rooms){
            ReservationService.addRoom(room);
        }
    }
    public Collection<IRoom> getAllRooms(){return ReservationService.getAllRooms();}
    public Collection<Customer> getAllCustomers(){return CustomerSevice.getAllCustomers();}

    public void displayAllReservations(){ReservationService.printAllReservation();}
}
