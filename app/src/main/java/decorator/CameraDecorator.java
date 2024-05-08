package decorator;

public class CameraDecorator implements Phone {

    private Phone phone;
    public CameraDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void call() {
        phone.call();
        camera();
    }

    private void camera() {
        System.out.println("可以拍照片");
    }
}
