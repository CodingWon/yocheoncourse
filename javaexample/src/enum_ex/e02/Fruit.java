package enum_ex.e02;

public enum Fruit {
    APPLE("빨강색",1000),BANANA("노랑색",2000),GRAPE("보라색",3000);

    String color;
    int price;

    Fruit(String color, int price){
        this.color = color;
        this.price = price;
    }


    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
