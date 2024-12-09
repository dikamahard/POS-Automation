package pagesObject;

import org.openqa.selenium.By;

public class AdministrationProductOptionAddEdit {

    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By dropdownList(String dropdownName) {
        return By.xpath("//div/ul[@role='listbox']/li[text()='"+dropdownName+"']");
    }

    public static By inputProductOptionItem(int index, String productOptionData) {
        return By.xpath("(//div[label[text()='"+productOptionData+"']])["+index+"]");
    }

    public static By deleteProductOption(int index) {
        return By.xpath("(//button/*[@data-testid='DeleteIcon'])["+index+"]");
    }

}
