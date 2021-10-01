package model;

public class FreeRoom extends Room{
    @Override
    public void setPrice(Double price) {
        super.setPrice(0.0);
    }

    @Override
    public String toString(){
        return "";
    }
}
