
package booktap;
public class WelcomeSplashScreen extends javax.swing.JFrame {

    public WelcomeSplashScreen() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Background = new javax.swing.JPanel();
        jProgressBar_LoadingBar = new javax.swing.JProgressBar();
        jLabel_Percent = new javax.swing.JLabel();
        jPanel_Heading = new javax.swing.JPanel();
        BookTapHeadingLabel = new javax.swing.JLabel();
        jLabel_BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WELCOME SCREEN");
        setSize(new java.awt.Dimension(998, 570));

        jPanel_Background.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Background.setMinimumSize(new java.awt.Dimension(998, 570));
        jPanel_Background.setPreferredSize(new java.awt.Dimension(998, 570));
        jPanel_Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBar_LoadingBar.setForeground(new java.awt.Color(139, 69, 19));
        jPanel_Background.add(jProgressBar_LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 880, 20));

        jLabel_Percent.setBackground(new java.awt.Color(255, 102, 153));
        jLabel_Percent.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel_Percent.setForeground(new java.awt.Color(255, 102, 0));
        jLabel_Percent.setText("%");
        jPanel_Background.add(jLabel_Percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 200, 90));

        jPanel_Heading.setBackground(new java.awt.Color(139, 69, 19,100));
        jPanel_Heading.setPreferredSize(new java.awt.Dimension(640, 180));

        BookTapHeadingLabel.setBackground(new java.awt.Color(0, 0, 0));
        BookTapHeadingLabel.setFont(new java.awt.Font("Malgun Gothic", 0, 100)); // NOI18N
        BookTapHeadingLabel.setText("BookTap");

        javax.swing.GroupLayout jPanel_HeadingLayout = new javax.swing.GroupLayout(jPanel_Heading);
        jPanel_Heading.setLayout(jPanel_HeadingLayout);
        jPanel_HeadingLayout.setHorizontalGroup(
            jPanel_HeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_HeadingLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(BookTapHeadingLabel)
                .addGap(103, 103, 103))
        );
        jPanel_HeadingLayout.setVerticalGroup(
            jPanel_HeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeadingLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(BookTapHeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel_Background.add(jPanel_Heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 620, -1));

        jLabel_BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Interests images/BookFlip.gif"))); // NOI18N
        jPanel_Background.add(jLabel_BackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 998, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       
        WelcomeSplashScreen mysplash=new WelcomeSplashScreen();
        mysplash.setVisible(true);
        try
        {
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(40);
                mysplash.jProgressBar_LoadingBar.setValue(i);
                mysplash.jLabel_Percent.setText(Integer.toString(i)+"%");
            }
        }catch(Exception e){
    }
        new MainOptionsScreen().setVisible(true);
        mysplash.dispose();
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookTapHeadingLabel;
    private javax.swing.JLabel jLabel_BackgroundImage;
    private javax.swing.JLabel jLabel_Percent;
    private javax.swing.JPanel jPanel_Background;
    private javax.swing.JPanel jPanel_Heading;
    private javax.swing.JProgressBar jProgressBar_LoadingBar;
    // End of variables declaration//GEN-END:variables
}
