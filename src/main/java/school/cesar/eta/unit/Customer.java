package school.cesar.eta.unit;

public class Customer extends Person{
    private Integer reward;

    private Customer(){
        reward = 0;
    }

    public String getFirstName(){
        return this.firstName;
    }


    @Override
    public Customer clone() {
        return new Customer();
    }
}
