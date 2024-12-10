package pagesObject;

import org.openqa.selenium.By;

public class AdministrationProductAddEditSingle {

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

    public static By dropdownList(String role, String dropdownName) {
        return By.xpath("//div/ul[@role='"+role+"']/li[text()='"+dropdownName+"']");
    }

    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By inputProductVariant(int productIndex, String productData) {
        return By.xpath("//div[h6[text()='Product Variant']]/following-sibling::div[1]/descendant::label[text()='"+productData+"']["+productIndex+"]/following-sibling::div/input");
    }

    public static By inputProductStock(int productIndex, int stockIndex, String stockData) {
        return By.xpath("//h6[contains(.,'Variant "+productIndex+"')]/parent::div/div[2]/descendant::label[text()='"+stockData+"']["+stockIndex+"]");
    }

    public static By deleteStock(int productIndex, int stockIndex) {
        return By.xpath("//h6[contains(.,'Variant "+productIndex+"')]/parent::div/div[2]/descendant::*[@data-testid='DeleteIcon']["+stockIndex+"]");
    }

    public static By uploadProductMedia(int mediaIndex) {
        return By.xpath("//div/descendant::h6[text()='Product Media']/parent::div/following-sibling::div[1]/descendant::input[@accept='image/jpeg,image/png,image/jpg']["+mediaIndex+"]");
    }

    public static By deleteProductMedia(int mediaIndex) {
        return By.xpath("//div/descendant::h6[text()='Product Media']/parent::div/following-sibling::div[1]/descendant::*[@data-testid='DeleteIcon']["+mediaIndex+"]");
    }

    public static By deleteProductVariant(int variantIndex) {
        return By.xpath("(//div[h6[text()='Product Variant']]/following-sibling::div[1]/descendant::h6[contains(text(), 'Variant')]["+variantIndex+"]/following-sibling::div/descendant::*[contains(@data-testid, 'DeleteIcon')])[1]");
    }

    public static By uploadVariantPhoto(int variantIndex) {
        return By.xpath("//div[h6[text()='Product Variant']]/following-sibling::div[1]/descendant::h6[contains(text(), 'Variant')]["+variantIndex+"]/following-sibling::div/descendant::*[contains(@role, 'img')]");
    }

    public static By checkBox(String marking, String checkName) {
        return By.xpath("//div/h6[text()='P"+marking+"']/parent::div/following-sibling::div[contains(.,'"+checkName+"')]/descendant::*[text()='"+checkName+"']");
    }

}
