import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        int callsNumber = 60;
        BlockingQueue<String> calls = new ArrayBlockingQueue<>(callsNumber);
        ATS ats = new ATS(calls, callsNumber);
        ats.start();


        List<Operator> operators = new ArrayList<>();
        operators.add(new Operator(calls));
        operators.add(new Operator(calls));
        operators.add(new Operator(calls));
        for (Operator op : operators
        ) {
            op.start();
        }


    }
}