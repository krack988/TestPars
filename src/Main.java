
public class Main {

    public static void main (String[] args){

        String pageUrl="http://www.nbrb.by/statistics/rates/ratesdaily.asp",str;

GetPage obj=new GetPage();
        ParsPage ob2=new ParsPage();
        obj.getPage(pageUrl);
        System.out.println(obj.al.size());
        System.out.println("*****************************************");
//        System.out.println(obj.al);
        System.out.println("!!!elemrnt 157: "+obj.al.get(157)+" !!!!");
        ob2.parsPage(obj.al);

//        System.out.println(obj.getPage(pageUrl));
//        System.out.println(new GetPage().getPage(pageUrl));
    }
}
