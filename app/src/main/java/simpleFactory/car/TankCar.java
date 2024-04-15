package simpleFactory.car;

public class TankCar extends Car{
    @Override
    void createCar(String name, CarBrand brand) {
        super.createCar(name, brand);
    }

    @Override
    public void show() {
        System.out.println("恭喜你成功生产北京汽车, 你的型号是" + getName());
    }
}
