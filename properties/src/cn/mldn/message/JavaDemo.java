package cn.mldn.message;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class JavaDemo {
    public static void main(String[] args) {
        Locale loc=new Locale("en","US");
        ResourceBundle resource=ResourceBundle.getBundle("cn.mldn.message.Messages",loc);
        String val= resource.getString("info");
        System.out.println(MessageFormat.format(val,"mldn",new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
    }
}
