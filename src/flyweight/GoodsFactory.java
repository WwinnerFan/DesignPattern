package flyweight;

import java.util.HashMap;
import java.util.Map;

public class GoodsFactory {

    private static Map<String, Goods> pools = new HashMap<>();

    public static Goods getGoods(String name) {

        if (pools.containsKey(name)) {
            System.out.println("使用缓存,key为" + name);
            return pools.get(name);
        } else {
            Goods goods = new Goods(name);
            pools.put(name, goods);
            System.out.println("创建商品 key为:" + name);
            return goods;
        }
    }
}
