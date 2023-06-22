package drone;

import drone.control.DroneController;
import drone.model.Drone;
import org.json.simple.JSONObject;

public class Main
{
    public static void main(String[] args)
    {
        Drone myDrone = new Drone();
        Thread myDroneController = new Thread(new DroneController(myDrone));
        myDroneController.start();
        JSONObject userDetails = new JSONObject();
        userDetails.put("id", 100);
    }
}