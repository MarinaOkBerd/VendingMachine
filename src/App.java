import Products.BottleOfWater;
import Products.HotDrink;
import Products.Product;
import VendingMachine.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        // создаем новый продукт
        Product item1 = new Product("Cola", 88.0);
        // добавляем в продукт цену
        item1.setPrice(98.0);
        // создаем экземпляр класса вендинг машины
        VendingMachine itemMachine = new VendingMachine(300);
        // дабавляем новые продукты
        itemMachine.addProduct(item1);
        itemMachine.addProduct(new Product("Чипсы", 80.0 ));
        itemMachine.addProduct(new Product("Шоколад", 100.0 ));
        itemMachine.addProduct(new Product("Вафли", 65.0 ));
        itemMachine.addProduct(new Product("Леденцы", 50.0 ));
        itemMachine.addProduct(new BottleOfWater("Боржоми", 160.0, 1));
        itemMachine.addProduct(new HotDrink("Tea", 75, .3, 65));
        itemMachine.addProduct(new HotDrink("Americano coffee", 190, 1.2, 90));
        itemMachine.addProduct(new HotDrink("Espresso coffee", 190, .7, 96));
        // выводим все введенные продуктов  
        for (Product prod : itemMachine.getProdAll()) {
            System.out.println(prod.toString());
        }

       
    }

}