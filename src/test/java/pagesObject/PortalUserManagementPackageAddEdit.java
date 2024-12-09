package pagesObject;

import org.openqa.selenium.By;

public class PortalUserManagementPackageAddEdit {

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

    public static By dropdownList(String role, String dropdownName) {
        return By.xpath("//div/ul[@role='"+role+"']/li[text()='"+dropdownName+"']");
    }

    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By searchBar = By.id(":rj:"); // need improvement

    public static By checkBox(String marking, String checkName) {
        return By.xpath("//div/h6[text()='"+marking+"']/parent::div/following-sibling::div[contains(.,'"+checkName+"')]/descendant::*[text()='"+checkName+"']");
    }

}
