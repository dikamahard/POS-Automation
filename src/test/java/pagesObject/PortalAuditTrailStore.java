package pagesObject;

import org.openqa.selenium.By;

public class PortalAuditTrailStore {

    public static By dropdownList(String role, String dropdownName) {
        return By.xpath("//div/ul[@role='"+role+"']/li[text()='"+dropdownName+"']");
    }

    public static By expandBtn(int index) {
        return By.xpath("//tr[contains(@class, 'MuiTableRow-root MuiTableRow-hover css-')]["+index+"]/descendant::*[@aria-label='expand row']");
    }

    public static By searchBar = By.id(":rj:"); // need improvement

    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

}
