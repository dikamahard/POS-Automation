package pagesObject;

import org.openqa.selenium.By;

public class AdministrationMerchantAddEdit {

    public static By uploadLogo = By.xpath("(//img[@alt='avatar'])[1]");

    public static By uploadPIC = By.xpath("(//img[@alt='avatar'])[2]");

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

    public static By dropdownList(String dropdownName) {
        return By.xpath("//div/ul[@role='listbox']/li[text()='"+dropdownName+"']");
    }

    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

}
