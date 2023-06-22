package drone.model.droneparts;

public abstract class ElectronicsComponent
{
    private int drain;
    private boolean isAlwaysPassive;


    public ElectronicsComponent(int passiveDrain, boolean isAlwaysPassive)
    {
        this.drain = passiveDrain;
        this.isAlwaysPassive = isAlwaysPassive;
    }

    public ElectronicsComponent(int startDrain)
    {
        this.drain = startDrain;
    }

    public int getDrain()
    {
        return drain;
    }

    public void setDrain(int drain)
    {
        this.drain = drain;
    }
}
