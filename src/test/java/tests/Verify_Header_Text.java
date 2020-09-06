package tests;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.Home_Page;
import test_data.Test_Data_Info;

public class Verify_Header_Text extends Test_Data_Info {
        @Before
        public void setUP() {
            beforeMethod();
            driver.get("https://www.staff.am/");

        }

        @Test
        public void verify_header_text() throws InterruptedException {
            Home_Page log = new Home_Page();
            Assert.assertEquals("CAREER SEARCH STARTS HERE", log.header_text());
            //test
        }

        @After
        public void tearDown() throws InterruptedException {
            getWaitTime2();
            driver.quit();
        }
    }

