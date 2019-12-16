package Java.Function.SendEmail;
import javax.mail.PasswordAuthentication;
import javax.mail.Authenticator;
public class Mail extends Authenticator{
    public static String Username="";
    public static String Password="";
    public  Mail(){

    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(Username,Password);
    }
}
