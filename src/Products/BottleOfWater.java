package Products;
// класс для бутылок воды, наследуется от Product

public class BottleOfWater extends Product{
    // объем бутылок воды
    private int volume;
    /**
     * конструктор бутылок воды 3 параметра
     * @param name это название бутылки воды
     * @param price это цена бутылки воды
     * @param volume это объем бутылки воды
     */
    public BottleOfWater(String name, Double price, int volume){
        super(name, price);
        this.volume = volume;
    }
    /*получаем объем бутылки воды */
    public int getVolume(){
        return volume;
    }
    /**
     * устанавливаем объем бутылки воды
     * @param volume новый объем бутылки воды
     */
    public void setVolume(int volume){
        this.volume = volume;
    }
    /**
     * переопределение вывода бутылки воды
     */

    @Override
    public String toString(){
        return "Product {" + "name='" + super.getName() +'\'' + ", cost=" + 
        super.getPrice() + ", volume=" + volume + '}';
    }
}
