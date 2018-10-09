import lejos.nxt.Button;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.objectdetection.*;
import lejos.nxt.Sound;
import java.io.File;
/**
 * This class runs and installs the program
 *      on the robot
 * @author ceckholm
 * @version 1
 */
public class Main
{
    
    public static void main(String[] args) {
       

        MotorControl.init();
        Sensors.init();


        UltrasoundShi.comeback();
        Button.ENTER.waitForAnyPress();

    }

}
 
