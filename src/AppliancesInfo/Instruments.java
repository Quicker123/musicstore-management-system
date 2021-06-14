package AppliancesInfo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */

//A simple POJO class for the Instrument object
public class Instruments {
    //Initiating the variables with appropriate data-type for Object
    private int modelNo;
    private String name;
    private String category;
    private String brand;
    private String recommendation;
    private int discount;
    private int price;
    
    
    //Constructor for Instruments object
    public Instruments(int modelNo, String name, String category, String brand, String recommendation, int discount, int price) {
        this.modelNo = modelNo;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.recommendation = recommendation;
        this.discount = discount;
        this.price = price;
    }

    Instruments() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Getters
    public int getModelNo() {
        return modelNo;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public int getDiscount() {
        return discount;
    }

    public int getPrice() {
        return price;
    }
    
    
    //Setters
    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory (String category) {
        this.category = category;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    String[] toArray(String[] string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
