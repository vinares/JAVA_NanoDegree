package model;

public class FreeRoom extends Room{
    public FreeRoom(String roomNumber, Double price, RoomType enumeration, boolean isFree) {
        super(roomNumber, price, enumeration, isFree);
    }

    @Override
    public void setPrice(Double price) {
        super.setPrice(0.0);
    }

    @Override
    public String toString(){
        return "This is a free room.";
    }
}
