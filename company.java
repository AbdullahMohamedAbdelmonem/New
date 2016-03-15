/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

/**
 *
 * @author el eng
 */
public class company {

    private String name;
    private String phone;
    private String adress;

    public company() {
    }

    public company(String name, String phone, String Adress) {
        this.name = name;
        this.phone = phone;
        this.adress = Adress;
    }

    public String toString() {

        return "FMFT Pharmacy" + "\n" + "Company name : "
                + name + "\n" + "Phone :" + phone + "\n" + "adress :" + adress;

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
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return adress;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.adress = product;
    }
}
