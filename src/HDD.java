public class HDD {
    private String name;
    private int value;
    private Type type;

    public HDD() {
    }

    public HDD(String name, int value, Type type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    @Override
    public String toString() {
        return "HDD: " + "name = " + this.name + ", value = " + this.value + ", type = " + this.type;
    }
}
