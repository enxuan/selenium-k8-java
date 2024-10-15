package lesson_10;

public class NormalUnrelatedClass {

    public void doSth() {
        ParentClass childSamePackage= new ParentClass();
        childSamePackage.fromParent();
    }
}
