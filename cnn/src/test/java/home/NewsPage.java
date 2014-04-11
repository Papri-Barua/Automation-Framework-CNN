package home;


import CnnCommon.CnnUtility;
import org.testng.annotations.Test;

/**
 * Created by Prithul on 4/10/2014.
 */
public class NewsPage extends CnnUtility {

    @Test
    public void newsPage(){
        goToPolitics();
        typeByCss("input#hdr-search-box", randomText());
        //clickOnNews("#cnn_mtt1rgtarea .cnn_bulletbin");
    }
}
