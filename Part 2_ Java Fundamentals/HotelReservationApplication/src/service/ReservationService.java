package service;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.*;

public class ReservationService {
    private static ReservationService reservationService = null;
    protected static Set<IRoom> rooms;
    protected static Set<Reservation> reservations;

    private ReservationService(){
        this.rooms = new HashSet<>();
        this.reservations = new HashSet<>();
    }

    public static void addRoom(IRoom room){rooms.add(room);}

    public static IRoom getARoom(String roomId){
        for (IRoom room : rooms){
            if (room.getRoomNumber().equals(roomId)){
                return room;
            }
        }
        return null;
    }

    public static Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate){
        Reservation reservation = new Reservation(customer, room, checkInDate, checkOutDate);
        reservations.add(reservation);
        return reservation;
    }

    public static Collection<IRoom> findAvailableRooms(Date checkInDate, Date checkOutDate){
        List<IRoom> availables = new ArrayList<>();

        for (Reservation reservation : reservations) {
            for (IRoom room : rooms) {
                if (reservation.getRoom().equals(room)) {
                    availables.add(room);
                    if (!(reservation.getCheckInDate().after(checkOutDate) || reservation.getCheckInDate().before(checkInDate))) {
                        availables.remove(room);
                    }
                }
            }
        }
        return availables;
    }

    public static Collection<Reservation> getCustomersReservation(Customer customer){
        List<Reservation> customersReservation = new ArrayList<>();
        for (Reservation reservation : reservations){
            if (reservation.getCustomer().equals(customer)){
                customersReservation.add(reservation);
            }
        }
        return customersReservation;
    }

    public static Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate){
        if (reservations.isEmpty()){
            return rooms;
        }else{
            return findAvailableRooms(checkInDate, checkOutDate);
        }
    }

    public static void printAllReservation(){
        if (reservations.isEmpty()) {
            System.out.println("There's no reservations yet.");
        } else {
            System.out.println(reservations);
        }
    }

    public static Collection<IRoom> getAllRooms(){return rooms;}

}
