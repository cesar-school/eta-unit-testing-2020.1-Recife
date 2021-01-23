package school.cesar.eta.unit;

public class BodyMassIndex {
    public static String classify(double bmi) {
        if(bmi < 16){
            return "severely underweight";
        }

        if(bmi < 18.5){
            return "underweight";
        }

        if(bmi < 25){
            return "healthy weight";
        }

        if(bmi < 30) {
            return "overweight";
        }

        return "obese";
    }
}
