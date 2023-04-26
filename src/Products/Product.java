package Products;
//базовый класс продукта

public class Product {
    //наименование продукта 
    private String name;
    //цена продукта
    private Double price;
    /**
     * конструктор продукта 2 параметра
     * @param name это название продукта
     * @param price это цена продукта
     */

    public Product(String name, Double price){
        if (name == ""){
            throw new IllegalStateException(String.format("У продукта отсутствует наименование")); 
        }
        else{
        this.name = name;
        this.price = price;
        }   
    }
    /**
     * конструктор продукта 2 параметра
     * @param name это название продукта
     */
    public Product(String name){
        this.name = name;
    }
    /*получаем наименование продукта */
    public String getName(){
        return name;
    }
    /*получаем цену продукта */
    public Double getPrice(){
        return price;
    }
    /**
     * устанавливаем цену продукта
     * @param value новая цена продукта
     */
    public void setPrice(Double value){
        if (value <= 0){
            throw new IllegalStateException(String.format("Цена указана некорректно!"));
        }

    }
    /**
     * переопределение вывода продукта
     */
    @Override
    public String toString(){
        return "Product {" + "name='" + name +'\'' + ", cost=" + price + '}';
    }
}
