package kz.shaykemelov.clocks.stub;

import java.time.Clock;
import java.time.Instant;

import kz.shaykemelov.clocks.api.Clocks;

public final class StubClock implements Clocks
{
    private volatile Clock clock = Clock.systemDefaultZone();

    @Override
    public Instant now()
    {
        return Instant.now(clock);
    }

    public void stub(final Clock clock)
    {
        this.clock = clock;
    }
}
