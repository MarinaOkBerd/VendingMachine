package VendingMachine;
import Products.Product;
import java.util.ArrayList;
import java.util.List;
//базовый класс для вендинг машины
public class VendingMachine {
    // вместимость вендинг машины
    private int volume;
    // список продуктов
    private List<Product> products;
    // список действий
    private List<String> workLog;
    /**
     * конструктор  вендинг машины 3 параметра
     * @param volume вместимость вендинг машины
     * @param products список продуктов
     * @param workLog список действий
     */
    public VendingMachine(int volume){
        this.volume = volume;
        products = new ArrayList<Product>();
        workLog = new ArrayList<String>();
    }
    // добавляем продукт с список продуктов
    public void addProduct(Product prod){
        products.add(prod);
    }
    // добавляем данные о продаже в список действий
    public void addSales(String line){
        workLog.add(line);
    }
    // получаем продукт по названию
    public Product getProdByName(String name){
        for (Product prod : products) {
            if(prod.getName().contains(name)){
                return prod;
            }
        }
        return null;
    }
    // получаем список всех продуктов
    public List<Product> getProdAll(){
        return products;
    }
}
