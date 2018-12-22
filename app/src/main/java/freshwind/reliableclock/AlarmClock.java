package freshwind.reliableclock;

public class AlarmClock
{
    private boolean isSet;
    private String description;
    private int time;

    public AlarmClock(int time)
    {
        this.time = time;
        isSet = true;
    }

    public void setTime(int time)
    {
        this.time = time;
    }

    public int getTime()
    {
        return this.time;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return this.description;
    }

    public boolean isSet()
    {
        return this.isSet;
    }

    public void enable()
    {
        this.isSet = true;
    }

    public void disable()
    {
        this.isSet = false;
    }
}
