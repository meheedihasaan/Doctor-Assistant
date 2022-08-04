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
public class cls_update {
    cls_connection c = new cls_connection();
    PreparedStatement pst;
    public void update_Medicine(String idm, String medicine_id, String medicine_name, String medicine_type, String company_name, String medicine_note, String medicine_advice){
        try {
            c.dbCon();
            pst = c.cn.prepareStatement("UPDATE tbl_medicine SET m_Id=?, m_Name=?, m_Type=?, company_Name=?, note=?, m_Advice = ? WHERE  id=?");
            pst.setString(1, medicine_id);
            pst.setString(2, medicine_name);
            pst.setString(3, medicine_type);
            pst.setString(4, company_name);
            pst.setString(5, medicine_note);
            pst.setString(6, medicine_advice);
            pst.setString(7, idm);
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
    }
    
    //...............UPDATE PATIENT...................
    public void updatePatient(String patient_id, String patient_name, String patient_gen, String patient_age, String patient_gur, String patient_adds, String patient_phn, String patient_email,String patient_mComplaints, String patient_oComplaints, String patient_blood, String patient_status, String idp){
        try {
            c.dbCon();
            pst = c.cn.prepareStatement("UPDATE tbl_patient SET p_Id = ?, p_Name = ?, p_Gender = ?, p_Age = ?, p_Gurdian = ?, p_Address = ?, p_Phone = ?, p_Email = ?, p_Mcomplaints = ?, p_Ocomplaints = ?, p_Blood = ?, p_Status = ? WHERE id = ? ");
            pst.setString(1, patient_id);
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
            pst.setString(13, idp);
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Message:" +ex);
        }
    }
}
