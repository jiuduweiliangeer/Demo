package Java.Function.SendEmail;

public class Demo {
    public static void main(String []args){
        Send send=new Send();
        String user="64030931@qq.com";
        String password="luyvggpoldmubihe";
        String host="smtp.qq.com";
        String from="64030931@qq.com";
        String to="1157575943@qq.com";
        String subject="Father";
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("你还好看看急急急");
        try{
            String res=send.sendMail(user,password,host,from,to,subject,stringBuffer.toString());
            System.out.println(res);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
