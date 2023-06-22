package drone.model.droneparts;

import drone.res.DroneProperties;

public class Battery
{
    final private float CAPACITY = DroneProperties.BATTERY_CAPACITY;
    private float charge;


    public Battery()
    {
        charge = CAPACITY;
    }


    /**
     * Gibt den Wert von {@link Battery#charge} wieder
     *
     * @return die charge
     */
    public float getCharge()
    {
        return charge;
    }


    /**
     * Ändert den Wert von {@link Battery#charge}
     *
     * @param charge
     */
    public void setCapacity(float charge)
    {
        this.charge = charge;
    }
}
