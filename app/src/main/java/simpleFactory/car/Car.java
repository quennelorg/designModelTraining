package simpleFactory.car;

public abstract class Car {
    private String name;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public CarBrand getBrand() {
        return brand;
    }

    private void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    private CarBrand brand;

    void createCar(String name, CarBrand brand) {
        setName(name);
        setBrand(brand);
    }

    public void show() {}
}
