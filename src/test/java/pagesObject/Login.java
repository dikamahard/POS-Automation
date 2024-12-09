package pagesObject;
import org.openqa.selenium.By;
public class Login {
    public static By inputUsername = By.name("username");
    public static By inputPassword = By.name("password");
    public static By btnLogin = By.xpath("//button[.='Login']");
    public static By btnMasking = By.xpath("//div/child::input[@name='password']/following-sibling::div/child::button");
    public static By textForgotPassword = By.xpath("//div/child::a[.='Forgot password?']");
    public static By validationUsernameRequired = By.xpath("//p[.='User Name is a required field']");
    public static By validationPasswordRequired = By.xpath("//p[.='Password is a required field']");
    public static By dialogIncorrectUsernamePassword = By.xpath("//div[text()='Incorrect username or password']");

    // Global
    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }
}
