package simpleFactory.car;

public class XiaomiCar extends Car{
    @Override
    void createCar(String name, CarBrand brand) {
        super.createCar(name, brand);
    }

    @Override
    public void show() {
        System.out.println("恭喜你成功生产小米汽车, 你的型号是" + getName());
    }
}
