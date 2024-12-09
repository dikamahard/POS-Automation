package pagesObject;

import org.openqa.selenium.By;

public class Shift {

    //public static By inputStore = By.xpath("//div[label[text()='Store']]");

    // global
    public static By searchBar = By.id(":rj:");

    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By dropdownList(String role, String dropdownName) {
        return By.xpath("//div/ul[@role='"+role+"']/li[text()='"+dropdownName+"']");
    }

}
