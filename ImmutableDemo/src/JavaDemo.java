import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaDemo {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //1.创建一个普通的Map集合
        hm.put("张三","南京");
        hm.put("李四","北京");
        hm.put("王五","上海");
        hm.put("赵六","北京");
        hm.put("孙七","深圳");
        hm.put("周八","杭州");
        hm.put("吴九","宁波");
        hm.put("郑十","苏州");
        hm.put("刘一","无锡");
        hm.put("陈二","嘉兴");
        hm.put("aaa","111");
        Map<String, String> map = Map.copyOf(hm);
    }
}
