/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dr.prescription;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class cls_delete {
    cls_connection c = new cls_connection();
    PreparedStatement pst;
    
    //............DELETE MEDICINE........
    public void deleteMedicine(String _id){
        try {
            c.dbCon();
            pst = c.cn.prepareStatement("DELETE FROM tbl_medicine WHERE id = ?");
            pst.setString(1, _id);
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
    }
    
    //............DELETE PATIENT............
    public void deletePatient(String _id){
        try {
            c.dbCon();
            pst = c.cn.prepareStatement("DELETE FROM tbl_patient WHERE id = ?");
            pst.setString(1, _id);
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
    }
    
    //.........REMOVE FROM PRESCRIPTION........
    public void removeFromPrescription(String id){
        try{
            c.dbCon();
            pst = c.cn.prepareStatement("DELETE FROM tbl_prescription WHERE id = ?");
            pst.setString(1, id);
            pst.executeUpdate();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
    }
}
