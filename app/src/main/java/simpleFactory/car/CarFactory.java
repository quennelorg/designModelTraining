package simpleFactory.car;

public class CarFactory {

    public Car createCar(CarBrand brand, String name) {
        switch (brand) {
            case BEIQI -> {
                Car car = new TankCar();
                car.createCar(name, brand);
                return car;
            }
            case XIAOMI -> {
                Car car = new XiaomiCar();
                car.createCar(name, brand);
                return car;
            }
        }
        return null;
    }
}
