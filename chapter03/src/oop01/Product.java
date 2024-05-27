package oop01;

// 设计一个商品类(Product)，
// 拥有名称、价格、数量三个属性，实现构造方法，以方便创建该类的实例。
// 另外，需要提供一个计算商品总价的方法，
// 该方法返回该商品的总价(即价格*数量)

public class Product {
    private String name;
    private int price;
    private int amount;
    public Product(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Product() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int sumPrice(int amount, int prince){
        return prince * amount;
    }
}
