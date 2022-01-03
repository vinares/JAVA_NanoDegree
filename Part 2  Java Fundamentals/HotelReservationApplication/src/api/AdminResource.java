package api;

import model.Customer;
import model.IRoom;
import service.CustomerSevice;
import service.ReservationService;

import java.util.Collection;
import java.util.List;

public class AdminResource {
    private static volatile AdminResource adminResource = null;

    public static AdminResource getInstance(){
        if (adminResource == null){
            synchronized (AdminResource.class) {
                if (adminResource == null) {
                    adminResource = new AdminResource();
                }
            }
        }
        return adminResource;
    }

    public Customer getCustomer(String email){return service.CustomerSevice.getCustomer(email);}

    public void addRoom(List<IRoom> rooms){
        for (IRoom room : rooms){
            ReservationService.addARoom(room);
        }
    }
    public Collection<IRoom> getAllRooms(){return ReservationService.getAllRooms();}
    public Collection<Customer> getAllCustomers(){return CustomerSevice.getAllCustomers();}

    public void displayAllReservations(){ReservationService.printAllReservation();}
}
