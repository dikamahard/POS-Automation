package pagesObject;

import org.openqa.selenium.By;

public class StoreConfigEdit {

    public static By inputWithExplain(String dataName) {
                return By.xpath("//div[label[text()='"+dataName+"']]/child::div");
    }

    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By radioButton(String rbName) {
        return By.xpath("//div[@role='radiogroup']/child::label/child::span/*[text()='"+rbName+"']");
    }

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

    public static By dropdownList(String role, String dropdownName) {
        return By.xpath("//div/ul[@role='"+role+"']/li[text()='"+dropdownName+"']");
    }

}
