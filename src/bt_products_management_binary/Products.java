package bt_products_management_binary;

import java.io.Serializable;

public class Products implements Serializable {
    private int id;
    private String name;
    private String brand;
    private int price;
    private String more;

    public Products() {
    }

    public Products(int id, String name, String brand, int price, String more) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.more = more;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    @Override
    public String toString() {
        return "\nProducts{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", more='" + more + '\'' +
                '}';
    }
}
