package pagesObject;

import org.openqa.selenium.By;

public class AdministrationMerchantAddEdit {

    public static By uploadLogo = By.xpath("//h6[text()='Merchant Logo']/parent::div/following-sibling::div/descendant::input[@accept='image/jpeg,image/png,image/jpg']");

    public static By uploadPIC = By.xpath("//h6[text()='Merchant PIC']/parent::div/following-sibling::div/descendant::input[@accept='image/jpeg,image/png,image/jpg']");

    public static By fileTypeImageValidation = By.xpath("//p[text()='File type must be image/jpeg,image/png,image/jpg']");

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
