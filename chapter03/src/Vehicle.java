public class Vehicle {
    private String brand;
    private int speed;
    private int length;
    private int width;
    private int height;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void speedUp(int speed) {
        if (speed < 0) {
            System.out.println("您输入的数字不合法");
            return;
        }
        this.speed += speed;
        System.out.println("加速了!");
    }

    public void speedDown(int speed) {
        if (speed < 0) {
            System.out.println("您输入的数字不合法");
            return;
        }
        this.speed -= speed;
        System.out.println("减速了!");
    }

    public void move() {
        System.out.println("移动!");
    }

    public Vehicle() {

    }
    public Vehicle(String brand, int speed, int length, int width, int height) {
        this.brand = brand;
        this.speed = speed;
        this.length = length;
        this.width = width;
        this.height = height;
    }
}
