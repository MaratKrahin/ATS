import java.util.concurrent.BlockingQueue;

public class Operator extends Thread {
    private final BlockingQueue<String> incomingCalls;
    private final int handlingTime = 3000;

    public Operator(BlockingQueue<String> incomingCalls) {
        this.incomingCalls = incomingCalls;
    }

    public void run() {
        while (true) {
            try {
                String call = incomingCalls.poll();
                if (call == null) {
                    break;
                }
                System.out.println("Обработан звонок от абонента: " + call);
                System.out.println("Звонков в очереди: " + incomingCalls.size());
                Thread.sleep(handlingTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}