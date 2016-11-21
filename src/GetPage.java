import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class GetPage {

    private String line=new String();
    private String pageUrl="http://www.nbrb.by/statistics/rates/ratesdaily.asp";
    ArrayList<String> al=new ArrayList<>();

    public ArrayList<String> getPage(){
        try{
            URL url=new URL(pageUrl);
            InputStreamReader input=new InputStreamReader(url.openStream());
            BufferedReader buf=new BufferedReader(input);

            while (line !=null){
                line=buf.readLine();
                al.add(line+"\n");

            }
        }catch (IOException e){
            System.out.println("Exception "+e.getMessage());
        }
        return al;
    }
}
