

package scrapeddata;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;


public class ScrapedData {

 
    public static void main(String[] args) throws IOException {
        
        org.jsoup.nodes.Document document = Jsoup.connect("http://www.siu.edu.bd").get();
        String title = document.title();
        System.out.println("Title: "+ title);
        
        System.out.println(document.toString());
        
        Elements links = document.select("a[href]");
        for(org.jsoup.nodes.Element link : links)
        {
            System.out.println("\nText: "+link.text());
            System.out.println("Link : "+link.attr("href"));
        }
        
        

    }
    
}
