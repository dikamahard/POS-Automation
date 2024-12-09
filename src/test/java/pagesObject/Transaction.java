package pagesObject;

import org.openqa.selenium.By;

public class Transaction {
//    public static By btnCalendar = By.xpath("//button/*[@data-testid='CalendarIcon']");
//    public static By inputCalendar = By.name("date");
//    public static By inputStore = By.xpath("//div[label[text()='Store']]");



    //global
    public static By searchBar = By.id(":rj:");

    public static By expandBtn(int index) {
        return By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1w3u3rw']["+index+"]/td/button");
    }

    public static By expandInfo(int tableIndex, String buttonName) {
        return By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1w3u3rw']["+tableIndex+"]/following-sibling::tr[1]/descendant::button[text()='"+buttonName+"']");
    }

}
