package school.cesar.eta.unit;

public class Staff extends Person{
    Person manager;
    Integer badge;

    public String getManagerName(){
        return manager.getName();
    }

    public Integer getId() {
        return badge;
    }

    @Override
    public Staff clone() {
        return new Staff();
    }
}
