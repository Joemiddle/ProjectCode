package code.project.projectcode;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by User on 15/01/2018.
 */

public class TestToMorseTest {

    @Test
    public void testTranslation() throws Exception{
        //Expected SOS
        assertEquals("... --- ... ", TextToMorse.textToMorse("sos"),"... --- ... ");
    }
}
