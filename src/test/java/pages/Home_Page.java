package pages;
import test_data.Test_Data_Info;
import org.openqa.selenium.By;

public class Home_Page extends Test_Data_Info {


        // Headers

        // Fields


        // Links
        private final By header = By.cssSelector("#search-section > div > div.row > div > h1");

    public String header_text() {
      String h = driver.findElement(header).getText();
        return h;
    }

        // Buttons

    }
