package drone.model.droneparts;

public class ReactionWheel extends Motor
{
    private Motor matchingMotor1;
    private Motor matchingMotor2;

    public ReactionWheel(Motor motor1, Motor motor2)
    {
        super();
        this.matchingMotor1 = motor1;
        this.matchingMotor2 = motor2;
    }
}
