package CnnCommon;

import base.Base;

import java.util.List;

/**
 * Created by Prithul on 4/10/2014.
 */
public class TopNews extends Base {

    public void clickOnNews(String locator){
        List<String> news = getListOfString(locator);
        for(String st:news){
            System.out.println(st);
        }
    }
}
