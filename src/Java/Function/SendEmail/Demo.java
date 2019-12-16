package Java.Function.SendEmail;

public class Demo {
    public static void main(String []args){
        Send send=new Send();
        String user="64030931@qq.com";
        String password="luyvggpoldmubihe";
        String host="smtp.qq.com";
        String from="64030931@qq.com";
        String to="498426689@qq.com";
        String subject="tets";
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("您的验证码为1740611333");
        try{
            String res=send.sendMail(user,password,host,from,to,subject,stringBuffer.toString());
            System.out.println(res);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
