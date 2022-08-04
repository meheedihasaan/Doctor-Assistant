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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class cls_comboFilter {
    cls_connection c = new cls_connection();
    PreparedStatement pst;
    ResultSet rs;
    
    //...........Company ComboBox Element Generate...................
    public void companyComboElement(JComboBox company_comboBox){
        try {
            
            c.dbCon();
            pst = c.cn.prepareStatement("SELECT *FROM tbl_medicine");
            rs = pst.executeQuery();
            
            while(rs.next()){
                company_comboBox.addItem(rs.getString("company_Name"));
            }
        }   
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
    }
    
    //...........Medicine ComboBox Element Generate...................
    public void medicineComboElement(JComboBox medicine_comboBox){
        try {
            
            c.dbCon();
            pst = c.cn.prepareStatement("SELECT *FROM tbl_medicine");
            rs = pst.executeQuery();
            
            while (rs.next()){
                medicine_comboBox.addItem(rs.getString("m_Name"));
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
    }
    
    
    //...........FILTER.........
    public void medicineFilter(String key){
        try {
            c.dbCon();
            pst= c.cn.prepareStatement("SELECT * From tbl_medicine WHERE company_Name = ?");
            pst.setString(1, key);
            rs = pst.executeQuery();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
    }
    
    
    
}
