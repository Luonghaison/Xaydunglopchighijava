public class Students {
    private String name = "John";
    private String classes = "CO2";
    public Students() {

    }

    public Students(String n, String c) {
        this.name = n;
        this.classes = c;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setClasses(String c) {
        this.classes = c;
    }

    public String getClasses() {
        return classes;
    }
}
