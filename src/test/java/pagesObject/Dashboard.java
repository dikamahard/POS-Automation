package pagesObject;

import org.openqa.selenium.By;

public class Dashboard {
    //public static By btnCalendar = By.xpath("//button/*[@data-testid='CalendarIcon']");
    //public static By inputCalendar = By.name("date");
//    public static By inputMerchant = By.xpath("//div[label[text()='Merchant']]");
//    public static By inputStore = By.xpath("//div[label[text()='Store']]");

    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By dropdownList(String role, String dropdownName) {
        return By.xpath("//div/ul[@role='"+role+"']/li[text()='"+dropdownName+"']");
    }
}
