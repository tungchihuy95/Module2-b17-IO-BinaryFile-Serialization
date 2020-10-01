package bt_products_management_binary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryFile {  // class nay dung de luu doi duong Products
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Products> products = new ArrayList<>();
        products.add(new Products(1, "TV", "Samsung", 10000000, "LCD"));
        products.add(new Products(2, "May giat", "Toshiba", 13000000, "Cua truoc"));
        products.add(new Products(3, "Lo vi song", "Hitachi", 5000000, ""));
        products.add(new Products(4, "Ban la", "Philip", 2000000, "Hoi nuoc"));
        products.add(new Products(5, "Quat", "Asanzo", 7000000, "Khong canh"));

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("product1.txt")));
            //Ghi file
            objectOutputStream.writeObject(products);
            objectOutputStream.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("success...");
        System.exit(0);


//        ObjectInputStream objectInputStream = null;
//        try {
//           objectInputStream =  new ObjectInputStream(new FileInputStream("src/bt_products_management_binary/product1.txt"));
//
//
//            System.out.println(products.toString());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            objectInputStream.close();
//        }



    }


}
