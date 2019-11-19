package Java.Collection;

import java.util.HashMap;
import java.util.Map;

public class TestArgsWords {
    private static final int ONE=1;
    public static void main(String []args){
        Map map=new HashMap();
        for (int i = 0; i < args.length; i++) {
            Integer freq=(Integer) map.get(args[i]);//此时map里面为空，所以也没有键，freq为空
            map.put(args[i],(freq==null ? ONE : freq.intValue()+1));//为空就将ONE作为值传入map内，不为空则获取int类型的freq再+1
        }
        System.out.println(map.size());
        System.out.println(map);
    }
}
//像主函数中传入args通过Edit中的Program arguments进行传参