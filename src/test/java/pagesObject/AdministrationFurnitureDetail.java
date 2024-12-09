package pagesObject;

import org.openqa.selenium.By;

public class AdministrationFurnitureDetail {
    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By dropdownList(String dropdownName) {
        return By.xpath("//div/ul[@role='listbox']/li[text()='"+dropdownName+"']");
    }

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }
}
