package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BodyMassIndexTest {

    @Test
    public void classify_bmi30_obese(){
        String actual = BodyMassIndex.classify(30);
        Assertions.assertEquals("obese", actual);
    }

    @Test
    public void classify_bmi25_overweight(){
        String actual = BodyMassIndex.classify(25);
        Assertions.assertEquals("overweight", actual);
    }

    @Test
    public void classify_bmi18dot5_healthyWeight(){
        String actual = BodyMassIndex.classify(18.5);
        Assertions.assertEquals("healthy weight", actual);
    }

    @Test
    public void classify_bmi16_Underweight(){
        String actual = BodyMassIndex.classify(16);
        Assertions.assertEquals("underweight", actual);
    }

    @Test
    public void classify_bmi15_SeverelyUnderweight(){
        String actual = BodyMassIndex.classify(15);
        Assertions.assertEquals("severely underweight", actual);
    }
}
