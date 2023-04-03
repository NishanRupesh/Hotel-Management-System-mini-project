import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nishanrupesh
 */
public class customerCheckOut extends javax.swing.JFrame {

    /**
     * Creates new form customerCheckOut
     */
    public customerCheckOut() {
        initComponents();
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
        
    }
int id=0;
String Query;
String roomType;
String bed;
String roomNo;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer Check Out.png"))); // NOI18N
        jLabel1.setText("Customer Check-Out");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 38, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 38, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel2.setText("Room Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 84, -1, -1));

        jTextField1.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 81, 140, -1));

        jButton2.setBackground(new java.awt.Color(162, 74, 52));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 81, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile Number", "Nationality", "Gender", "Email", "ID Proof", "Address", "Check In Date", "Room number", "Bed", "Room Type", "Price per day"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 358, 1270, 300));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel3.setText("Customer Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 154, -1, -1));

        jTextField2.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 191, 250, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel4.setText("Check-in Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 154, -1, -1));

        jTextField3.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 191, 250, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel5.setText("Check-out date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 154, -1, -1));

        jTextField4.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 191, 250, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel6.setText("Customer Mobile Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(976, 154, -1, -1));

        jTextField5.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(976, 191, 250, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel7.setText("Price per day");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jTextField6.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 250, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel8.setText("Number of days stayed");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jTextField7.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 250, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel9.setText("Total amount to collect from customer");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, -1, -1));

        jTextField8.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 250, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 230, -1, -1));

        jTextField9.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 270, 250, -1));

        jButton3.setBackground(new java.awt.Color(162, 74, 52));
        jButton3.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Check Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jButton4.setBackground(new java.awt.Color(162, 74, 52));
        jButton4.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText(" Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gradient_all.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ResultSet rs = Select.getData("select * from customer where checkOut is NULL");
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        try {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
                
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String roomNo=jTextField1.getText();
        try {
            ResultSet rs = Select.getData("select * from customer where roomNo='"+roomNo+"' and checkout is NULL");
            if(rs.next())
            {
                jTextField1.setEditable(false);
                id= rs.getInt(1);
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(9));
                jTextField5.setText(rs.getString(3));
                jTextField6.setText(rs.getString(13));
                
                SimpleDateFormat myFormat= new SimpleDateFormat("yyyy/MM/dd");
                Calendar cal = Calendar.getInstance();
                jTextField4.setText(myFormat.format(cal.getTime()));
                String dateBeforeString = rs.getString(9);
                java.util.Date dateBefore = myFormat.parse(dateBeforeString);
                String dateAfterString = myFormat.format(cal.getTime());
                java.util.Date dateAfter = myFormat.parse(dateAfterString);
                long difference= dateAfter.getTime() - dateBefore.getTime();
                int noOfDayStay=(int)(difference)/(1000*60*60*24);
                if(noOfDayStay==0)
                    noOfDayStay=1;
                jTextField7.setText(String.valueOf(noOfDayStay));
                float price=Float.parseFloat(jTextField6.getText());
                jTextField8.setText(String.valueOf(noOfDayStay*price));
                jTextField9.setText(rs.getString(6));
                roomType= rs.getString(12);
                bed=rs.getString(11);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Room number is not booked or does not exist.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new customerCheckOut().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String name = jTextField2.getText();
        String mobileNumber = jTextField5.getText();
        String email = jTextField9.getText();
        
        String checkOut=jTextField4.getText();
        String numberOfDaysStay = jTextField7.getText();
        String totalAmount = jTextField8.getText();
        roomNo=jTextField1.getText();
        Query="update customer set numberOfDaysStay='"+numberOfDaysStay+"',totalAmount='"+totalAmount+"',checkOut='"+checkOut+"' where id='"+id+"'";
        InsertUpdateDelete.setData(Query, "");
        Query="update room set status='Not Booked'where roomNo='"+roomNo+"'";
        InsertUpdateDelete.setData(Query, "");
        String path="/Users/nishanrupesh/";
        com.itextpdf.text.Document doc= new com.itextpdf.text.Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+""+id+".pdf"));
            doc.open();
            Paragraph paragraph1 = new Paragraph("                                               HOTEL MANAGEMENT SYSTEM\n");
            doc.add(paragraph1);
            Paragraph paragraph2 = new Paragraph("****************************************************************************************************************\n");
            doc.add(paragraph2);
            Paragraph paragraph3 = new Paragraph("\tBill ID: "+id+"\n Customer Details:\n Name:"+name+"\n Mobile Number:"+mobileNumber+"\n Email:"+email+"\n");
            doc.add(paragraph3);
            doc.add(paragraph2);
            Paragraph paragraph4 = new Paragraph("\tRoom details:\n Number:"+jTextField1.getText()+"\n Type:"+roomType+"\n Bed:"+bed+"\n Price Per Day:"+jTextField6.getText()+"\n");
            doc.add(paragraph4);
            doc.add(paragraph2);
            PdfPTable tb1=new PdfPTable(4);
            tb1.addCell("Check IN Date: "+jTextField3.getText());
            tb1.addCell("Check Out Date: "+checkOut);
            tb1.addCell("No of days stayed: "+numberOfDaysStay);
            tb1.addCell("Total Amount paid: "+totalAmount);
            doc.add(tb1);
            doc.add(paragraph2);
            Paragraph paragraph5 = new Paragraph("Thank you,please visit again!");
            doc.add(paragraph5);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, email);
        }
        doc.close();
        int a =JOptionPane.showConfirmDialog(null, "Do you want to print the bill?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            File file = new File("/Users/nishanrupesh/"+id+".pdf");
            try {
                if((new File("/Users/nishanrupesh/"+id+".pdf")).exists())
                {
                       if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(file);
            } else {
                System.out.println("Awt Desktop is not supported!");
            }
//                    Process p = Runtime
//                            .getRuntime()
//                            .exec("rund1132 url.dll,FileProtocolHandler /Users/nishanrupesh/"+id+".pdf");
                }
                else
                    System.out.print("File does not exist.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, email);
            }
        }
        setVisible(false);
        new customerCheckOut().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(customerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerCheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
