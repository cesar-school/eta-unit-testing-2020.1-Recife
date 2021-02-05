package school.cesar.eta.unit;

import java.time.LocalDate;

public class Person implements ClonableObject {
    public static final String CLASS_NAME = "person";

    static LocalDate birthday;

    String firstName ="test";

    String lastName;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    protected String getName() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public Person clone(){
        return new Person();
    }
}
