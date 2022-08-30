import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

def chromeDriver = new File('/Users/clandry/chromedriver/chromedriver')
System.setProperty('webdriver.chrome.driver', chromeDriver.absolutePath)

ChromeOptions options = new ChromeOptions()
options.addArguments("headless")

driver = {
    def driverInstance = new ChromeDriver()
    driverInstance
}

reportsDir = new File("target/geb-reports")
reportOnTestFailureOnly = true