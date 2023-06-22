package drone.model.droneparts;

import java.util.ArrayList;

public class GPSModule
{
    private float x;
    private float y;
    private float z;


    public GPSModule(float x, float y, float z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public GPSModule()
    {
        x = 0;
        y = 0;
        z = 0;
    }

}