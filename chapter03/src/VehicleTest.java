public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("bm",20,10,10,10);
        System.out.println(car);
        car.speedUp(10);
        System.out.println("车的速度是" + car.getSpeed());
        car.speedDown(20);
        System.out.println("车的速度是" + car.getSpeed());
    }
}
