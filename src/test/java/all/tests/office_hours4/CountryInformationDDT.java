package all.tests.office_hours4;


import all.utilities.Driver;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class CountryInformationDDT {

    WebDriver driver;
    Workbook workbook;
    Sheet workSheet;
    FileInputStream fileInputStream;
    FileOutputStream fileOutputStream;


    @BeforeMethod
    public void setUp() throws IOException {
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        fileInputStream = new FileInputStream("src/test/resources/Countries.xlsx");
        workbook = WorkbookFactory.create(fileInputStream);
        workSheet = workbook.getSheet("Countries");
    }

    @Test
    public void test() {
        int count = workSheet.getPhysicalNumberOfRows();
        System.out.println("count = " + count);
        boolean match =true;
        for (int i = 1; i < count; i++) {
            Row currentRow = workSheet.getRow(i);
            String execute = currentRow.getCell(0).toString();
            System.out.println("execute = " + execute);
            if (execute.equals("y")) {
                // execute the test
                String country = currentRow.getCell(1).toString();
                String capital = currentRow.getCell(2).toString();
                driver.get("https://wikipedia.org");
                driver.findElement(By.id("searchInput")).sendKeys(country + Keys.ENTER);
                String actual = driver.findElement(By.xpath("//th[starts-with(text(), 'Capital')]/following-sibling::td//a")).getText();
                if (actual.equals(capital)) {
                    currentRow.getCell(3).setCellValue("PASS");
                } else {
                    currentRow.getCell(3).setCellValue("FAIL");
                    // create
                    currentRow.createCell(4);
                    currentRow.getCell(4).setCellValue(actual);
                    match=false;
                }

            } else {
                // skip
                currentRow.getCell(3).setCellValue("SKIP");
                continue;
            }

        }

        assertTrue(match);
    }

    @AfterMethod
    public void tearDown() throws IOException {
        Driver.closeDriver();
        fileOutputStream = new FileOutputStream("src/test/resources/Countries.xlsx");
        workbook.write(fileOutputStream);


        fileOutputStream.close();
        fileInputStream.close();
        workbook.close();
    }
}
/*
//th[starts-with(text(), 'Capital')] --> gibe me a th element that starts with text Capital
//th[starts-with(text(), 'Capital')]/../td   -> find the th element that starts with text Capital
                                                find its parent
                                                find its other child named td

//th[starts-with(text(), 'Capital')]/following-sibling::td/a     -> find the th element that starts with text Capital
                                                                find its next sibling td
 */