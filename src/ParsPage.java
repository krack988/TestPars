import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ParsPage {
    private String coursUSD,coursEUR,coursRUB,str[];
    private Date date;
    private SimpleDateFormat format;

    public void parsPage(ArrayList<String> stringArray){
        str=new String[stringArray.size()];
        str=stringArray.toArray(str);

        for (int i=0;i<str.length;i++){
            if (str[i].contains("USD")){
                coursUSD=str[i+1];
            }else{
                if (str[i].contains("EUR")){
                    coursEUR=str[i+1];
                }else{
                    if (str[i].contains("RUB")){
                        coursRUB=str[i+1];
                    }
                }
            }
        }
        date=new Date();
        format=new SimpleDateFormat("dd.MM.yyyy hh:mm");
        System.out.println("Курс доллара на "+format.format(date)+" : "+coursUSD.replaceAll(" ",""));
        System.out.println("Курс евро на "+format.format(date)+" : "+coursEUR.replaceAll(" ",""));
        System.out.println("Курс российского рубля на "+format.format(date)+" : "+coursRUB.replaceAll(" ",""));


//        switch (str[i].contains())
    }
}
