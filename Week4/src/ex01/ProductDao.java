package ex01;

public abstract class ProductDao {
    abstract void insertProduct(Product temp);

    abstract void updateProduct(Product temp);

    abstract void deleteProduct(Product temp);
}
