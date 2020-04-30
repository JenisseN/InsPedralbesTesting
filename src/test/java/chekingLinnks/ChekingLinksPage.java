package chekingLinnks;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChekingLinksPage {

    public WebDriver driver;

    public ChekingLinksPage(WebDriver driver) {
        this.driver = driver;

        //Assert.assertTrue("There are broken links", checkLinksObj.chekingLinksPagLinks());
    }


    public boolean chekingLinksPagLinks() {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        String url = "";
        List<String> linksOK = new ArrayList<String>();
        List<String> linksRotos = new ArrayList<String>();

        HttpURLConnection httpURLConnection = null;
        int responseCode = 200;
        Iterator<WebElement> it = links.iterator();

        while(it.hasNext()) {
            url = it.next().getAttribute("href");
            if (url == null || url.isEmpty()) {
                System.out.print(url + "urls is not configure");
                continue;
            }
            try {
                httpURLConnection = (HttpURLConnection) (new URL(url).openConnection());
                httpURLConnection.setRequestMethod("Head");
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();

                if (responseCode > 400) {
                    System.out.println("ERROR BROKEN LINK: --" + url);
                    linksRotos.add(url);
                } else {
                    System.out.println("VALID LINK: --" + url);
                    linksOK.add(url);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("VALID LINKS: --"+ linksOK.size());
        System.out.println("BROKEN LINKS: --"+ linksRotos.size());
        if(linksRotos.size()>0){
            System.out.println("************************** ERROR ******************* BROKEN LINKS");
            for(int i=0; i< linksRotos.size(); i++){
                System.out.println(linksRotos.get(i));
            }
            return false;
        }else{
            return true;
        }
    }

    }


