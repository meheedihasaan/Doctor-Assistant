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
public class cls_insert {
    
    PreparedStatement pst = null;
    cls_connection c = new cls_connection();
    
    public void addMedicine(String medicine_id,String medicine_name,String medicine_type, String company_name, String medicine_note, String medicine_advice) {
        
        try {            
            c.dbCon();
            pst=c.cn.prepareStatement("INSERT INTO tbl_medicine(m_Id, m_Name, m_Type, company_Name, note, m_Advice)VALUES(?,?,?,?,?,?)");
            pst.setString(1, medicine_id);
            pst.setString(2, medicine_name);
            pst.setString(3, medicine_type); 
            pst.setString(4, company_name);
            pst.setString(5, medicine_note);
            pst.setString(6, medicine_advice);
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
           
    }
    
    public void addToPrescription(String patient_id, String m_name, String m_company, String m_type, String m_strength, String m_dose, String m_duration, String m_instruction, String m_advice){
        
        try{
            c.dbCon();
            pst=c.cn.prepareStatement("INSERT INTO tbl_prescription(patient_id, m_name, m_company, m_type, m_strength, m_dose, m_duration, m_instruction, m_advice)VALUES(?,?,?,?,?,?,?,?,?)");
            pst.setString(1, patient_id);
            pst.setString(2, m_name);
            pst.setString(3, m_company);
            pst.setString(4, m_type);
            pst.setString(5, m_strength);
            pst.setString(6, m_dose);
            pst.setString(7, m_duration);
            pst.setString(8, m_instruction);
            pst.setString(9, m_advice);
            pst.executeUpdate();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error Message:"+ex);
        }
        
    }
    
    public void addPatient(String patient_id, String patient_name, String patient_gen, String patient_age, String patient_gur, String patient_adds, String patient_phn, String patient_email, String patient_mComplaints, String patient_oComplaints, String patient_blood, String patient_status)
    {
        try {
            c.dbCon();
            pst = c.cn.prepareStatement("INSERT INTO tbl_patient(p_Id, p_Name,p_Gender, p_Age, p_Gurdian, p_Address, p_Phone, p_Email, p_Mcomplaints, p_Ocomplaints,p_Blood, p_Status)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, patient_id );
            pst.setString(2, patient_name);
            pst.setString(3, patient_gen);
            pst.setString(4, patient_age);
            pst.setString(5, patient_gur);
            pst.setString(6, patient_adds);
            pst.setString(7, patient_phn);
            pst.setString(8, patient_email);
            pst.setString(9, patient_mComplaints);
            pst.setString(10, patient_oComplaints);
            pst.setString(11, patient_blood);
            pst.setString(12, patient_status);
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
       
       
    }
    
//    public void addRules(String nid, String note,String purpose)
//    {
//        try {
//            c.dbCon();
//            pst = c.cn.prepareStatement("INSERT INTO tbl_others(note_Id, note, purpose)VALUES(?,?,?)");
//            pst.setString(1, nid);
//            pst.setString(2, note);
//            pst.setString(3, purpose);
//            pst.executeUpdate();
//            
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
//        }
//       
//    }
    
    public void addUser(String hospitalName, String hospitalAddress, String hospitalDistrict, String doctorName, String doctorDesignation, String doctorQual1, String doctorQual2, String doctorTime, String doctorPhone, String doctorEmail){
        
        try{
            c.dbCon();
            pst = c.cn.prepareStatement("INSERT INTO tbl_settings(hospitalName, hospitalAddress, hospitalDistrict, doctorName, doctorDesignation, doctorQual1, doctorQual2, doctorTime, doctorPhone, doctorEmail)VALUES(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, hospitalName);
            pst.setString(2, hospitalAddress);
            pst.setString(3, hospitalDistrict);
            pst.setString(4, doctorName);
            pst.setString(5, doctorDesignation);
            pst.setString(6, doctorQual1);
            pst.setString(7, doctorQual2);
            pst.setString(8, doctorTime);
            pst.setString(9, doctorPhone);
            pst.setString(10, doctorEmail);
            
            pst.executeUpdate();
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
        
    }
}

