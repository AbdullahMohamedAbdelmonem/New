/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.util.HashMap;

/**
 *
 * @author el eng
 */
class product {

    private String name;
    private String description;
    private float price;
    private date date;

    public product() {

    }

    public product(String name, String description, float price, pharmacy.date date) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.date = date;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the date
     */
    public date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(date date) {
        this.date = date;
    }

    public String toString() {

        return "FMFT Pharmacy" + "\n" + "product name :" + name + "\n" + "Price :" + price
                + " L.E" + "\n" + "Description :" + description
                + "\n" + "Data :" + date.getDay() + "/" + date.getMonth() + "/" + date.getYear();

    }

}
