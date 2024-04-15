package strategy;

public class StrategyMain {
    Context context = new Context(new OperationAdd());

    public void run() {
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
