
public class Main {

    public static void main (String[] args){

        String pageUrl="http://www.nbrb.by/statistics/rates/ratesdaily.asp",str;

        GetPage obj=new GetPage();
        ParsPage ob2=new ParsPage();
        obj.getPage(pageUrl);
        System.out.println("Размер коллекции: "+obj.al.size());
        System.out.println("*****************************************");
        ob2.parsPage(obj.al);

        CoursWindow coursWindow=new CoursWindow();
        coursWindow.setVisible(true);

    }
}
