
import java.time.*;
import java.util.concurrent.*;

public class SystemUpdateScheduler {

  public static void scheduleYearlyUpdate(SmartHomeSystem system) {
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    Runnable updateTask = system::turnOffAllAppliances;

    long delay = computeDelayUntilNextJanuaryFirstAt1AM();
    long yearlySeconds = 365 * 24 * 60 * 60;

    scheduler.scheduleAtFixedRate(updateTask, delay, yearlySeconds, TimeUnit.SECONDS);
  }

  private static long computeDelayUntilNextJanuaryFirstAt1AM() {
    ZonedDateTime now = ZonedDateTime.now();
    ZonedDateTime nextUpdate = ZonedDateTime.of(
        now.getYear(), 1, 1, 1, 0, 0, 0, now.getZone());

    if (now.isAfter(nextUpdate)) {
      nextUpdate = nextUpdate.plusYears(1);
    }

    return Duration.between(now, nextUpdate).getSeconds();
  }
}
