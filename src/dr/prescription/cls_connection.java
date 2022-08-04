/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dr.prescription;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Acer
 */
public class cls_connection {
    public Connection cn;
    public void dbCon() throws SQLException{
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost/db_drprescription","root","");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
    }
}
