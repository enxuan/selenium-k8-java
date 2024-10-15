package lesson_09_2;

public class InternalLoginPage extends LoginPage{

    @Override
    protected String usernameLocator() {
        return "InteralLoginPage | usernameLocator";
    }

    @Override
    protected String passwordLocator() {
        return "InteralLoginPage | passwordLocator";
    }

    @Override
    protected String loginButtonLocator() {
        return "InteralLoginPage | loginButtonLocator";
    }
}
