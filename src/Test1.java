import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Test1 {

	public static void main(String[] args) {
		
		// buat instance ChromeDriver
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // buka website Google Scholar
        driver.get("https://scholar.google.com/");
        
        // cari elemen search box dan masukkan query "Machine Learning"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Machine Learning");

        // tekan tombol Enter untuk submit query
        searchBox.sendKeys(Keys.ENTER);

        // cari hasil search pertama dan klik
        WebElement firstResult = driver.findElement(By.cssSelector("#gs_res_ccl_mid > div:nth-child(1) > div.gs_ri > h3 > a"));
        firstResult.click();

        // print judul paper
        WebElement paperTitle = driver.findElement(By.id("title"));
        System.out.println("Title: " + paperTitle.getText());

        // print daftar author
        WebElement authorList = driver.findElement(By.xpath("//div[@class='gs_a']"));
        System.out.println("Authors: " + authorList.getText());

        // print informasi publikasi dan tutup browser
        WebElement publicationInfo = driver.findElement(By.xpath("//div[@class='gs_ab_mdw']"));
        System.out.println("Publication Info: " + publicationInfo.getText());

        // Close the browser
        driver.quit();
    }
}

