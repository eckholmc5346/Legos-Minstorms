/**
 * This class is strictly for the buttons
 * @author ceckholm
 * @version 1
 */
import lejos.nxt.Button;
import lejos.nxt.ButtonListener;
import lejos.nxt.LCD;

public class BtnListener implements ButtonListener {

    private String name;

    /**
     * Constructor
     */
    public BtnListener(String name) {
        this.name = name;
    }

    /**
     * Is called when a button is presses
     * @param b button parameter
     */
    public void buttonPressed(Button b) {
        LCD.drawString("ENTER pressed", 0, 0);
    }

    /**
     * Called once the button is released
     * @param b button parameter
     */
    public void buttonReleased(Button b) {
        LCD.clear();
    }

    /**
     * @return name the name of the button
     */
    public String getName() {
        return this.name;
    }

}