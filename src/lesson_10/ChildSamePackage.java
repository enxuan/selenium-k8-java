package lesson_10;

public class ChildSamePackage extends ParentClass{

    @Override
    protected void fromParent() {
        super.fromParent();
    }

    public void doSth() {
        fromParent();
    }
}
