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
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Acer
 */
public class cls_view {
    cls_connection c = new cls_connection();
    PreparedStatement pst;
    ResultSet rs;
    //JTable table_medicine;
    
    //...........VIEW MECICINE....................
    public void viewMedicine(JTable table_medicine) {
        try {
            c.dbCon();
            pst = c.cn.prepareStatement("SELECT id as 'Id', m_id as 'Medicine ID',m_Name as 'Medicine Name',m_Type as 'Medicine Type',company_name as 'Company', note as 'Note', m_Advice as 'Advice' FROM tbl_medicine");
            rs = pst.executeQuery();
            table_medicine.setModel(DbUtils.resultSetToTableModel(rs));
           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
        
    }
    
    //.........VIEW MEDICINE TO PRESCRIPTION.........
    public void viewMedicineToPrescription(String key, JTable table_prescription){
        try{
            c.dbCon();
            pst = c.cn.prepareStatement("SELECT id as 'Id', m_name as 'Medicine', m_type as 'Type', m_company as 'Company', m_strength as 'Strength', m_dose as 'Dose', m_duration as 'Duration', m_instruction as 'Instruction', m_advice as 'Advice' FROM tbl_prescription WHERE patient_id =  ?");
            pst.setString(1, key);
            rs = pst.executeQuery();
            table_prescription.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error Message:"+ex);
        }
    }
    
    
    //.............VIEW PATIENT......................
    
    public void viewPatient(JTable table_patient){
        try {
            c.dbCon();
            pst = c.cn.prepareStatement("SELECT id as 'Id', p_Id as 'Patient ID', p_Name as 'Name', p_Gender as 'Gender', p_Age as 'Age', p_Gurdian as 'Gurdian', p_Phone as 'Phone', p_address as 'Address', p_email as 'Email', p_Mcomplaints as 'M.Complaints', p_Ocomplaints as 'O.Complaints', p_Blood as 'Blood', p_status as 'Status' FROM tbl_patient");
            rs = pst.executeQuery();
            table_patient.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
    }
    
    //............VIEWE USER DETAILS ON DASHBOARD.............
    public void viewUser(){
        try{
            c.dbCon();
            pst = c.cn.prepareStatement("SELECT * FROM tbl_settings ORDER BY id DESC LIMIT 1");
            rs = pst.executeQuery();
        
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
        
    }
    
    
}
