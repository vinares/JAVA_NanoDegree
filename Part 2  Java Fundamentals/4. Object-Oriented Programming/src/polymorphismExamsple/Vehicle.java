package polymorphismExamsple;

public class Vehicle {
    protected String start;
    protected String stop;
    protected String speed;
    protected String direction;

    public Vehicle(String start, String stop, String speed, String direction){
        this.start = start;
        this.stop = stop;
        this.speed = speed;
        this.direction = direction;
    }

    public void setStart(String start){this.start = start;}
    public void setStop(String stop){this.stop = stop;}
    public void setSpeed(String speed){this.speed = speed;}
    public void setDirection(String direction){this.direction = direction;}

    public void start(){System.out.println(start);}
    public void stop(){System.out.println(stop);}
    public void speed(){System.out.println(speed);}
    public void direction(){System.out.println(direction);}
}
