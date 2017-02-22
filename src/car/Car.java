/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author wes_4
 */
public class Car {

    private String make;
    private ArrayList<String> makes;
    private String model;
    private LocalDate modelyear;
    private double milage;
    private double price;
    private ArrayList<String> features;

    public Car(String make, String model, LocalDate modelyear, double milage, double price) {
        this.make = make;
        this.model = model;
        this.modelyear = modelyear;
        this.milage = milage;
        this.price = price;
        features = new ArrayList<>();
        makes= new ArrayList<>();
        makes.add("honda");
        makes.add("toyota");
        makes.add("vw");
        makes.add("bmw");
        makes.add("gmc");
        makes.add("subaru");
        makes.add("ford");
        
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getModelyear() {
        return modelyear;
    }

    public double getMilage() {
        return milage;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<String> getFeatures() {
        return features;
    }

    public void setMake(String make) {
        if (makes.contains(make))
            this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setModelyear(LocalDate modelyear) {
        
        if ((modelyear.isAfter(LocalDate.of(1900, 1, 1)))&&(modelyear.isBefore(LocalDate.now())))
        this.modelyear = modelyear;
    }

    public void setMilage(double milage) {
        if (milage>=0)
            this.milage = milage;
        else
            throw new IllegalArgumentException("milage must be grater than or equal to zero");
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFeatures(ArrayList<String> features) {
        this.features = features;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
