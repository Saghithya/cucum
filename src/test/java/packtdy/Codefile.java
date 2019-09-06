package packtdy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Codefile {
	WebDriver driver;
	@Given("I open testme app using chrome")
	public void i_open_testme_app_using_chrome() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Desktop\\saghithya\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@Given("homepage of testme app is displayed")
	public void homepage_of_testme_app_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("click on signup button")
	public void click_on_signup_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@Given("I enter username as {string} in username field")
	public void i_enter_username_as_in_username_field(String a) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(a);
	}

	@Given("I enter firstname as {string}")
	public void i_enter_firstname_as(String b) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("firstName")).sendKeys(b);
	}

	@Given("I enter lastname as {string}")
	public void i_enter_lastname_as(String c) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("lastName")).sendKeys(c);
	}

	@Given("I enter password as {string}")
	public void i_enter_password_as(String d) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(d);
	}

	@Given("I enter {string} in confirm password field")
	public void i_enter_in_confirm_password_field(String e) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass_confirmation")).sendKeys(e);
	}

	@Given("I click on female button in gender field")
	public void i_click_on_female_button_in_gender_field() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@Given("I enter email as {string}")
	public void i_enter_email_as(String f) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("emailAddress")).sendKeys(f);
	}

	@Given("I enter mobile number as {string}")
	public void i_enter_mobile_number_as(String g) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("mobileNumber")).sendKeys(g);
	}

	@Given("I select dob as {string}")
	public void i_select_dob_as(String h) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("dob")).sendKeys(h);
	}

	@Given("I enter address as {string}")
	public void i_enter_address_as(String i) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("address")).sendKeys(i);
	}

	@Given("I select a security question")
	public void i_select_a_security_question() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("securityQuestion")).click();
		driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]/option[2]")).click();
	}

	@Given("I enter the answer for security question")
	public void i_enter_the_answer_for_security_question() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("answer")).sendKeys("black");
	}

	@Given("I click on register button")
	public void i_click_on_register_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Submit")).click();
	}

	@Then("login page is displayed")
	public void login_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	
	@Given("enter login username as {string}")
	public void enter_login_username_as(String x) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("userName")).sendKeys(x);
	}

	@Given("enter password as {string}")
	public void enter_password_as(String y) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(y);
	}

	@Then("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Login")).click();
	}
	
	@Given("user opens testme app in chrome")
	public void user_opens_testme_app_in_chrome() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Desktop\\saghithya\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@Given("user clicks on signin button")
	public void user_clicks_on_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.partialLinkText("SignIn")).click();
	}
	
	@Given("i open testme app")
	public void i_open_testme_app() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Desktop\\saghithya\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@Given("i sign in")
	public void i_sign_in() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.partialLinkText("SignIn")).click();
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
	}

	@Given("search product by typing")
	public void search_product_by_typing() {
	    // Write code here that turns the phrase above into concrete actions
		/*Actions act=new Actions(driver);
		WebElement search=driver.findElement(By.id("myInput"));
		act.keyDown(search, Keys.SHIFT).perform();
		act.sendKeys("h").pause(1000).sendKeys("e").pause(1000).sendKeys("a").pause(1000).sendKeys("d").pause(000).perform();
		act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Head')]"))).click().perform();*/
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Headphone");
		
	}

	@Given("click on find details")
	public void click_on_find_details() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input[value='FIND DETAILS']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@Given("add product to cart")
	public void add_product_to_cart() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(3) > center > a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tbody/tr/td[5]/form/input[2]")).click();
	}

	@Then("go to payment page")
	public void go_to_payment_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}





}





