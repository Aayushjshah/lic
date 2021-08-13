import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.Instant;
import java.time.ZoneId;
import java.util.regex.*;
public class DateGetter {
    DateGetter() throws Exception{
        String s1 = "12.12.2031";
        int hyphenIndex=s1.indexOf("-");
        String div;
        if(hyphenIndex==-1){
            if(s1.indexOf("\\")!=-1){
                div="/";
            }else if(s1.indexOf(".")!=-1){
                div=".";
            }else{
                div="\\";
            }
        }else{div="-";}
        String pattern ="dd1MM1yy";
        pattern = pattern.replaceAll("1", div);
        Date d1 =new SimpleDateFormat(pattern).parse(s1);
        LocalDate localDate = Instant.ofEpochMilli(d1.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localDate);
    }
    
    public static void main(String[] args){
        
        try{new DateGetter();}catch(Exception e){

        }
    }
}
