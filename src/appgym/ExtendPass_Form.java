package appgym;

import data.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ExtendPass_Form extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String username = "";
    int how_long  = 0;
    String UID_user = "";
    
    public ExtendPass_Form(String username) {
        initComponents();
        conn = ConnectionDB.connectDB();
        this.username = username;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        last_name_label = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        name_label = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        RadioButton_1miesiac = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        validity_of_membership_label = new com.toedter.calendar.JDateChooser();
        UID_label = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel1.setText("Zbliż kartę.");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel2.setText("Imie");

        last_name_label.setEditable(false);
        last_name_label.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        last_name_label.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                last_name_labelKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel3.setText("Nazwisko");

        name_label.setEditable(false);
        name_label.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        name_label.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name_labelKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel4.setText("Przedłuż na czas:");

        buttonGroup1.add(RadioButton_1miesiac);
        RadioButton_1miesiac.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        RadioButton_1miesiac.setText("1 miesiąc");
        RadioButton_1miesiac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton_1miesiacActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jButton1.setText("Zapisz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel5.setText("Karnet przedłuż od:");

        UID_label.setEditable(false);
        UID_label.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel8.setText("UID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(134, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(15, 15, 15)
                                .addComponent(UID_label))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(last_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(RadioButton_1miesiac)
                                .addGap(19, 19, 19)))
                        .addContainerGap(6, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(validity_of_membership_label, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(UID_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(last_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validity_of_membership_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButton_1miesiac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(name_label.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "wpisz wszystkie dane!");
        }
        else if(last_name_label.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "wpisz wszystkie dane!");
        }
        else if(validity_of_membership_label.getDate() == null){
            JOptionPane.showMessageDialog(null, "wpisz wszystkie dane!");
        }
        else if(!(RadioButton_1miesiac.isSelected())){
            JOptionPane.showMessageDialog(null, "wpisz wszystkie dane!");
        }
        else{
            try {
                //sprawdzenie czy dany klient czasem  już nie istanieje
                Statement st = conn.createStatement();
                //<-
                ResultSet rs = st.executeQuery("SELECT name, last_name, validity_of_membership FROM customers WHERE name= '"+name_label.getText()+"' AND last_name='"+last_name_label.getText()+"'");
            
                if(rs.next()){  //jeżeli klient istnieje
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String theData = dateFormat.format(validity_of_membership_label.getDate());
                    Date d = dateFormat.parse(theData);
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(d);
                    if(RadioButton_1miesiac.isSelected()){
                        calendar.add(Calendar.MONTH, 1);
                    }

                    String validity_of_membership = dateFormat.format(calendar.getTime());
                    //<-
                    //aktualizacja danych klienta
                    String sql = "UPDATE `kingym`.`customers` SET `since_when_membership`='"+ theData +"', `validity_of_membership`='"+ validity_of_membership +"' WHERE `name`='"+ name_label.getText() +"' AND last_name = '"+ last_name_label.getText() +"';";
                    
                    pst = conn.prepareStatement(sql);
                    pst.executeUpdate();        

                    Date now = new Date();
                    String strDate = dateFormat.format(now);
                    //<-
                    //archiwizacja zmian
                    String sqlOperacje = "INSERT INTO `kingym`.`extension_pass` (`name`, `last_name`, `date_of_operation`, `since_when_membership`, `validity_of_membership`, `how_long`, `who_sold`) VALUES ('"+ name_label.getText() +"', '"+ last_name_label.getText() +"' ,'"+ strDate +"', '"+ theData +"', '"+ validity_of_membership +"', '"+ how_long +"', '"+username+"');";
                    pst = conn.prepareStatement(sqlOperacje);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Pomyślnie przedłużono karnet dla \n"+ name_label.getText()+" "+last_name_label.getText()+"");
                    this.dispose();
                }
                else{   //jeżeli nie istnieje
                    JOptionPane.showMessageDialog(null, "Dany klient nie istnieje!");
                }                
            } catch (SQLException ex) {
                Logger.getLogger(AddUserForm.class.getName()).log(Level.SEVERE, null, ex);
            
        }   catch (ParseException ex) {
                Logger.getLogger(ExtendPass_Form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void name_labelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_labelKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_name_labelKeyTyped

    private void last_name_labelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_last_name_labelKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_last_name_labelKeyTyped

    private void RadioButton_1miesiacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton_1miesiacActionPerformed
        how_long = 1;
    }//GEN-LAST:event_RadioButton_1miesiacActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        data.Read r = new data.Read();
        UID_user = r.getUID();
        UID_label.setText(UID_user);
        try{
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM customers WHERE UID='"+ UID_label.getText() +"'");
            
            if(rs.next()){
                name_label.setText(rs.getString("name"));
                last_name_label.setText(rs.getString("last_name"));
            }
            else{
                JOptionPane.showMessageDialog(null, "Karta nie jest przypisana do żadnego klienta.");
                this.dispose();
            }
            
            } catch (SQLException ex) {
                Logger.getLogger(SearchForm.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_formWindowOpened


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
            java.util.logging.Logger.getLogger(ExtendPass_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExtendPass_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExtendPass_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExtendPass_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ExtendPass_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioButton_1miesiac;
    private javax.swing.JTextField UID_label;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField last_name_label;
    private javax.swing.JTextField name_label;
    private com.toedter.calendar.JDateChooser validity_of_membership_label;
    // End of variables declaration//GEN-END:variables
}
