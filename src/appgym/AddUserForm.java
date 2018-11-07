package appgym;

import data.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AddUserForm extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String UID_user = "";
    String username = "";
    
    public AddUserForm(String username) {
        initComponents();
        conn = ConnectionDB.connectDB();
        this.username = username;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        name_label = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        last_name_label = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        RadioButton_1miesiac = new javax.swing.JRadioButton();
        tel_label = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        UID_label = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel1.setText("Imie");

        name_label.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name_labelKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel2.setText("Nazwisko");

        last_name_label.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                last_name_labelKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel3.setText("telefon");

        jButton1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jButton1.setText("Zapisz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel7.setText("Karnet ważny");

        buttonGroup1.add(RadioButton_1miesiac);
        RadioButton_1miesiac.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        RadioButton_1miesiac.setSelected(true);
        RadioButton_1miesiac.setText("1 miesiąc");
        RadioButton_1miesiac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadioButton_1miesiacMouseClicked(evt);
            }
        });

        try {
            tel_label.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tel_label.setText("");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel8.setText("UID");

        UID_label.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel6.setText("Zbliż kartę !");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(last_name_label)
                            .addComponent(tel_label, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(name_label, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UID_label, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(RadioButton_1miesiac)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(UID_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(last_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tel_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(RadioButton_1miesiac))
                .addGap(18, 18, 18)
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
        else if(tel_label.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "wpisz wszystkie dane!");
        }
        //istnieje możliwość rozszerzenia
        else if(!(RadioButton_1miesiac.isSelected())){
            JOptionPane.showMessageDialog(null, "wpisz wszystkie dane!");
        }
        else{
            try {
                //sprawdzenie czy dany klient czasem  już nie istanieje
                Statement st = conn.createStatement();
                //<-
                ResultSet rs = st.executeQuery("SELECT name, last_name, validity_of_membership FROM customers WHERE name= '"+ name_label.getText() +"' AND last_name='"+ last_name_label.getText() +"'");
            
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Dany klient już istnieje!");
                }
                else{   //jeżeli nie istnieje, pozwól na dodanie
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date now = new Date();
                    String strDate = dateFormat.format(now);
                    System.err.println(strDate);
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(now);
                    if(RadioButton_1miesiac.isSelected()){
                        cal.add(Calendar.MONTH, 1);
                    }
                    String validity_of_membership = dateFormat.format(cal.getTime());
                    //<-
                    String sql = "INSERT INTO `kingym`.`customers` (UID, `name`, `last_name`, `tel`, `since_when_membership`, `validity_of_membership`, `who_sold`) VALUES ('"+UID_label.getText()+"', '"+name_label.getText()+"', '"+last_name_label.getText()+"', '"+tel_label.getText()+"','"+ strDate +"' , '"+ validity_of_membership +"', '"+ username +"');";
                    
                    pst = conn.prepareStatement(sql);
                    pst.executeUpdate();        
                    JOptionPane.showMessageDialog(null, "zapisano!");
                    this.dispose();
                }                
            } catch (SQLException ex) {
                Logger.getLogger(AddUserForm.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void name_labelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_labelKeyTyped
        blockOtherChars(evt);
    }//GEN-LAST:event_name_labelKeyTyped

    private void last_name_labelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_last_name_labelKeyTyped
        blockOtherChars(evt);
    }//GEN-LAST:event_last_name_labelKeyTyped

    public void blockOtherChars(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c))) {
            evt.consume();
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        data.Read r = new data.Read();
        UID_user = r.getUID();
        UID_label.setText(UID_user);
        try{
            //sprawdzenie czy karta ta jest przypisana już do innego klienta
                Statement st = conn.createStatement();
            
                ResultSet rs = st.executeQuery("SELECT * FROM customers WHERE UID='"+ UID_label.getText() +"'");
            
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Karta jest już przypisana do innego klienta!");
                    this.dispose();
                }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void RadioButton_1miesiacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioButton_1miesiacMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButton_1miesiacMouseClicked


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
            java.util.logging.Logger.getLogger(AddUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AddUserForm().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField last_name_label;
    private javax.swing.JTextField name_label;
    private javax.swing.JFormattedTextField tel_label;
    // End of variables declaration//GEN-END:variables
}
