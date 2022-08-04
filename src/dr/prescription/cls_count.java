/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dr.prescription;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class cls_count {
    
    cls_connection c = new cls_connection();
    PreparedStatement pst;
    ResultSet rs;
    
    //...........TOTAL MEDICINE COUNT.............
    public void countMedicine(JLabel lbl_total_medicine){
        try {
            
            c.dbCon();
            pst = c.cn.prepareStatement("SELECT COUNT(id) AS total FROM tbl_medicine");
            rs = pst.executeQuery();
            
            if(rs.next()){
                lbl_total_medicine.setText(rs.getString("total"));
            }
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
    }
    
    //.............TOTAL PATIENT COUNT.............
    public void countPatient(JLabel lbl_total_patient){
        try {
            
            c.dbCon();
            pst = c.cn.prepareStatement("SELECT COUNT(id) AS total FROM tbl_patient");
            rs = pst.executeQuery();
            
            if(rs.next()){
                lbl_total_patient.setText(rs.getString("total"));
            }
            
           
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
    }
    
    
}
