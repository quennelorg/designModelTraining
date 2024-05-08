package decorator;

public class GameDecorator implements Phone {

    private Phone phone;
    public GameDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void call() {
        phone.call();
        playGame();
    }

    private void playGame() {
        System.out.println("可以玩游戏");
    }
}
