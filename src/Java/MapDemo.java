package Java;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String []args){/*
        Map map=new HashMap();
        Map map1=new HashMap();
        map.put("one",new Integer(1));
        map.put("two",new Integer(2));//在jdk1.5之后可以直接进行传参，会自动进行打包解包，自动将基础类型的值转换成一个对象
        map.put("three",new Integer(3));
        map1.put("A",new Integer(1));
        map1.put("B",new Integer(2));
        System.out.println(map.size());
        System.out.println(map.containsKey("one"));
        System.out.println(map1.containsValue(1));
        if(map.containsKey("two")){
            int i=((Integer)map.get("two")).intValue();
            System.out.println(i);
        }
        Map m3=new HashMap();
        Map map2=new HashMap(map);
        m3.putAll(map1);
        map2.putAll(map1);
        System.out.println(map2);
        System.out.println(m3);*/
        Map<String,Integer> map=new HashMap<String, Integer>();
        Map<String,Integer> map1=new HashMap<String, Integer>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map1.put("A",1);
        map1.put("B",2);
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.containsValue(1));
        System.out.println(map.containsKey("two"));
        if(map.containsKey("two")){
            int i=map.get("two").intValue();
            System.out.println(i);
        }
    }//使用泛型规定数据类型，简化代码
}
