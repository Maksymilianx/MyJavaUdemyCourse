package SectionNr6.Exercises;

public class VipCustomer {

    private String name;
    private double limit;
    private String email;

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }

    public VipCustomer() {
        this("Default name", 0, "Default email");
        System.out.println("Empty constructor called");
    }

    public VipCustomer(String name, double limit) {
        this(name, limit, "default@email.com");
    }

    public VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }



}
