import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Created by kurtmccann on 9/10/16.
 */
public class ColorfulThingTest {



    @Test
    public void getColorTest(){
        ColorfulThing ct = new ColorfulThing("purple");
        String expectedColor = "purple";
        String actualColor =  ct.getColor();
        assertEquals("Output should be purple", expectedColor, actualColor);
    }




}
