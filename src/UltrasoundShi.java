import lejos.nxt.UltrasonicSensor;
import lejos.nxt.Button;
/**
 * This class is for the Untrasound Sensor
 *
 * @author ceckholm
 * @version 1
 */
public class UltrasoundShi
{

    public static boolean doCont = true;

    public static boolean go = true;
    public static void sendout()
    {

        MotorControl.stop();
        Sensors.UC.continuous();
        while(go)
        {
            if (Sensors.UC.getDistance() > 45)
            {


                MotorControl.turnLeft();


            }
            else
            {
                MotorControl.stop();
                go = false;
            }
        }
        MotorControl.stop();
    }

    public static void comeback()
    {
        MotorControl.setSpeed(300);
        boolean isTrue = true;
        Sensors.UC.continuous();
        while(isTrue)
        {
            if (Sensors.UC.getDistance() < 30)
            {
                MotorControl.PILOT.rotate(10);

            }
            else
            {
                MotorControl.stop();
                isTrue = false;
            }
        }
        MotorControl.stop();
        MotorControl.forward();

    }

}
