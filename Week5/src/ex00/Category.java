package ex00;

import java.util.ArrayList;

public class Category extends ProductCategory{
    ArrayList<ProductCategory> list;

    public Category(int id, String name, int price) {
        super(id, name, price);
        list = new ArrayList<ProductCategory>();
    }

    @Override
    public void addProduct(ProductCategory productCategory) {
        list.add(productCategory);
    }

    @Override
    public void removeProduct(ProductCategory product) {
        if (removeProductRecursive(product) == false)
            System.out.println("존재하지 않는 카테고리입니다.");
    }

    public boolean removeProductRecursive(ProductCategory productCategory) {
        for(ProductCategory temp : list) {
            if (temp.getId() == productCategory.getId()) {
                list.remove(temp);
                return true;
            }
            else
                if (temp.removeProductRecursive(productCategory))
                    return true;
        }
        return false;
    }

    @Override
    public void displayProduct() {
        for(ProductCategory temp : list) {
            System.out.println("ID: " + temp.getId());
        }
    }

    @Override
    public int getCount() {
        int count = 0;

        for(ProductCategory temp : list) {
            count += temp.getCount();
        }
        return count;
    }

    @Override
    public String getName() {
        return list.toString();
    }

    @Override
    public int getPrice() {
        int price = 0;

        for(ProductCategory temp : list) {
            price += temp.getPrice();
        }

        return price;
    }

    @Override
    public int getId() {
        return id;
    }
}
