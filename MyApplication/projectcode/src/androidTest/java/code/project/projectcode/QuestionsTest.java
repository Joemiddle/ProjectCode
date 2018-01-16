package code.project.projectcode;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by User on 15/01/2018.
 */

public class QuestionsTest {

    private Questions question;

    @Before
    public void setUp() throws Exception{
        question = new Questions("The answer is 1","1","2","3","4","1");
    }

    @Test
    public void testQuestions() throws Exception{
        assertEquals(true,question.checkAnswer(question.getPA1()));

    }
}

