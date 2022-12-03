/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companymanagement;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author home
 */
public class CompanyManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login l = new Login();
        l.setVisible(true);
        l.setSize(450,400);
        l.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        l.setLocationRelativeTo(null);
    }
    
}
