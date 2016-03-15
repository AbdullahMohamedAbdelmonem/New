/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

/**
 *
 * @author el eng
 */
public class order {

    date date;
    String time;
    product pro;

    public order(pharmacy.date date, String time, product pro) {
        this.date = date;
        this.time = time;
        this.pro = pro;
    }

    public String toString() {
        return "";
    }
}
