package service;

import model.*;

import java.awt.*;
import java.util.*;
import java.util.List;

public class ReservationService {
    private static volatile ReservationService reservationService = null;
    protected static Set<IRoom> rooms;
    protected static Set<Reservation> reservations;

    public static ReservationService getInstance(){
        if (reservationService == null) {
            synchronized (ReservationService.class) {
                if (reservationService == null) {
                    reservationService = new ReservationService();
                }
            }
        }
        return reservationService;
    }

    private ReservationService(){
        rooms = new HashSet();
        reservations = new HashSet();
    }

    public static void addARoom(IRoom room){
        rooms.add(room);
    }

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

    public static Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate){
            List<IRoom> availables = new ArrayList();
            HashSet<IRoom> unavailables = new HashSet<IRoom>();
            for (Reservation reservation:reservations){
                if (unavailables.contains(reservation.getRoom())) {
                    continue;
                }
                Date start = reservation.getCheckInDate();
                Date end = reservation.getCheckOutDate();
                if ((start.after(checkInDate) && start.before(checkOutDate))||(end.after(checkInDate)&&end.before(checkOutDate))||(checkInDate.before(end)&&checkInDate.after(start))||(checkOutDate.after(start)&&checkOutDate.before(end))){
                    unavailables.add(reservation.getRoom());
                }
            }

            for (IRoom room: rooms){
                if (!unavailables.contains(room)){
                    availables.add(room);
                }
            }
            return availables;
        }

    public static Collection<Reservation> getCustomersReservation(Customer customer){
        List<Reservation> customerReservation = new ArrayList();
        for (Reservation reservation: reservations){
            if (reservation.getCustomer().equals(customer)){
                customerReservation.add(reservation);
            }
        }
        return customerReservation;
    }
    public static void printAllReservation(){
        Integer i = 0;
        if (reservations.isEmpty()) {
            System.out.println("There's no reservations.");
        }
        else {
            for (Reservation reservation : reservations) {
                i += 1;
                System.out.println(i.toString() + ". " + reservation);
            }
        }
    }

    public static Collection<IRoom> getAllRooms(){
        return rooms;
    }

}
