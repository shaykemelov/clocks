package kz.shaykemelov.clocks.system;

import java.time.Instant;

import kz.shaykemelov.clocks.api.Clocks;

public final class SystemClock implements Clocks
{
    @Override
    public Instant now()
    {
        return Instant.now();
    }
}
