package home;

import base.Base;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by Prithul on 4/10/2014.
 */
public class LogIn extends Base {

    @Test
    public void test() throws InterruptedException {
        Set<String> listOfWindow = driver.getWindowHandles();
        Iterator it = listOfWindow.iterator();
        String homeWindow = driver.getWindowHandle();
        clickByXpath(".//*[@id='hdr-auth']/ul/li[2]/a");
        listOfWindow = driver.getWindowHandles();
        it = listOfWindow.iterator();
        String popUpWindow1 = (String) it.next();
        driver.switchTo().window(popUpWindow1);
        clickByCss(".cnnOvrlyBtn.cnnBtnLogIn");
        listOfWindow = driver.getWindowHandles();
        it = listOfWindow.iterator();
        String popUpWindow2 = (String) it.next();
        driver.switchTo().window(popUpWindow2);
        typeByCss("input#cnnOverlayEmail1l","barua.papri@gmail.com");
        typeByCss("input#cnnOverlayPwd","papri123");
        clickByCss(".cnnOvrlyBtn.cnnBtnLogIn");
        driver.switchTo().window(homeWindow);
        sleep(4);
    }


}
