package lesson_06;

public class Robotcat {

    private String name;
    private String year;
    private String color;

    public Robotcat() {
    }

    public Robotcat(String name) {
        this.name = name;
    }

    public Robotcat(String name, String year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printName() {
        System.out.println(name);
    }
}
