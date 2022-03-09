package warmup;

public class Developer extends Employee{

    public Developer(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return "writing code";
    }
}
