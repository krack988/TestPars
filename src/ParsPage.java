import java.util.ArrayList;

public class ParsPage {
    private String cours,str[];

    public void parsPage(ArrayList<String> stringArray){
        str=new String[stringArray.size()];
        str=stringArray.toArray(str);

        for (int i=0;i<str.length;i++){
            if (str[i].contains("USD")){
                cours=str[i+1];
            }
        }

//        for (String element:stringArray
//             ) {
//            if (element.contains("USD")){
//
//                cours=element;
//            }
//
//        }
        System.out.println(cours);
    }
}
