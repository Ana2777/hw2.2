public class Flower {
    private String flowerColor;
    private String country;
    private Double cost;
    private int lifeSpan;
    private String flowerName;

    public Flower(String flowerName, String flowerColor, String country, Double cost, int lifeSpan) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()){
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;}
        if (country == null || country.isEmpty()){
            this.country = "Россия";
        } else  {
        this.country = country;}
        if (cost <=0){
            this.cost = 1.00;
        } else  {
        this.cost = cost;}
        if (lifeSpan == 0){
            this.lifeSpan = 3;
        } else {
        this.lifeSpan = lifeSpan;}
        this.flowerName = flowerName;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }
    void f(){
        System.out.println("Название " + flowerName);
        System.out.println("Цвет " + flowerColor);
        System.out.println("Страна происхождения " + country);
        System.out.println("Стоимость " + cost);
        System.out.println("Срок состояния " + lifeSpan);
        System.out.println("   ");

    }
}

