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

    public static By errorValidation(String errorMsg) {
        return By.xpath("//p[contains(@class, 'Mui-error') and text()='"+errorMsg+"']");
    }

    public static By ErrorValidationExist() {
        return By.xpath("//p[contains(@class, 'Mui-error')]");
    }

    public static By alertToast(String toastMsg) {
        return By.xpath("//div[@role='alert']/descendant::*[text()='"+toastMsg+"']");
    }

    public static By errorMessage(String  errorMsg) {
        return By.xpath("//div[contains(@class,'MuiAlert-message') and text()='"+errorMsg+"']");
    }

    public static By errorMessageExist() {
        return By.xpath("//div[contains(@class,'MuiAlert-message')]");
    }

    public static By fileTypeImageValidation = By.xpath("//p[text()='File type must be image/jpeg,image/png,image/jpg']");

}
