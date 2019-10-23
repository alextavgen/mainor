import mainor.Stopwatch;

import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) {
        Stopwatch watch = new Stopwatch();
        watch.elapsedTime();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(watch.elapsedTime());

    }
}
