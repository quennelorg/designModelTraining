package decorator;

public class PhoneMain {
    Phone barndPhone = new BarndPhone();

    public void run() {
        System.out.println("这是初始手机：");
        barndPhone.call();

        System.out.println("这是加了游戏功能后的手机：");
        barndPhone = new GameDecorator(barndPhone);
        barndPhone.call();

        System.out.println("这是加了拍照功能后的手机：");
        barndPhone = new CameraDecorator(barndPhone);
        barndPhone.call();
    }
}
