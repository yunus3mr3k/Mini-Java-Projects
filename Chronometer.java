import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Chronometer {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How long should the stopwatch run ?");
        System.out.println("Hour : ");
        int hour1 = keyboard.nextInt();
        System.out.println("Minute : ");
        int minute1 = keyboard.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int second = 0;
            int minute = 0;
            int hour = 0;

            public void run() {

                second++;
                if (second == 60) {
                    minute++;
                    second = 0;

                }
                if (minute == 60) {
                    hour++;
                    minute = 0;
                }

                System.out.print("\r" + hour + ":" + minute + ":" + second);
                if (hour == hour1) {
                    if (minute == minute1) {
                        System.out.println();
                        System.out.println("Time is up");
                        timer.cancel();
                    }
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);

    }


}


