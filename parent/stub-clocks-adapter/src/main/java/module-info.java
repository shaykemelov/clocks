module kz.shaykemelov.clocks.stub
{
    requires kz.shaykemelov.clocks.api;
    requires org.jspecify;

    provides kz.shaykemelov.clocks.api.Clocks with kz.shaykemelov.clocks.stub.StubClock;

    exports kz.shaykemelov.clocks.stub;
}
