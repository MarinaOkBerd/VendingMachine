package Products;
// класс для горячих напитков, наследуется от Product
public class HotDrink extends Product {
    // объем чашки горячего напитка
    private double cup;
    // температура горячего напитка
    private int temp;
    /**
     * конструктор горячих наптков 4 параметра
     * @param name это название горячего напитка
     * @param price это цена горячего напитка
     * @param cup объем чашки горячего напитка
     * @param temp температура горячего напитка
     */
    public HotDrink(String name, double price, double cup, int temp){
        super(name, price);
        this.cup = cup;
        this.temp = temp;
    }
    /*получаем объем горячего напитка */
    public double getCup(){
        return cup;
    }
    /**
     * устанавливаем объем горячего наптитка
     * @param cup новый объем горячего наптика 
     */
    public void setCup(int cup){
        this.cup = cup;
    }
    /*получаем температуру горячего напитка */
    public int getTemp(){
        return temp;
    }
    /**
     * устанавливаем температуру горячего наптитка
     * @param temp температуру нового горячего наптика 
     */
    public void setVolume(int temp){
        this.temp = temp;
    }
    /**
     * переопределение вывода о горячем напитке
     */
    @Override
    public String toString(){
        return "Product {" + "name='" + super.getName() +'\'' + ", cost=" + super.getPrice() + 
        ", size cup=" + cup + ", temterature=" + temp + '}';
    }
    
}
