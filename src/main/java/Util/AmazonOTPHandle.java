package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonOTPHandle {
	
	
	public static final String ACCOUNT_SID = "";
	public static final String AUTH_TOKEN = "";

	public static void main(String[] args) {


		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.amazon.in");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1")));
		
		driver.findElement(By.linkText("Start here.")).click();
		driver.findElement(By.name("customerName")).sendKeys("Ravikumar");
		driver.findElement(By.id("ap_phone_number")).sendKeys("9876543210");
		//driver.findElement(By.name("secondaryLoginClaim")).sendKeys("Kumar@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Ravikumar@9999");
		driver.findElement(By.id("continue")).click();
		
	
		// get the OTP using Twilio APIs:
//		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//		String smsBody = getMessage();
//		System.out.println(smsBody);
//		String OTPNumber = smsBody.replaceAll("[^-?0-9]+", " ");
//		System.out.println(OTPNumber);
//		
//		driver.findElement(By.id("auth-pv-enter-code")).sendKeys(OTPNumber);
		
	}
	
//	public static String getMessage() {
//		return getMessages().filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND) == 0)
//				.filter(m -> m.getTo().equals("+13343734019")).map(Message::getBody).findFirst()
//				.orElseThrow(IllegalStateException::new);
//	}
//
//	private static Stream<Message> getMessages() {
//		ResourceSet<Message> messages = Message.reader(ACCOUNT_SID).read();
//		return StreamSupport.stream(messages.spliterator(), false);
//	}

}
