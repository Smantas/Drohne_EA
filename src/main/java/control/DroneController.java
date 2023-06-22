package control;

import model.Drone;

public class DroneController implements Runnable
{
    private Drone drone;

    public DroneController(Drone drone)
    {
        this.drone = drone;
    }

    @Override
    public void run()
    {

    }


    public void move(float x, float y, float z)
    {

    }
}
