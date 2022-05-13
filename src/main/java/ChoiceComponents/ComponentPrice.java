package ChoiceComponents;

public class ComponentPrice {
    private String mark;
    private String model;
    private int price;

    public ComponentPrice(String mark, String model, int price) {
        this.mark = mark;
        this.model = model;
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}
