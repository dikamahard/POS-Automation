package pagesObject;

import org.openqa.selenium.By;

public class AdministrationEmployee {
    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By inputWithExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]/child::div");
    }

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

    public static By searchBar = By.id(":rj:"); // need improvement

    public static By burgerMenu(int tableIndex, int burgerIndex) {
        return By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1w3u3rw']["+tableIndex+"]/child::td["+burgerIndex+"]");
    }

    public static By burgerList(String listName) {
        return By.xpath("//li[text()="+listName+"]");
    }

    public static By dropdownList(String role, String dropdownName) {
        return By.xpath("//div/ul[@role='"+role+"']/li[text()='"+dropdownName+"']");
    }

}
