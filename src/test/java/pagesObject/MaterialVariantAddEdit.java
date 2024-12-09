package pagesObject;

import org.openqa.selenium.By;

public class MaterialVariantAddEdit {

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By dropdownList(String role, String dropdownName) {
        return By.xpath("//div/ul[@role='"+role+"']/li[text()='"+dropdownName+"']");
    }

    public static By inputSubData(String marking, String dataName, int index) {
        return By.xpath("//div/child::h6[text()='"+marking+"']/parent::div/following-sibling::div[1]/descendant::div[@class='MuiStack-root css-jj2ztu']["+index+"]/descendant::label[text()='"+dataName+"']/following-sibling::div");
    }

    public static By deleteSubData(String marking, int index) {
        return By.xpath("//div/child::h6[text()='"+marking+"']/parent::div/following-sibling::div[1]/descendant::div[@class='MuiStack-root css-jj2ztu']["+index+"]/descendant::*[@data-testid='DeleteIcon']");
    }
}
