package testbase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Baseclass {

	static public WebDriver driver;
    public Logger logger; // logger class and import from apache.logging.log4j
    public Properties p; // object for config properties for common values
	
	@BeforeClass
	
	@Parameters({"browser", "os"}) // pass the browser and os parameters annotation from XML
	
	public void setup(String br, String os) throws IOException, InterruptedException, URISyntaxException

	{
		//loading properties file
		
		 FileReader file=new FileReader(".//src//test//resources//config.properties");
		 p=new Properties();
		 p.load(file);
		 
		 //Loading Log4j2 file and import from apache.logging.log4j
		 logger=LogManager.getLogger(this.getClass());
		
		// Loading the execution environment(remote or local)
		
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
	{	
		
		DesiredCapabilities capabilities=new DesiredCapabilities(); //create object for DesiredCapabilities which is used to specify the os and browser you are running the tests on remotely
		
		//os
		if(os.equalsIgnoreCase("windows"))
		{
			capabilities.setPlatform(Platform.WIN11);
		}
		else if(os.equalsIgnoreCase("mac"))
		{
			capabilities.setPlatform(Platform.MAC);
		}
		else
		{
			System.out.println("No matching os..");
			return;
		}
		
		// //Launching browser remotely
		switch(br.toLowerCase())
		{
		case "chrome" : capabilities.setBrowserName("chrome"); break;
		case "edge" : capabilities.setBrowserName("MicrosoftEdge"); break;
		case "firefox" : capabilities.setBrowserName("firefox"); break;
		default: System.out.println("No matching browser.."); return;
		}
		
		driver = new RemoteWebDriver(new URI("http://localhost:4444/wd/hub").toURL(), capabilities); // we use new RemoteWebDriver whenever we run our test cases remotely and then pass hub URL and capabilities
		//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
	 }
	else if(p.getProperty("execution_env").equalsIgnoreCase("local"))
	{
		//Launching browser locally
	
		switch(br.toLowerCase()) // using switch case approach on launching the browser and converting to lowercase
		{
		case "chrome": driver=new ChromeDriver(); break; // launch chrome
		case "edge": driver=new EdgeDriver(); break; // launch edge
		case "firefox": driver=new FirefoxDriver(); break; // launch firefox
		default: System.out.println("No matching browser..."); // if non of the above, exit from the block
		   return;
		}
		  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL"));
	    driver.manage().window().maximize();
	       //Handling cookies
        driver.findElement(By.id("sp-cc-rejectall-link")).click();
	 }
 }
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	// To capture screenshots of failed test cases
	
	public String captureScreen(String tname) throws IOException 
	{

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}
	
}


	
	
		
		

	