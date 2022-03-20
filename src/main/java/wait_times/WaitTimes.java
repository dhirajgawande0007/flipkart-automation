package wait_times;

import java.time.Duration;

public class WaitTimes {

	public final Duration SHORT_WAIT = Duration.ofSeconds(
			Long.parseLong(System.getProperty("wait.short")));
	public final Duration DEFAULT_WAIT = Duration.ofSeconds(
            Long.parseLong(System.getProperty("wait.default")));
    public final Duration LONG_WAIT = Duration.ofSeconds(
            Long.parseLong(System.getProperty("wait.long")));
    public final Duration UNREASONABLE_WAIT = Duration.ofSeconds(
            Long.parseLong(System.getProperty("wait.unreasonable")));
    public final Duration LUDICROUS_WAIT = Duration.ofSeconds(
            Long.parseLong(System.getProperty("wait.ludicrous")));
	
}
