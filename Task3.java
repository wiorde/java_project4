public class Task3 {
    public static void main(String[] args) {
        Device[] devices=new Device[3];
        devices[0]=new Phone("iPhone 13",999,6.1);
        devices[1]=new Laptop("MacBook Pro",2500,16);
        devices[2]=new Phone("Samsung S21",850,6.2);
        for (Device d: devices) {
            System.out.println(d.toString());
            System.out.println("Цена со скидкой: "+d.getDiscountPrice());
        }
    }
}
class Device {
    private String name;
    private double price;
    public Device(String name,double price) {
        this.name=name;
        this.price=price;
    }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getDiscountPrice() {
        return price*0.9;
    }
    @Override
    public String toString() {
        return "Устройство: "+name+", цена: "+price;
    }
}
class Phone extends Device {
    private double screenSize;
    public Phone(String name,double price,double screenSize) {
        super(name,price);
        this.screenSize=screenSize;
    }
    @Override
    public String toString() {
        return "Телефон: "+getName()+", цена: "+getPrice()+", экран: "+screenSize+" дюймов";
    }
    @Override
    public double getDiscountPrice() {
        return getPrice()*0.8;
    }
}

class Laptop extends Device {
    private int ram;
    public Laptop(String name,double price,int ram) {
        super(name,price);
        this.ram=ram;
    }
    @Override
    public String toString() {
        return "Ноутбук: "+getName()+", цена: "+getPrice()+", ОЗУ: "+ram+" ГБ";
    }
}