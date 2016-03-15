/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

/**
 *
 * @author el eng
 */
public class customer {

    private String name;
    private String phone;
    private String job;

    public customer(String name, String phone, String job) {
        this.name = name;
        this.phone = phone;
        this.job = job;
    }

    public String toString() {

        return "FMFT Pharmacy" + "\n" + "Customer name : "
                + name + "\n" + "Phone :" + phone + "\n" + "Job :" + job;

    }

    public customer() {
    }

    /**
     * @return the name
     *
     * /
     **
     * @param name the name to set
     *
     *
     * /
     **
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
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(String job) {
        this.job = job;
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

}
