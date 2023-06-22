package drone.model;

import drone.model.droneparts.*;
import drone.res.DroneProperties;

import java.util.ArrayList;

public class Drone
{
    private Motor mainMotor;
    private ArrayList<Motor> sideMotors = new ArrayList<>();
    private ArrayList<ReactionWheel> reactionWheels = new ArrayList<>();
    private Battery battery;
    private DistanceSensor distanceSensor;
    private GPSModule gpsModule;

    private final byte MOTOR_FRONT_NUMBER = 0;
    private final byte MOTOR_RIGHT_NUMBER = 1;
    private final byte MOTOR_BACK_NUMBER = 2;
    private final byte MOTOR_LEFT_NUMBER = 3;


    public Drone()
    {
        instantiateMotors();
        instantiateElectronics();
    }


    private void instantiateMotors()
    {
        mainMotor = new Motor();

        try
        {
            for(int i = 0; i < DroneProperties.SIDE_MOTOR_COUNT; i++)
            {
                sideMotors.add(new Motor());
            }

            reactionWheels.add(new ReactionWheel(mainMotor, null));
            reactionWheels.add(new ReactionWheel(sideMotors.get(MOTOR_FRONT_NUMBER), sideMotors.get(MOTOR_BACK_NUMBER)));
            reactionWheels.add(new ReactionWheel(sideMotors.get(MOTOR_RIGHT_NUMBER), sideMotors.get(MOTOR_LEFT_NUMBER)));
        }
        catch(UnsupportedOperationException | ClassCastException | NullPointerException | IllegalArgumentException e)
        {
            e.printStackTrace();
        }
    }


    private void instantiateElectronics()
    {
        battery = new Battery();
        distanceSensor = new DistanceSensor();
        gpsModule = new GPSModule();
        

        instantiateSensors();
    }


    private void instantiateSensors()
    {

    }


    public Motor getMainMotor()
    {
        return mainMotor;
    }

    public ArrayList<Motor> getSideMotors()
    {
        return sideMotors;
    }

    public ArrayList<ReactionWheel> getReactionWheels()
    {
        return reactionWheels;
    }
}