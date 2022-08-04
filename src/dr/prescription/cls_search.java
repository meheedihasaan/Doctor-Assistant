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
public class cls_search {
    cls_connection c = new cls_connection();
    PreparedStatement pst;
    ResultSet rs;
       
    public void medicineShow(String key){
        try {
            c.dbCon();
            pst = c.cn.prepareStatement("SELECT * FROM tbl_medicine WHERE m_Id = ?");
            pst.setString(1, key);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
    }
    
    public void patientShow(String key){
        try {
            c.dbCon();
            pst = c.cn.prepareStatement("SELECT * FROM tbl_patient WHERE p_Id = ?");
            pst.setString(1, key);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
    }
    
    //*******************************************************************
    //..................SEARCH FOR PRESCRIPTION PAGE.....................
    public void p_patientShow(String key){
        try {
            c.dbCon();
            pst = c.cn.prepareStatement("SELECT * FROM tbl_patient WHERE p_Id = ?");
            pst.setString(1, key);
            rs = pst.executeQuery();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
        
    }
    //****************************END************************************
}
