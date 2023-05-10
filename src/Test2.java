import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) {
		
		// buat instance ChromeDriver
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // buka website Youtube
        driver.get("https://www.youtube.com/");
        
        // memasukkan kata kunci pencarian ke dalam input pencarian
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("super seventeen");

        // menekan tombol search
        WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
        searchButton.click();
       
        // menampilkan video dari hasil pencarian
        WebElement firstVideo = driver.findElement(By.xpath("//a[@id='video-title'][@href]"));  
           
        //
        driver.quit();

        

	}
}




   
