package school.cesar.eta.unit;

public class BodyMassIndex {

    public double calculate(double weight, double height){
        return weight/Math.pow(height, 2);
    }

    public String classify(double bmi) {
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

    public String classify(double weight, double height) {
        double bmi = calculate(weight, height);
        return classify(bmi);
    }
}
