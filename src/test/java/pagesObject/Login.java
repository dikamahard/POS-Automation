package pagesObject;
import org.openqa.selenium.By;
public class Login {
    public static By btnMasking = By.xpath("//div/child::input[@name='password']/following-sibling::div/child::button");
    public static By textForgotPassword = By.xpath("//div/child::a[.='Forgot password?']");
    // Global

    public static By validationError(String errorMsg) {
        return By.xpath("//p[contains(@class, 'Mui-error') and text()='"+errorMsg+"']");
    }
    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

    public static By errorValidation(String errorMsg) {
        return By.xpath("//p[contains(@class, 'Mui-error') and text()='"+errorMsg+"']");
    }

    public static By alertToast(String toastMsg) {
        return By.xpath("//div[@role='alert']/descendant::*[text()='"+toastMsg+"']");
    }

    public static By errorMessage(String  errorMsg) {
        return By.xpath("//div[contains(@class,'MuiAlert-message') and text()='"+errorMsg+"']");
    }
}
