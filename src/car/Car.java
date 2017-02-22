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
        this.model = model;
        setModelyear(modelyear);
        setMilage(milage);
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
        setMake(make);
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

    public String getFeatures() {
        StringBuilder sb = new StringBuilder();
        for (String feature:features){
        sb.append(feature);
        sb.append(", ");
        }

        return sb.toString();
    }

    public void setMake(String make) {
        if (makes.contains(make))
            this.make = make.toLowerCase();
        else
            throw new IllegalArgumentException("must be a vaild make");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setModelyear(int modelyear) {
        
        if ((modelyear>1900)&&(modelyear<LocalDate.now().getYear()+1))
            this.modelyear = modelyear;
        else
            throw new IllegalArgumentException("year must be between 1900 and the current date +1");
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
