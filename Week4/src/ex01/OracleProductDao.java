package ex01;

public class OracleProductDao extends ProductDao{
    Product product;

    public void insertProduct(Product temp) {
        product = temp;
    }

    public void updateProduct(Product temp) {
        product = temp;
    }

    public void deleteProduct(Product temp) {
        product = null;
    }
}
