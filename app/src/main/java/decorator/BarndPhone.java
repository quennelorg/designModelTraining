package decorator;

public class BarndPhone implements Phone {
    @Override
    public void call() {
        System.out.println("可以打电话");
    }
}
