/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dr.prescription;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class cls_prescription {   
    cls_connection c = new cls_connection();
    PreparedStatement pst;
    ResultSet rs;
    
    //GET PATIENT INFORMATION IN PRESCRIPTION
    public void patientInfo(String key){
        try {
            c.dbCon();
            pst = c.cn.prepareStatement("SELECT *FROM tbl_patient WHERE p_Id = ?");
            pst.setString(1, key);
            rs = pst.executeQuery();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
    }
    
    //GET MEDICINE INFORMATION IN PRESCRIPTION
    public void medicineInfo(String key){
        try {
            c.dbCon();
            pst = c.cn.prepareStatement("SELECT *FROM tbl_medicine WHERE m_Name = ?");
            pst.setString(1, key);
            rs = pst.executeQuery();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }       
    }
    
    //PATIENT INFORMATION  FOR PRINTING PRESCRIPTION
    public void getPatientInfo(String patientId){
        try{
            c.dbCon();
            pst = c.cn.prepareStatement("SELECT *FROM tbl_patient WHERE p_id = ?");
            pst.setString(1, patientId);
            rs = pst.executeQuery();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
    }    
    
}
