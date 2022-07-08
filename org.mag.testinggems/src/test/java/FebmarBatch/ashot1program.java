// ashot program 2 where am uploading the prgroam from github to eclipse - i will move clone to repository and then merge code
package FebmarBatch;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;
public class ashot1program
{
public static void main(String[] args) throws Exception
{
//Open browser and launch site(SWD)
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.co.uk");
Thread.sleep(5000);
//Get screen shot of visible area of page(SWD) - sree updating in clone repository
File f1=driver.getScreenshotAs(OutputType.FILE);
        File dest1=new File("haripriya defect on amazon screenshot.png");
        FileHandler.copy(f1,dest1);
        Thread.sleep(5000);
        //Get screenshot of complete page(Ashot) complete page
        AShot as=new AShot();
        ShootingStrategy shs=ShootingStrategies.viewportPasting(1000);
        Screenshot ss=as.shootingStrategy(shs).takeScreenshot(driver);
        File dest=new File("fullpagescreenshotjuly1"
        		+ ""
        		+ ".png");
        ImageIO.write(ss.getImage(),"PNG",dest);
        Thread.sleep(5000);
       }
}
