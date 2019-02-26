
/* 
Java includes two handy classes for timed code execution. If you write a clock applica‐
tion, for example, you might want to update the display every second. You might want
to play an alarm sound at some predetermined time. You could accomplish these tasks
using multiple threads and calls to Thread.sleep(). But the java.util.Timer and
java.util.TimerTask classes handle this for you.

The Timer class is a scheduler. Each instance of Timer has a single thread that runs in
the background, watching the clock and executing one or more TimerTasks at appro‐
priate times. For example:
*/

import java.util.*;

public class Timers {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("Y2K!");
            }
        };
        Calendar cal = new GregorianCalendar(2000, Calendar.JANUARY, 1);
        timer.schedule(task, cal.getTime());
    }
}

/* TimerTask implements the Runnable interface. To create a task, you can simply subclass
TimerTask and supply a run() method.


There are some other varieties of schedule(); you can run tasks once or at recurring
intervals. There are two kinds of recurring tasks—fixed delay and fixed rate. Fixed de‐
lay means that a fixed amount of time elapses between the end of the task’s execution
and the beginning of the next execution. Fixed rate means that the task should begin
execution at fixed time intervals. The difference comes into play when the time to ex‐
ecute the task is long relative to the interval. Keep in mind that tasks are executed by
the Timer’s single scheduler thread. If one task takes a very long time, other tasks may
be delayed, in which case they run as soon as the thread becomes available.

For example:
 */

Timer timer = new Timer();
 TimerTask task = new TimerTask() {
 public void run() {
 repaint(); // update the clock display
 }
 };
 timer.scheduleAtFixedRate( task, 0, 1000 );


// Note that a timer can be stopped with the timer cancel() method