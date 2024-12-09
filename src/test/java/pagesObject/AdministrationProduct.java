package pagesObject;

import org.openqa.selenium.By;

public class AdministrationProduct {

    public static By sortArrow = By.xpath("//*[@data-testid='ArrowDownwardIcon']");

    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By searchBar = By.id(":rj:"); // need improvement

    public static By burgerMenu(int tableIndex, int burgerIndex) {
        return By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1w3u3rw']["+tableIndex+"]/child::td["+burgerIndex+"]");
    }

    public static By burgerList(String listName) {
        return By.xpath("//li[text()="+listName+"]");
    }


    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

    public static By dropdownList(String dropdownName) {
        return By.xpath("//div/ul[@role='menu']/li[text()='"+dropdownName+"']");
    }


}
