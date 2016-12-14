package InputerVerifierClass;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Naveed Quadri
 */
public class Error {

    /**
     * No Error
     */
    public static final int NO_ERROR = 0;
    /**
     * Just an information
     */
    public static final int INFO = 1;
    /**
     * A warning
     */
    public static final int WARNING = 2;
    /**
     * A fatal error
     */
    public static final int ERROR = 3;
    
    private int errorType;
    private String message;

    /**
     * 
     * @param errorType Type of the error
     * @param message to be displayed in the tooltip
     */
    public Error(int errorType, String message) {
        this.errorType = errorType;
        this.message = message;
    }

    /**
     *
     * @return errorType
     */
    protected int getErrorType() {
        return errorType;
    }

    /**
     * 
     * @return message
     */
    protected String getMessage() {
        return message;
    }

    /**
     * Get a suitable color depending on the error type
     * @return A color
     */
    public Color getColor() {
        switch (errorType) {
            case ERROR:
                return new Color(Integer.valueOf("DC143C", 16));
            case INFO:
                return new Color(Integer.valueOf("f0f9fd", 16));
            case NO_ERROR:
                return Color.WHITE; //any random color,as we'll be using the original color from the component
            case WARNING:
                return new Color(Integer.valueOf("f6f0d1", 16));
            default:
                throw new IllegalArgumentException("Not a valid error type");
        }
    }

    /**
     * Get a suitable icon depending on the icon
     * @return ImageIcon
     */
    public ImageIcon getImage() {
        switch (errorType) {
            case ERROR:
                return new ImageIcon(getClass().getResource("error.png"));
            case INFO:
                return new ImageIcon(getClass().getResource("info.png"));
            case NO_ERROR:
                return null;
            case WARNING:
                return new ImageIcon(getClass().getResource("warning.png"));
            default:
                throw new IllegalArgumentException("Not a valid error type");
        }
    }
}
