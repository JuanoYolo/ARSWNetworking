import java.net.MalformedURLException;
import java.net.URL;

public class URLExplorer {

    public static void main(String[] args) {
        try {
            //http://www.infodasa.com/web/newsDetails.php?id_section=115&id=158
            URL myurl = new URL("http://www.infodasa.com/web/newsDetails.php?id_section=115&id=158");
            System.out.println("Protocol: " + myurl.getProtocol());
            System.out.println("Authority: " + myurl.getAuthority());
            System.out.println("Host: " + myurl.getHost());
            System.out.println("Port: " + myurl.getPort());
            System.out.println("Path: " + myurl.getPath());
            System.out.println("File: " + myurl.getFile());
            System.out.println("Ref: " + myurl.getRef());
            System.out.println("Query: " + myurl.getQuery());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
