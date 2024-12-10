package pagesObject;

import org.openqa.selenium.By;

public class ReservationAddEdit {

    //global
    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

    public static By errorValidation(String errorMsg) {
        return By.xpath("//p[contains(@class, 'Mui-error') and text()='"+errorMsg+"']");
    }
}
