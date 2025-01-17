package Exception.section_14;

import java.util.logging.Logger;

public class MultipleCatchDemo {
    private static Logger logger = Logger.getLogger(MultipleCatchDemo.class.getName());

    public static void main(String[] args) {
        String input = null;

        try {
            input = "Alex";
            input = input.toUpperCase();
            logger.info(input);
            input = input.substring(1, 33);
            logger.info(input);
        } catch (NullPointerException ex) {
            logger.severe("Null value is present");
        } catch (StringIndexOutOfBoundsException exception) {
            logger.severe("String Index out of boung exception ocucured");
        }
    }
}
