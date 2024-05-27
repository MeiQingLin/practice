package oop01;

// 设计一个商品类(Product)，
// 拥有名称、价格、数量三个属性，实现构造方法，以方便创建该类的实例。
// 另外，需要提供一个计算商品总价的方法，
// 该方法返回该商品的总价(即价格*数量)

public class ProductTest {
    public static void main(String[] args) {
        Product p = new Product("牙膏", 10, 2);
        System.out.println("您需要支付的金额是:" + p.sumPrice(p.getPrice(), p.getAmount()));
    }
}
