package pagesObject;

import org.openqa.selenium.By;

public class AdministrationPromoAddEdit {

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By inputWithExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]/child::div");
    }

    public static By dropdownList(String role, String dropdownName) {
        return By.xpath("//div/ul[@role='"+role+"']/li[text()='"+dropdownName+"']");
    }

    public static By checkBox(String marking, String checkName) {
        return By.xpath("//div/h6[text()='"+marking+"']/parent::div/following-sibling::div[contains(.,'"+checkName+"')]/descendant::*[text()='"+checkName+"']");
    }

    public static By deletePromoTime(int timeIndex) {
        return By.xpath("//h6[text()='Promo Time']/parent::div/following-sibling::div/descendant::div[contains(@class, 'css-13thz3j')]["+timeIndex+"]/descendant::*[@*='DeleteIcon']");
    }

    public static By inputPromoDay(int timeIndex) {
        return By.xpath("//h6[text()='Promo Time']/parent::div/following-sibling::div/descendant::div[contains(@class, 'css-13thz3j')]"+timeIndex+"]/descendant::label[*='Day']/following-sibling::div");
    }

    public static By inputPromoClock(int timeIdex, String startOrEnd, String hourOrMinute) {
        return By.xpath("//h6[text()='Promo Time']/parent::div/following-sibling::div/descendant::div[contains(@class, 'css-13thz3j')]["+timeIdex+"]/descendant::label[*='"+startOrEnd+"']/following-sibling::div/descendant::label[text()='"+hourOrMinute+"']/following-sibling::div");
    }

}
