package pagesObject;

import org.openqa.selenium.By;

public class AdministrationProductCategoryAddEdit {

    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

    public static By uploadProductPhoto = By.xpath("(//img[@alt='avatar'])[1]");

    public static By removeLogoProduct = By.xpath("(//button[text()='Remove Logo'])[1]");

    public static By dropdownList(String dropdownName) {
        return By.xpath("//div/ul[@role='listbox']/li[text()='"+dropdownName+"']");
    }

    public static By inputSubProduct(int indexSubProduct, String subProductData) {
        return By.xpath("//p[text()='Sub Product Category']/parent::div/following-sibling::div/div[3]/div["+indexSubProduct+"]/descendant::*[text()='"+subProductData+"']/parent::div");
    }

    public static By deleteSubProduct(int indexSubProduct) {
        return By.xpath("//p[text()='Sub Product Category']/parent::div/following-sibling::div/div[3]/div["+indexSubProduct+"]/descendant::*[@data-testid='DeleteIcon']");
    }

    public static By uploadPhotoSubProduct(int indexSubProduct) {
        return By.xpath("//p[text()='Sub Product Category']/parent::div/following-sibling::div/div[3]/div["+indexSubProduct+"]/descendant::img[@alt='avatar']");
    }

    public static By removePhotoSubProduct(int indexSubProduct) {
        return By.xpath("//p[text()='Sub Product Category']/parent::div/following-sibling::div/div[3]/div["+indexSubProduct+"]/descendant::button[text()='Remove Logo']");
    }

}
