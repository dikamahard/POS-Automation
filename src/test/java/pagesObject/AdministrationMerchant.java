package pagesObject;

import org.openqa.selenium.By;

public class AdministrationMerchant {

    public static By expandBtn(int tableIndex) {
        return By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1w3u3rw']["+tableIndex+"]/td/button/*[@data-testid='KeyboardArrowDownIcon']");
    }

    public static By expandInfo(int tableIndex, String buttonName) {
        return By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1w3u3rw']["+tableIndex+"]/following-sibling::tr[1]/descendant::button[text()='"+buttonName+"']");
    }

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

    public static By searchBar = By.id(":rj:");

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
