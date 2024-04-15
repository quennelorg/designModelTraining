package simpleFactory.car;

public class CarMain {
    CarFactory carFactory = new CarFactory();
    Car xiaomiCar = carFactory.createCar(CarBrand.XIAOMI, "su7");
    Car tankCar = carFactory.createCar(CarBrand.BEIQI, "tank300");

    public void run () {
        xiaomiCar.show();
        tankCar.show();
    }
}
