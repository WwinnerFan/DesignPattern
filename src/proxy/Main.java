package proxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {

        IShop me = new Me();
        IShop proxyPurchasing = new Purchasing(me);
//        proxyPurchasing.buy();

        DynamicPurchasing dynamicPurchasing = new DynamicPurchasing(me);
//        创建ClassLoader
        ClassLoader loader = me.getClass().getClassLoader();
//        创建动态代理类  三个参数 ClassLoader loader,Class<?>[] interfaces,InvocationHandler
        IShop iShop = (IShop) Proxy.newProxyInstance(loader, new Class[]{IShop.class}, dynamicPurchasing);

        iShop.buy();
    }
}
