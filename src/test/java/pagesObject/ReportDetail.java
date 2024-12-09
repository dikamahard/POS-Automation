package pagesObject;

import org.openqa.selenium.By;

public class ReportDetail {

    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

    public static By expandBtn(int index) {
        return By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1w3u3rw']["+index+"]/td/button[@aria-label='expand row']");
    }

    public static By expandInfo(int tableIndex, String buttonName) {
        return By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1w3u3rw']["+tableIndex+"]/following-sibling::tr[1]/descendant::button[text()='"+buttonName+"']");
    }

}
