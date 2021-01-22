package cp.project.selenium.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TheSparksFoundation {
	
	WebDriver driver;
	JavascriptExecutor jse;
	
	
	public void invokeBroweser() {
	
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			
			driver.get("https://www.thesparksfoundationsingapore.org/");
			WebElement img = driver.findElement(By.xpath("//img[contains(@src,'/images/logo_small.png')]")); 
			Thread.sleep(2000);
	        
	        System.out.println(img.isDisplayed());
	        
	        AboutUs();
	        
			Thread.sleep(2000);
			
			StudentProgram();
			
			Thread.sleep(2000);
			
			Policies();
	     
			Thread.sleep(2000);
			
			Resume();
			
			Thread.sleep(2000);
			
			ContactUs();
			
			
			
	        
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void AboutUs() {
		
		try {
			driver.findElement(By.xpath("//*[text()='About Us']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//a[@href='/about/news/']")).click();
			jse = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			for(int i=0;i<680;i++) {
		        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2)", "");
		    }			
			
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void StudentProgram() {
		try {
			
			int j=0;
	        for(;j>-30;j--) {
	            ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0,"+j+")"), "");
	        }
	        for(;j<0;j++) {
	            ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0,"+j+")"), "");
	        }
		
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//*[text()='Programs' and  @role='button']")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//a[@href='/programs/student-scholarship-program/']")).click();
			Thread.sleep(2000);
			
			
			
			for(int i=0;i<400;i++) {
		        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1)", "");
		    }	
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[2]")).click();
			
			Thread.sleep(2000);

			for(int i=0;i<600;i++) {
		        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1)", "");
		    }	
			
			int k=0;
	        for(;k>-30;k--) {
	            ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0,"+k+")"), "");
	        }
	        for(;k<0;k++) {
	            ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0,"+k+")"), "");
	        }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Policies(){
		
		try {
			driver.findElement(By.xpath("//*[text()='Policies and Code']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//a[@href='/policies-and-code/policies/']")).click();
			Thread.sleep(2000);
			for(int i=0;i<700;i++) {
		        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,3)", "");
		    }	
			Thread.sleep(2000);
			
			
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void Resume() {
		
		try {
			
			driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[4]/ul/li[3]/a")).click();
			Thread.sleep(2000);
			for(int i=0;i<200;i++) {
		        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,3)", "");
		    }	
			
			Thread.sleep(2000);

			int k=0;
	        for(;k>-30;k--) {
	            ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0,"+k+")"), "");
	        }
	        for(;k<0;k++) {
	            ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0,"+k+")"), "");
	        }
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

}
	
	public void ContactUs() {
		try {
			
			driver.findElement(By.xpath("//*[text()='Contact Us']")).click();
			Thread.sleep(2000);
			
			for(int i=0;i<400;i++) {
			    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,3)", "");
			}
			
			
			Thread.sleep(4000);
			driver.quit();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
	}
	
	public static void main(String[] args) {
		TheSparksFoundation myObj = new TheSparksFoundation();
		myObj.invokeBroweser();
		

	}

}
