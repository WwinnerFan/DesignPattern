package flyweight;


/**
 * name 内部状态
 * version  外部状态
 */
public class Goods implements IGoods{


    private String name;
    private String version;

    public Goods(String name) {
        this.name = name;
    }
    @Override
    public void showGoodsPrice(String version) {
        if (version.equals("32G"))
            System.out.println("价格5199元");
        if (version.equals("128G"))
            System.out.println("价格为5999元");
    }


}
