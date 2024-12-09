package pagesObject;

import org.openqa.selenium.By;

public class Reservation {

    //public static By btnAddReservation = By.xpath("//a[@href='/reservation/add']");
    //public static By inputStore = By.xpath("//div[label[text()='Store']]");

    //global
    public static By searchBar = By.id(":rj:");

    public static By burgerMenu(int tableIndex, int burgerIndex) {
        return By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1w3u3rw']["+tableIndex+"]/child::td["+burgerIndex+"]");
    }

    public static By burgerList(String listName) {
        return By.xpath("//li[text()="+listName+"]");
    }

    public static By btn(String btnName) {
        return By.xpath("//button[text()='"+btnName+"']");
    }

    public static By inputWithoutExplain(String dataName) {
        return By.xpath("//div[label[text()='"+dataName+"']]");
    }

    public static By dropdownList(String role, String dropdownName) {
        return By.xpath("//div/ul[@role='"+role+"']/li[text()='"+dropdownName+"']");
    }
}
