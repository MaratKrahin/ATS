import java.util.concurrent.BlockingQueue;

public class ATS extends Thread {
    private int callsCounter;
    private int timeToWait = 1000;
    RandomPhoneNum rPhone = new RandomPhoneNum();
    BlockingQueue<String> calls;


    public ATS(BlockingQueue<String> calls, int callsCounter) {
        this.calls = calls;
        this.callsCounter = callsCounter;
    }

    public void run() {
        int i = 0;
        while (i < callsCounter) {
            try {
                calls.put(rPhone.randomPhoneNumber());
                Thread.sleep(timeToWait);
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}