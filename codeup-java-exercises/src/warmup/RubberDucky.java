package warmup;

public class RubberDucky {
    private String name;
    private String primaryColor;

    public RubberDucky(String name, String primaryColor) {
        this.name = name;
        this.primaryColor = primaryColor;
    }

    public boolean floating(boolean isFloating) {
        return isFloating;
    }

    public String song() {
        return "Rubber duckie you're the one\n" +
                "You make bath time lots of fun";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }
}
