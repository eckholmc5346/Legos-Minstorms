import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.robotics.RegulatedMotorListener;
import lejos.robotics.RegulatedMotor;

/**
 * This class controls the NXT robot's movements
 *
 * @author ceckholm
 * @version 1
 */
public class DiffPilot extends DifferentialPilot
{
    public DiffPilot(double diamA, double diamB, RegulatedMotor mot1, RegulatedMotor mot2)
    {
        super(diamA, diamB, mot1,mot2);
    }


}

// (5.5, 5.5, Motor.A, Motor.B)