/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymgtsystem.ui.addBook;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import librarymgtsystem.app.book.Book;
import librarymgtsystem.ui.manageBooks.manageBooks;
import static librarymgtsystem.ui.manageBooks.manageBooks.loadTable;

/**
 *
 * @author Dinith
 */
public class addBook extends javax.swing.JFrame {

    /**
     * Creates new form addBook
     */
    public addBook() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formAddMember = new javax.swing.JPanel();
        lblCategory = new javax.swing.JLabel();
        lblBookTitle = new javax.swing.JLabel();
        lblPublisher = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        tfBookTitle = new javax.swing.JTextField();
        tfPublisher = new javax.swing.JTextField();
        lblAuthor = new javax.swing.JLabel();
        tfAuthor = new javax.swing.JTextField();
        formHeader = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tfISBN = new javax.swing.JTextField();
        lblISBN = new javax.swing.JLabel();
        cmbAvailability = new javax.swing.JComboBox<>();
        lblISBN1 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        btnLogout = new javax.swing.JButton();
        bgImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formAddMember.setBackground(new java.awt.Color(204, 204, 204));
        formAddMember.setMinimumSize(new java.awt.Dimension(1080, 780));
        formAddMember.setPreferredSize(new java.awt.Dimension(1080, 780));
        formAddMember.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCategory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(153, 102, 0));
        lblCategory.setText("Category :");
        formAddMember.add(lblCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        lblBookTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBookTitle.setForeground(new java.awt.Color(153, 102, 0));
        lblBookTitle.setText("Book Title :");
        formAddMember.add(lblBookTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        lblPublisher.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPublisher.setForeground(new java.awt.Color(153, 102, 0));
        lblPublisher.setText("Publisher :");
        formAddMember.add(lblPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        btnClear.setBackground(new java.awt.Color(255, 204, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        formAddMember.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 130, 40));

        btnAdd.setBackground(new java.awt.Color(0, 204, 0));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        formAddMember.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 130, 40));

        tfBookTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfBookTitle.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfBookTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBookTitleActionPerformed(evt);
            }
        });
        formAddMember.add(tfBookTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 280, 40));

        tfPublisher.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPublisher.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        formAddMember.add(tfPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 280, 40));

        lblAuthor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAuthor.setForeground(new java.awt.Color(153, 102, 0));
        lblAuthor.setText("Author :");
        formAddMember.add(lblAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        tfAuthor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfAuthor.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        formAddMember.add(tfAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 280, 40));

        formHeader.setBackground(new java.awt.Color(153, 102, 0));

        jLabel5.setBackground(new java.awt.Color(153, 102, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("   Add a New Book");

        javax.swing.GroupLayout formHeaderLayout = new javax.swing.GroupLayout(formHeader);
        formHeader.setLayout(formHeaderLayout);
        formHeaderLayout.setHorizontalGroup(
            formHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        formHeaderLayout.setVerticalGroup(
            formHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        formAddMember.add(formHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 70));

        tfISBN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfISBN.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        formAddMember.add(tfISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 280, 40));

        lblISBN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblISBN.setForeground(new java.awt.Color(153, 102, 0));
        lblISBN.setText("Availability :");
        formAddMember.add(lblISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        cmbAvailability.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbAvailability.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Unavailable" }));
        cmbAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAvailabilityActionPerformed(evt);
            }
        });
        formAddMember.add(cmbAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 280, 40));

        lblISBN1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblISBN1.setForeground(new java.awt.Color(153, 102, 0));
        lblISBN1.setText("ISBN :");
        formAddMember.add(lblISBN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        cmbCategory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select category...", "Health & Lifestyle", "ART/architecture", "Technology", "Science fiction", "Adventure", "Romance", "Satire", "History", "Mathematics", "Business", "Travel", "Encyclopedia", "Biography", "Religion" }));
        cmbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoryActionPerformed(evt);
            }
        });
        formAddMember.add(cmbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 280, 40));

        getContentPane().add(formAddMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 570, 720));

        btnLogout.setBackground(new java.awt.Color(0, 204, 0));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 0, 0));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymgtsystem/assets/log-out.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 150, 50));

        bgImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymgtsystem/assets/home_bg.jpg"))); // NOI18N
        getContentPane().add(bgImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        tfBookTitle.setText("");
        tfISBN.setText("");
        tfAuthor.setText("");
        tfPublisher.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        String title = tfBookTitle.getText();
        String isbn = tfISBN.getText();
        String author = tfAuthor.getText();
        String publisher = tfPublisher.getText();
        String category = cmbCategory.getSelectedItem().toString();
        String availability = cmbAvailability.getSelectedItem().toString();

        if (title.equals("") || isbn.equals("") || author.equals("") || publisher.equals("") || category.equals("Select category...")) {
            JOptionPane.showMessageDialog(null, "Book details required!", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            int av;
            if (availability == "Available") {
                av = 1;
            } else {
                av = 0;
            }
            Book book = new Book(0, title, Integer.parseInt(isbn), author, publisher, category, av);

            if (!book.isValidBook()) {
                JOptionPane.showMessageDialog(null, "Book already exists!", "Alert", JOptionPane.WARNING_MESSAGE);
            } else {
                book.addBook();
                JOptionPane.showMessageDialog(null, "Book added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                loadTable();
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tfBookTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBookTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBookTitleActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void cmbAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAvailabilityActionPerformed

    private void cmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoryActionPerformed

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
            java.util.logging.Logger.getLogger(addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImg;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> cmbAvailability;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JPanel formAddMember;
    private javax.swing.JPanel formHeader;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblBookTitle;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblISBN1;
    private javax.swing.JLabel lblPublisher;
    private javax.swing.JTextField tfAuthor;
    private javax.swing.JTextField tfBookTitle;
    private javax.swing.JTextField tfISBN;
    private javax.swing.JTextField tfPublisher;
    // End of variables declaration//GEN-END:variables
}
