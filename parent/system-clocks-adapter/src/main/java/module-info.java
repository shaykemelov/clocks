module kz.shaykemelov.clocks.system
{
    requires kz.shaykemelov.clocks.api;
    requires org.jspecify;

    provides kz.shaykemelov.clocks.api.Clocks with kz.shaykemelov.clocks.system.SystemClock;
}
