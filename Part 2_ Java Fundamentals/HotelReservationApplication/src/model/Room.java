package model;

class Room implements IRoom {
    protected String roomNumber;
    protected Double price;
    protected RoomType enumeration;
    protected boolean isFree;


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
        return "";
    }
}
