package warmup;

public class Manager extends Employee{

    public Manager(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return "holding meetings";
    }
}
