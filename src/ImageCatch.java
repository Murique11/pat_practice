import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImageCatch {
    public static void main(String[] args) throws Exception {
        ImageCatch imageCatch = new ImageCatch();
        ArrayList<String> geturl = imageCatch.geturl(new URL("https://www.mockplus.cn/features"));
        for (String url : geturl) {
            String imageName ="D://logs//"+ url.substring(url.lastIndexOf("/")+1).replace(".png","").replace("?","_")+".png";
            InputStream inputStream = new URL(url).openStream();
            FileOutputStream fo = new FileOutputStream(new File(imageName));
            byte[] bytes = new byte[8 * 1024];
            int len;
            while ((len=inputStream.read(bytes,0,bytes.length))!=-1){
                fo.write(bytes,0,len);
            }
            inputStream.close();
            fo.close();
            System.out.println(imageName);
        }
    }

    private ArrayList<String> geturl(URL url) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        ArrayList<String> strings = new ArrayList<>();
        while ((line=br.readLine())!=null){
            Matcher matcher = Pattern.compile("/images/companylogo/(.*?)[^>]*? ").matcher(line);
           while (matcher.find()){
               String s = matcher.group();
               String[] split = s.split("\" ");
               for (String s1 : split) {
                   strings.add("https://www.mockplus.cn/"+s1);
               }
           }
        }
        br.close();
        return strings;
    }
}
