package lesson_09_2;

public class TestLoginPage {

    public void login(LoginPage loginPage) {
        loginPage.login();
    }

    public static void main(String[] args) {
        LoginPage interalLoginPage = new InternalLoginPage();
        LoginPage externalLoginPage = new ExternalLoginPage();

        TestLoginPage testLoginPage = new TestLoginPage();

        testLoginPage.login(interalLoginPage);
        testLoginPage.login(externalLoginPage);
    }
}
