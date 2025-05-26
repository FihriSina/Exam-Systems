//Frame 'i undecorated yaptım yani yukarıdaki eksi kare çarpı gözükmüyor.
//MenuBar (File,edit)kullandım. Soru üzerinde işlem, oturum kapama, çıkış ve sonuç özellikleri üzerinde kullandım.
//MenuBar' lar(hepsi için) arasında margin(properties)ayarladım.(Barlar arası uzaklık 0 5 0 30)
//MenuBar' a Gezinti Çubuğu başlığı atadım.
//11yaklaşan değerleri kullancağız

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class adminHome extends javax.swing.JFrame {

    public static int open = 0;//Kod satırı 125

    public adminHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setUndecorated(true);

        jMenuBar1.setBackground(new java.awt.Color(255, 0, 0));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gezinti Çubuğu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 25), new java.awt.Color(255, 0, 0))); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add new question.png"))); // NOI18N
        jMenu1.setText("Yeni Soru Ekle");
        jMenu1.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update Question.png"))); // NOI18N
        jMenu2.setText("Soruyu Güncelle");
        jMenu2.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all questions.png"))); // NOI18N
        jMenu3.setText("Tüm Sorular");
        jMenu3.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete Question.png"))); // NOI18N
        jMenu4.setText("Soruyu Sil");
        jMenu4.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all student result.png"))); // NOI18N
        jMenu5.setText("Tüm Öğrenci Sonuçları");
        jMenu5.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout.png"))); // NOI18N
        jMenu6.setText("Oturumu Kapat");
        jMenu6.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jMenu7.setText("Çıkış");
        jMenu7.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // Mouse click yapmasa idim, bazen çalışmıyordu.
        JFrame jf = new JFrame();//Yeni frame oluşturduk
        jf.setAlwaysOnTop(true);//Frame çalıştığında bir önceki frame' nin üstüne konumlanır.Bu olmaz ise saklanıyor.
        int a = JOptionPane.showConfirmDialog(jf, "Gerçekten Oturumu Kapatmak İstiyor musun?", "Emin misin ?", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new loginAdmin().setVisible(true);//loginAdmin framen i açıyor, eğer 1 dönerse.
        }
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // Mouse click yapmasa idim, bazen çalışmıyordu.
        JFrame jf = new JFrame();//Yeni frame oluşturduk
        jf.setAlwaysOnTop(true);//Frame çalıştığında bir önceki frame' nin üstüne konumlanır.Bu olmaz ise saklanıyor.
        int a = JOptionPane.showConfirmDialog(jf, "Gerçekten Uygulamadan Çıkmak İstiyor musun?", "Emin misin ?", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);//Direk olarak programı sonlandırdı.
        }

    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        //Yeni Soru Ekle frame açma
        if (open == 0) {
            new addNewQuestion().setVisible(true);
            open = 1;
        } else {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "Form Zaten Açık");
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        //Soruyu Güncelle frame açma      
        if (open == 0) {
                new updateQuestion().setVisible(true);
            open = 1;
        } else {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "Form Zaten Açık");
        
    }   
    }//GEN-LAST:event_jMenu2MouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
