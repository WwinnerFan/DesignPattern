package flyweight;

public class Main {

    public static void main(String[] args) {

        Goods goods = GoodsFactory.getGoods("iphone7");
        goods.showGoodsPrice("128G");
        Goods goods1 = GoodsFactory.getGoods("iphone7");
        goods1.showGoodsPrice("32G");
    }
}
