package pagesObject;

import org.openqa.selenium.By;

public class AdministrationStoreAddEdit {

    public static By inputWithExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]/child::div");
    }

    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

    public static By deleteIcon = By.xpath("//button/*[@data-testid='DeleteIcon']");

    public static By radioButton(String rbName) {
        return By.xpath("//div[@role='radiogroup']/child::label/child::span/*[text()='"+rbName+"']");
    }

    public static By searchBar(String marking) {
        return By.xpath("//div/h6[text()='"+marking+"']/parent::div/following-sibling::div[1]/descendant::input");
    }

    public static By checkBox(String marking, String checkName) {
        return By.xpath("//div/h6[text()='"+marking+"']/parent::div/following-sibling::div[contains(.,'"+checkName+"')]/descendant::*[text()='"+checkName+"']");
    }

    public static By dropdownList(String role, String dropdownName) {
        return By.xpath("//div/ul[@role='"+role+"']/li[text()='"+dropdownName+"']");
    }
}
