package pagesObject;

import org.openqa.selenium.By;

public class AdministrationPromo {

    public static By expandBtn(int index) {
        return By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1w3u3rw']["+index+"]/td/button[@aria-label='expand row']");
    }

    public static By expandInfo(int tableIndex, String buttonName) {
        return By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1w3u3rw']["+tableIndex+"]/following-sibling::tr[1]/descendant::button[text()='"+buttonName+"']");
    }

    public static By burgerMenu(int tableIndex, int burgerIndex) {
        return By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1w3u3rw']["+tableIndex+"]/child::td["+burgerIndex+"]");
    }

    public static By burgerList(String listName) {
        return By.xpath("//li[text()="+listName+"]");
    }

    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By searchBar = By.id(":rj:"); // need improvement

}
