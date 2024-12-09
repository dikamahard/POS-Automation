package pagesObject;

import org.openqa.selenium.By;

public class AdministrationProductAddMulti {

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

    public static By btnUploadFile = By.xpath("//label[text()='Upload File']");
    public static By dropdownList(String role, String dropdownName) {
        return By.xpath("//div/ul[@role='"+role+"']/li[text()='"+dropdownName+"']");
    }

}
