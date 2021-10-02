package model;

import java.util.Date;

public class Reservation {
    protected Customer customer;
    protected IRoom room;
    protected Date checkInDate;
    protected Date checkOutDate;

    public Reservation(Customer customer, IRoom room, Date checkInDate, Date checkOutDate){
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public Customer getCustomer(){
        return customer;
    }

    public IRoom getRoom(){
        return room;
    }

    public Date getCheckInDate(){
        return checkInDate;
    }

    public Date getCheckOutDate(){
        return checkOutDate;
    }

    @Override
    public String toString(){
        return "";
    }
}
