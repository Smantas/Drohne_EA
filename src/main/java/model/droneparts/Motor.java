package model.droneparts;

import res.DroneProperties;

public class Motor extends ElectronicsComponent
{
    private double speed;
    final private double MAXSPEED = DroneProperties.MAX_MOTOR_SPEED;


    public Motor()
    {
        super(0);
        this.speed = 0;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }
}