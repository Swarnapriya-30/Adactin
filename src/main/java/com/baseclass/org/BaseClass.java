package com.baseclass.org;

import java.awt.AWTException;
import java.awt.Checkbox;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	//BrowserLaunch
	public static WebDriver browserLaunch(String browsername) {
		
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
					
			}else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir")+ "\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
					
			}else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir")+ "\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
					
			}else {
				System.out.println("Invalid Browsername");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	//getURL
	
	public static void getUrl(String url) {
		
		driver.get(url);
		
	}
	
	//DropDown
	
	public static void DropDown(WebElement element,String option,String value){
		
		Select s = new Select(element);
		
		if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
			}
		else if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if (option.equalsIgnoreCase("texts")) {
			s.selectByVisibleText(value);
		}
	}
	
	//send_keys
	public static void sendKeys(WebElement element,String input) {
	
		element.sendKeys(input);
	}
	//close
	public static void close(){
		driver.close();
}
	
	//quit
	public static void quit() {
		driver.quit();
	}

	//navigate_to
	public static void navigateTo(String input) {
		driver.navigate().to(input);
	}
	
	//navigate_back
	public static void navigateBack() {
		driver.navigate().back();
	}
	
	//navigate_forward
	public static void navigateForward() {
		driver.navigate().forward();
	}
	
	//navigate_refresh
	public static void refresh() {
		driver.navigate().refresh();
	}
	//Simple_Alert
	public static void simpleAlert() {
		Alert alert = driver.switchTo().alert();	
		alert.accept();
	}

	//Confirm_Alert
	public static void confirmAlert(String option) {
		Alert alert = driver.switchTo().alert();	
		if (option.equalsIgnoreCase("accept")) {
			alert.accept();
	}else if (option.equalsIgnoreCase("dismiss")) {
		alert.dismiss();
	}
	}
	//Prompt_Alert
	public static void promptAlert(String input,String option) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(input);
		if (option.equalsIgnoreCase("accept")) {
			alert.accept();
		}else if (option.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
	}
	}
	//Actions
	public static void actions(String option,WebElement element) {
		org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);
		if (option.equalsIgnoreCase("rightclick")) {
		ac.contextClick(element).build().perform();
		}
		else if (option.equalsIgnoreCase("doubleclick")) {
			ac.doubleClick(element).build().perform();
		}                
		else if (option.equalsIgnoreCase("movetoelement")) {
			ac.moveToElement(element).click().build().perform();
		}
		//else if (option.equalsIgnoreCase("draganddrop")) {
			//ac.dragAndDrop(src_element, dest_element).build().perform();
			//}
	}
	//Actions_dranganddrop
	public static void actionDragAndDrop(WebElement src_element,WebElement dest_element) {
		org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);
		ac.dragAndDrop(src_element, dest_element);	
	}
	//Inner_Frames
	public static void inner_Frame(String parameter,String value) {
		if (parameter.equalsIgnoreCase("integer")) {
			driver.switchTo().frame(value);
		}
		else if (parameter.equalsIgnoreCase("webelement")) {
			driver.switchTo().frame(value);
		}
		else if (parameter.equalsIgnoreCase("id_or_name")) {
			driver.switchTo().frame(value);
		}
	}
	//Parent_frames
	public static void parent_Frame() {
		driver.switchTo().parentFrame();
	}
	//Default_Frame
	public static void defaultFrame() {
		driver.switchTo().defaultContent();	
	}
	//Robot
	public static void robot(String option) throws AWTException {
		Robot r =new Robot();
		if (option.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		else if (option.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		else if (option.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		}
	}
	//Check_box
	public static void checkBox(WebElement element) {
		 element.click();
	}
	
	//Is_Enable
	public static void isEnabled(WebElement element) {
		element.isEnabled();
	}
	
	//Is_Displayed
	public static void isDisplayed(WebElement element) {
		element.isDisplayed();
	}
	
	//Is_Selected
	public static void isSelected(WebElement element) {
		element.isSelected();
	}
	
	//Get_Options
	public static void getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
			System.out.println(x.getText());
		}
	}
	
	//Get_Title
	public static void getTitle() {
		driver.getTitle();
	}
	
	//Get_Current_URL
	public static void getCurrentUrl() {
		driver.getCurrentUrl();
	}
	
	//Get_Text
	public static void getText(WebElement element) {
		element.getText();
	}
	
	//Get_Attribute
	public static void getAttribute(WebElement element,String value) {
		element.getAttribute(value);
	}
	
	//Is_Multiple
	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		s.isMultiple();
	}
	
	//Get All Selected Option
	public static void getAllSelectedOption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	}
	
	//Get First Selected Option
	public static void getFirstSelectedOption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
	}
	
	//Click
	public static void click(WebElement element) {
		element.click();
	}
	
	//TakeScreenShot
	public static void takeScreenshot(String filename) throws IOException {
		TakesScreenshot ts =(TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File desFile =new File(".\\Screenshot\\"+filename+".png");
		FileUtils.copyFile(srcFile, desFile);
	}
	
	//ScrollUp_Down_Axis
	public static void scrollUpDownAxis(String option,String value) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,value)");
	}
	
	//ScrollUp_Down_Element
	public static void scrollUpDownElement(String value, String element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(value);",element );
	}
	
	//Implicit Wait
	public static void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	//Explicit Wait
	public static void explicitWait(int timeout,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		//wait.until(visiblity of (element));
	}
	
	//Fluent Wait
	public static void fluentWait(int time,int timeout) {
		Wait<WebDriver> wait =  new FluentWait<WebDriver>(driver);
		//.withTimeout(time,SECONDS);
		//.pollingEvery(timeout,SECONDS);
		//.ignoring(Exception.class);
	}
	
	//RadioButton
	public static void radioButton(WebElement element) {
			element.click();
		
	}
	
	
	
}
	

