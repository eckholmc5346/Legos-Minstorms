import lejos.nxt.*;
import lejos.robotics.objectdetection.*;
/**
 * This class is used to detect objects 
 *      using the sensors on the NXT robot
 * @author ceckholm
 * @version 1
 */
public class ObjectDetect implements FeatureListener {

    public static int MAX_DETECT = 80;

    public void featureDetected(Feature feature, FeatureDetector detector) {
        int range = (int)feature.getRangeReading().getRange();
        Sound.playTone(1200 - (range * 10), 100);
        System.out.println("Light:" + LightDetect.getLightValue());
        System.out.println("Range:" + range);
    }
}