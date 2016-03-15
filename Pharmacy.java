/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.util.HashMap;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author el eng
 */
public class Pharmacy {

    public static HashMap pro;
    public static HashMap comp;
    public static HashMap cust;

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        pro = new HashMap<String, product>();
        comp = new HashMap<String, company>();
        cust = new HashMap<String, customer>();
        Set<String> Keyset = pro.keySet();
        Set<String> Keyset2 = comp.keySet();
        Set<String> Keyset3 = cust.keySet();
        date d = new date();
        product a = new product("novalgin", "Mosaken Tabs", 6, d);
        pro.put(a.getName(), a);
        product B = new product("Micophellen", "UntiPyotic Tabs", 9, d);
        pro.put(B.getName(), B);
        product C = new product("Amoxil", "Antipiotic Tabs", 17, d);
        pro.put(C.getName(), C);
        product D = new product("123", "Anti piotic", 5, d);
        pro.put(D.getName(), D);
        product E = new product("Clear", "Shambo For Men", 19, d);
        pro.put(E.getName(), E);
        product F = new product("Nevia", "Cream For Women", 22, d);
        pro.put(F.getName(), F);
        company ph = new company("Pharco", "01112874719", "abdo2000024@yahoo.com");
        comp.put(ph.getName(), ph);
        company ph2 = new company("Eco", "01569536", "24 Almahalla ST");
        comp.put(ph2.getName(), ph2);
        company ph3 = new company("Phntom", "264526", "15 6 October");
        comp.put(ph3.getName(), ph3);
        company ph4 = new company("Masr", "86452233", "Industerial Region ");
        comp.put(ph4.getName(), ph4);
        company ph5 = new company("Eco", "012564556", "25 Almatareya ST");
        comp.put(ph5.getName(), ph5);
        customer C0 = new customer("Ahmed", "011163123520", "Engineer");
        cust.put(C0.getName(), C0);
        customer C1 = new customer("Ali", "011125355", "Doct");
        cust.put(C1.getName(), C1);
        customer C2 = new customer("Fady", "0111254669", "Accountant");
        cust.put(C2.getName(), C2);
        customer C3 = new customer("Menna", "0124598966", "Student");
        cust.put(C3.getName(), C3);
        for (int i = 0;; i++) {
            int choose = Integer.parseInt(JOptionPane.showInputDialog("1.Product\n2.Company\n"
                    + "3.customer"));
            if (choose == 1) {
                String s = JOptionPane.showInputDialog("Add A New Product Press: 1\n"
                        + "Search About Product press: 2\nDelete Current "
                        + "Product Press: 3\nDisplayAll Press:4");
                int in = Integer.parseInt(s);

                if (in == 1) {
                    String name = JOptionPane.showInputDialog("Please Enter Your Product Name");
                    String Description = JOptionPane.showInputDialog("Please Enter Your "
                            + "Product Description");
                    String pri = JOptionPane.showInputDialog("Please Enter Your Product Price : ");
                    float price = Float.parseFloat(pri);
                    product a2 = new product(name, Description, price, d);

                    pro.put(a2.getName(), a2);
                    JOptionPane.showMessageDialog(null, "Adding A New Product Succeded");
                } else if (in == 2) {
                    String t = JOptionPane.showInputDialog("Enter Product Name");
                    product p = Search(t);
                    JOptionPane.showMessageDialog(null, p);
                } else if (in == 3) {
                    String delete = JOptionPane.showInputDialog("Enter Name Of The Deleted Item : ");
                    product c = Search(delete);
                    if (c == null) {
                        ;
                    } else {
                        pro.remove(c.getName());
                        JOptionPane.showMessageDialog(null, "Deleting Succeded,Sir.");
                    }
                } else if (in == 4) {
                    for (String key : Keyset) {
                        JOptionPane.showMessageDialog(null, pro.get(key));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry,This is an Wrong Answer.");
                }
            } else if (choose == 2) {
                int s = Integer.parseInt(JOptionPane.showInputDialog("Add A New company Press: "
                        + "1\nSearch About company press: 2\nDisplay All Companies Press: 3\n"
                        + "For deleting item press: 4"));
                if (s == 1) {
                    String name = JOptionPane.showInputDialog("Please Enter Company Name");
                    String phone = JOptionPane.showInputDialog("Please Enter Phone :");
                    String adress = JOptionPane.showInputDialog("Please Enter Company Adress : ");
                    company request = new company(name, phone, adress);
                    comp.put(request.getName(), request);
                    JOptionPane.showMessageDialog(null, "Adding A New Company Succeded.");
                } else if (s == 2) {
                    String search = JOptionPane.showInputDialog("Enter Company Name : ");
                    company exsit = Searchcomp(search);
                    JOptionPane.showMessageDialog(null, exsit);//Why it didn't print?????????
                } else if (s == 3) {

                    for (String Key : Keyset2) {
                        JOptionPane.showMessageDialog(null, comp.get(Key));
                    }
                } else if (s == 4) {

                    String delete = JOptionPane.showInputDialog("Enter Name Of The Deleted Item : ");
                    company c = Searchcomp(delete);
                    if (c == null) {;
                    } else {
                        comp.remove(c.getName());
                        JOptionPane.showMessageDialog(null, "Deleting Succeded,Sir.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You Entered an Undefined Request.");
                }

            } else if (choose == 3) {
                int s = Integer.parseInt(JOptionPane.showInputDialog("Add A New Customer Press: "
                        + "1\nSearch About Customer press: 2\nDisplay All customer Press: 3"
                        + "\n for deleting item press: 4"));
                if (s == 1) {
                    String name = JOptionPane.showInputDialog("Please Enter Customer Name : ");
                    String phone = JOptionPane.showInputDialog("Please Enter customer Phone :");
                    String job = JOptionPane.showInputDialog("Please Enter Customer Job : ");
                    customer me = new customer(name, phone, job);
                    cust.put(me.getName(), me);
                    JOptionPane.showMessageDialog(null, "Adding A New Customer Succeded");
                } else if (s == 2) {
                    String search = JOptionPane.showInputDialog("Enter Customer Name : ");
                    customer exsit = Search_customer(search);
                    cust.get(exsit);
                    JOptionPane.showMessageDialog(null, exsit);//Why it didn't print?????????
                } else if (s == 3) {
                    for (String Key : Keyset3) {
                        JOptionPane.showMessageDialog(null, cust.get(Key));
                    }
                } else if (s == 4) {
                    String delete = JOptionPane.showInputDialog("Enter Name Of The Deleted Item : ");
                    customer c = Search_customer(delete);
                    if (c == null) {;
                    } else {
                        pro.remove(c.getName());
                        JOptionPane.showMessageDialog(null, "Deleting Succeded,Sir.");

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You Entered Undefined Request.");
                }
            }
            int inp = Integer.parseInt(JOptionPane.showInputDialog("Continue press: "
                    + "1\nPress Any No. To Exit "));
            if (inp == 1) {
                JOptionPane.showMessageDialog(null, "Welcome Again!");
            } else {
                JOptionPane.showMessageDialog(null, "Good Byee :) ! ");
                break;
            }
        }
    }

    public static product Search(String Name) {
        if (pro.get(Name) == null) {
            JOptionPane.showMessageDialog(null, "No product matchs with that name");
            return null;
        } else {
            return (product) pro.get(Name);
        }
    }

    public static company Searchcomp(String Name) {
        if (comp.get(Name) == null) {
            JOptionPane.showMessageDialog(null, "No Companies matchs with that name");
            return null;
        } else {
            return (company) comp.get(Name);
        }
    }

    public static customer Search_customer(String Name) {
        if (cust.get(Name) == null) {
            JOptionPane.showMessageDialog(null, "No customer matchs with that name");
            return null;
        } else {
            return (customer) cust.get(Name);
        }
    }
}
