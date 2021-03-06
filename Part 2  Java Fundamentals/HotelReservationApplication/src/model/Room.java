package model;

public class Room implements IRoom {
    protected String roomNumber;
    protected Double price;
    protected RoomType enumeration;
    protected boolean isFree;

    public Room(String roomNumber, Double price, RoomType enumeration, boolean isFree){
        this.roomNumber = roomNumber;
        this.price = price;
        this.enumeration = enumeration;
        this.isFree = isFree;
    }

    public String getRoomNumber(){
        return roomNumber;
    }

    public Double getRoomPrice(){
        return price;
    }

    public RoomType getRoomType(){
        return enumeration;
    }

    public boolean isFree(){
        return isFree;
    }

    public void setRoomNumber(String roomNumber){
        this.roomNumber = roomNumber;
    }

    public void  setPrice(Double price){
        this.price = price;
    }

    public void setRoomType(RoomType enumeration){
        this.enumeration = enumeration;
    }

    public void setIsFree(boolean isFree){
        this.isFree = isFree;
    }

    @Override
    public String toString(){
        String available = "availble";
        if (!this.isFree) {
            available = "unavailable";
        }

        String roomType = "a single-bed room";
        if (this.enumeration == RoomType.DOUBLE) {
            roomType = "a double-bed room";
        }

        return "Room " + this.roomNumber + " is " + available + ". It's " + roomType + ". It costs " + this.price + ".";
    }
}
