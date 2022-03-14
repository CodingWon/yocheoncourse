package enum_ex.e02;

public class Main {
    public static void main(String[] args) {
        Fruit apple = Fruit.APPLE;
        System.out.println(apple.color);
        System.out.println(apple.price);
        apple.setColor("노란색");
        System.out.println(apple.color);

        City[] cities = new City[10];
        cities[0] = City.SEOULE;
        cities[1] = City.BUSAN;
        cities[2] = City.NEWYORK;

        System.out.println(cities[0].getCno() + " " + cities[0].accountMoney);
        System.out.println(cities[1].getCno() + " " + cities[1].accountMoney);

        for(City c : City.values()){
            System.out.println(c.getCno());
            System.out.println(c);
            System.out.println(c.accountMoney);
        }

    }
}
