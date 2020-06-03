package chekingLinks;

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
    public List<WebElement> links;
    public List<String> linksOk = new ArrayList<String>();
    public List<String> linksBroken = new ArrayList<String>();
    public HttpURLConnection httpURLConnection = null;
    public int responseCode = 200; //Esto significa en general un URL Ok
    public Iterator<WebElement> it = null;
    public String url = "";

    public ChekingLinksPage(WebDriver driver) {
        this.driver = driver;
        this.links = driver.findElements(By.tagName("a"));
        this.it = links.iterator();
    }


    public void chekingLinksPagLinks() {
        while(it.hasNext()) {
            url = it.next().getAttribute("href");
            if (url == null || url.isEmpty()) {
                System.out.print(url + " urls NO esta configurado \n");
                continue;
            }
            try {
                httpURLConnection = (HttpURLConnection) (new URL(url).openConnection());
                httpURLConnection.setRequestMethod("HEAD");
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();

                if (responseCode > 400) {
                    System.out.println("ERROR LINK ROTO: --" + url);
                    linksBroken.add(url);
                } else {
                    System.out.println("LINK VALIDO: --" + url);
                    linksOk.add(url);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}

    public void brokenLinks() {
        System.out.println(" TOTAL LINKS: "+links.size());
        System.out.println(" LINKS VALIDOS: --"+ linksOk.size());
        System.out.println(" LINKS ROTOS: --"+ linksBroken.size());
        if(linksBroken.size()>0) {
            System.out.println("************************** ERROR *******************  \n -LINKS ROTOS");
            for (int i = 0; i < linksBroken.size(); i++) {
                System.out.println(linksBroken.get(i));
            }
        }
    }

}


