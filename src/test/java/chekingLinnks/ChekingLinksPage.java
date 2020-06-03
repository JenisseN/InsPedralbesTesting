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

//Assert.assertTrue("There are broken links", checkLinksObj.chekingLinksPagLinks());
public class ChekingLinksPage {

    public WebDriver driver;

    public ChekingLinksPage(WebDriver driver) {
        this.driver = driver;
    }


    public boolean chekingLinksPagLinks() {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        String url = "";
        List<String> linksOk = new ArrayList<String>();
        List<String> linksBroken = new ArrayList<String>();

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
                    linksBroken.add(url);
                } else {
                    System.out.println("VALID LINK: --" + url);
                    linksOk.add(url);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("VALID LINKS: --"+ linksOk.size());
        System.out.println("BROKEN LINKS: --"+ linksBroken.size());
        if(linksBroken.size()>0){
            System.out.println("************************** ERROR ******************* BROKEN LINKS");
            for(int i=0; i< linksBroken.size(); i++){
                System.out.println(linksBroken.get(i));
            }
            return false;
        }else{
            return true;
        }
    }

    }


