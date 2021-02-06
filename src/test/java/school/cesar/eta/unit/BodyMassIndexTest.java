package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BodyMassIndexTest {
    private BodyMassIndex bmi;


    @BeforeEach
    public void setup(){
        bmi = new BodyMassIndex();
    }

    @Test
    public void classify_bmi30_obese(){
        String actual = bmi.classify(30);
        Assertions.assertEquals("obese", actual);
    }

    @Test
    public void classify_bmi25_overweight(){
        String actual = bmi.classify(25);
        Assertions.assertEquals("overweight", actual);
    }

    @Test
    public void classify_bmi18dot5_healthyWeight(){
        String actual = bmi.classify(18.5);
        Assertions.assertEquals("healthy weight", actual);
    }

    @Test
    public void classify_bmi16_Underweight(){
        String actual = bmi.classify(16);
        Assertions.assertEquals("underweight", actual);
    }

    @Test
    public void classify_bmi15_SeverelyUnderweight(){
        String actual = bmi.classify(15);
        Assertions.assertEquals("severely underweight", actual);
    }

    @Test
    public void calculate_weight2Height1_2(){
        double actual = bmi.calculate(2, 1);
        Assertions.assertEquals(2, actual);
    }

    @Test
    public void classify_weight2Height1_none(){
        final double[] params = new double[3];
        bmi = new BodyMassIndex(){
            @Override
            public String classify(double bmi) {
                params[0] = bmi;
                return "none";
            }

            @Override
            public double calculate(double weight, double height) {
                params[1] = weight;
                params[2] = height;
                return -1;
            }
        };

        String actual = bmi.classify(2, 1);
        Assertions.assertEquals("none", actual);
        Assertions.assertEquals(2, params[1]);
        Assertions.assertEquals(1, params[2]);
        Assertions.assertEquals(-1, params[0]);
    }
}
