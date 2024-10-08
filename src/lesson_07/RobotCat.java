package lesson_07;

// Parent class, super class
public class RobotCat {

    private String name;
    private String productionDate;

    public RobotCat() {
    }

    public RobotCat(String name, String productionDate) {
        this.name = name;
        this.productionDate = productionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String charge() {
        return "charging";
    }

    @Override
    public String toString() {
        return "Robot Cat{name=" + name + ", Production Date=" + productionDate
                + "}";
    }
}
