package service;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.Collection;
import java.util.Date;

public class ReservationService {
    private static ReservationService reservationService = null;
    private static Collection<IRoom> rooms;

    public void addRood(IRoom room){
        rooms.add(room);
    }

    public IRoom getARoom(String roomId){
        for (IRoom room : rooms){
            if (room.getRoomNumber().equals(roomId)){
                return room;
            }
        }
        return null;
    }

    public Reservation reservateARoom(Customer customer, IRoom room, Date checkInDate, Date CheckOutDate){
        return Reservation(customer, room, checkInDate, checkOutDate);
    }
}
