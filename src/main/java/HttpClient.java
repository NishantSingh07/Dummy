import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;


/*import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
 */
    public class HttpClient {
        public static void main(String[] args) {

            try {
                URL url = new URL ("https://dev.azure.com/imnishantsingh/MyProject/_apis/testplan/Plans/1/Suites/5/TestPoint?api-version=6.0-preview.2");
                String encoding = Base64.getEncoder().encodeToString(("imnishantsingh:qenzxyz7ourtgjy4aclf4chtbtos4pe2h6yewrhyxwm3y2fvewqq").getBytes(StandardCharsets.UTF_8));

                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setDoOutput(true);
                connection.setRequestProperty  ("Authorization", "Basic " + encoding);
                InputStream content = (InputStream)connection.getInputStream();
                BufferedReader in   =
                        new BufferedReader (new InputStreamReader (content));
                String line ;

                while ((line = in.readLine()) != null) {
                    System.out.println(line);

                }
            } catch(Exception e) {
                e.printStackTrace();
            }

        }

           /* HttpClient client = new HttpClient();
            HttpGet request = new HttpGet('https://dev.azure.com/imnishantsingh/MyProject/_apis/testplan/Plans/1/Suites/5/TestPoint?api-version=6.0-preview.2');
            HttpResponse response = client.execute(request);
            BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
            String line = '';
            while ((line = rd.readLine()) != null) {
                System.out.println(line);
            }
        }
    } */
}
