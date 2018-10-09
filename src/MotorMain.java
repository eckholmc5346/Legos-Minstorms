
/**
 * This class is the main class for the motor
 *
 * @author ceckholm
 * @version 1
 */
public class MotorMain
{
    public static void main(String[] args) throws InterruptedException
    {
        MotorControl mot = new MotorControl();

        mot.preciseTurn(10);

        Thread.sleep(5000);

        mot.forward();
    }
}
