import jdk.swing.interop.SwingInterOpUtils;

import java.util.regex.*;


public class Main {

    public static void main(String[] args) {


        String a;
        a = ":{ls;:LF;le;;ldm ;slfk;09JHHEFBjkemfsd~2";
        a = a.replaceAll("fk", "FK");
        StringBuilder b = new StringBuilder("ffsndl");
        String w  = a.toUpperCase();

        Pattern pattern = Pattern.compile("[a-zA-Z]|[а-яА-Я]");
        Matcher matcher = pattern.matcher(a);

        System.out.println(a.substring(matcher.start(), matcher.end()));
        System.out.println( a.equalsIgnoreCase(a));
        System.out.println(w);


    }






}
