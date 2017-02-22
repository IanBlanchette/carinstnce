/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author wes_4
 */
public class Car {

    private String make;
    private ArrayList<String> makes;
    private String model;
    private int modelyear;
    private double milage;
    private double price;
    private ArrayList<String> features;

    public Car(String make, String model, int modelyear, double milage, double price) {
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

    public int getModelyear() {
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
            this.make = make.toLowerCase();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setModelyear(int modelyear) {
        
        if ((modelyear>1900)&&(modelyear<LocalDate.now().getYear()))
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
    public String toString()
    {
        return make+","+model+","+modelyear+","+milage;
    }

    
}
