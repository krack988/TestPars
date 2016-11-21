import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ParsPage {
    public static ParsPage instance;

    private Map<String,String> coursResult=new HashMap<>();
    private String coursUSD,coursEUR,coursRUB,str[],otherCours,cours;
    private Date date;
    private SimpleDateFormat format;
    private GetPage obj=new GetPage();

    public static ParsPage getInstance(){
        if (instance==null){
            instance=new ParsPage();
        }
        return instance;
    }

    private  ParsPage(){    }

    public Map<String,String> parsPage(){
        obj.getPage();
        str=new String[obj.al.size()];
        str=obj.al.toArray(str);

        for (int i=0;i<str.length;i++){
            if (str[i].contains("USD")){
                coursUSD=str[i+1].replace(" ","");
                coursResult.put("USD",coursUSD);
            }else{
                if (str[i].contains("EUR")){
                    coursEUR=str[i+1].replace(" ","");
                    coursResult.put("EUR",coursEUR);
                }else{
                    if (str[i].contains("RUB")){
                        coursRUB=str[i+1].replace(" ","");
                        coursResult.put("RUB",coursRUB);
                    }//else{
//                        if (str[i].contains(otherCours)){
//                            cours=str[i+1].replace(" ","");
//                            coursResult.put("other",cours);
//                        }
//                    }
                }
            }
        }
        date=new Date();
        format=new SimpleDateFormat("dd.MM.yyyy hh:mm");
        System.out.println("Курс доллара на "+format.format(date)+" : "+coursUSD);
        System.out.println("Курс евро на "+format.format(date)+" : "+coursEUR);
        System.out.println("Курс российского рубля на "+format.format(date)+" : "+coursRUB);
        return coursResult;
    }

    public void setCours(String otherCours){
        this.otherCours=otherCours;


    }
}
