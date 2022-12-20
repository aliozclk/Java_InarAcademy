import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
    public static void main(String[] args) {
        int indexOfTest = 1 ;

        System.setProperty("webdriver.chrome.driver","C:\\Users\\alioz\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        //username,password
        String[] arr = {"Tester,test","Test2,abcd" , "Test3,Ali"};

        for (String params : arr ) {
            String[] paramsArr = params.split(",");

            String username = paramsArr[0];
            String password = paramsArr[1];

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.wikipedia.org/");
        }





    }

}
