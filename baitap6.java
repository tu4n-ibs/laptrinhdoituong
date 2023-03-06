public class baitap6 {

    private final int Slow = 1;
    private final int Medium = 2;
    private final int fast = 3;

    private int speed = 1;
    private boolean On = false;
    private int radius = 5;
    private String color = "blue";


    public int getSlow() {
        return Slow;
    }

    public int getMedium() {
        return Medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return On;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        On = on;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void baitap6() {

    }

    public baitap6(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.On = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        String state = " ";
        if (this.isOn()) {
            System.out.println(" Fan is on ");
            System.out.print(" speed " + this.speed);
        } else {
            System.out.println(" Fan is off ");
        }
        System.out.print(" color: " + this.color);
        System.out.print(" radius: " + this.radius);
        return state;
    }
}

