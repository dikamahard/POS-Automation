package pagesObject;

import org.openqa.selenium.By;

public class Global {

    public static By inputWithExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]/child::div");
    }

    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

    public static By burgerMenu(int tableIndex, int burgerIndex) {
        return By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1w3u3rw']["+tableIndex+"]/child::td["+burgerIndex+"]/button");
    }

    public static By burgerList(String listName) {
        return By.xpath("//li[text()="+listName+"]");
    }

    public static By dropdownList(String role, String dropdownName) {
        return By.xpath("//div/ul[@role='"+role+"']/li[text()='"+dropdownName+"']");
    }

    public static By expandBtn(int index) {
        return By.xpath("//tr[contains(@class, 'MuiTableRow-root MuiTableRow-hover css-')]["+index+"]/descendant::*[@aria-label='expand row']");
    }

    public static By expandInfo(int tableIndex, String buttonName) {
        return By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1w3u3rw']["+tableIndex+"]/following-sibling::tr[1]/descendant::button[text()='"+buttonName+"']");
    }

    public static By searchBar = By.id(":rj:"); // need improvement

    public static By deleteIcon = By.xpath("//button/*[@data-testid='DeleteIcon']");

//    public static By checkBox(String marking, String checkName) {
//        return By.xpath("//div/h6[text()='"+marking+"']/parent::div/following-sibling::div/descendant::div[text()='"+checkName+"']");
//    }

    public static By checkBox(String marking, String checkName) {
        return By.xpath("//div/h6[text()='"+marking+"']/parent::div/following-sibling::div[contains(.,'"+checkName+"')]/descendant::*[text()='"+checkName+"']");
    }

    public static By sortArrow = By.xpath("//*[@data-testid='ArrowDownwardIcon']");

    public static By radioButton(String rbName) {
        return By.xpath("//div[@role='radiogroup']/child::label/child::span/*[text()='"+rbName+"']");
    }

    public static By btnCalendar = By.xpath("//button/*[@data-testid='CalendarIcon']");

}
