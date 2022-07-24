/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktap;

/**
 *
 * @author sravy
 */

import java.io.FileInputStream;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
public class Posts extends javax.swing.JFrame {

    /**
     * Creates new form Posts
     */
    String username;
    public Posts(String u) {
        this.username = u;
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

        jLayeredPane_PostsMain = new javax.swing.JLayeredPane();
        jPanel_Tabs = new javax.swing.JPanel();
        jLayeredPane_PostsSub = new javax.swing.JLayeredPane();
        jPanel_Posts = new javax.swing.JPanel();
        jButton_Home = new javax.swing.JButton();
        jButton_Books = new javax.swing.JButton();
        jButton_Posts = new javax.swing.JButton();
        jButton_Trending = new javax.swing.JButton();
        jButton_Settings = new javax.swing.JButton();
        jButton_AddPost = new javax.swing.JButton();
        jButton_Profile = new javax.swing.JButton();
        jScrollPane_Posts = new javax.swing.JScrollPane();
        jPanel_Post = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POSTS");
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setSize(new java.awt.Dimension(1000, 600));

        jPanel_Tabs.setBackground(new java.awt.Color(43, 37, 56));

        jLayeredPane_PostsSub.setBackground(new java.awt.Color(17, 94, 111));

        jPanel_Posts.setBackground(new java.awt.Color(17, 94, 111));
        jPanel_Posts.setPreferredSize(new java.awt.Dimension(925, 508));

        jButton_Home.setBackground(new java.awt.Color(255, 182, 28));
        jButton_Home.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jButton_Home.setForeground(new java.awt.Color(43, 37, 56));
        jButton_Home.setText("Home");
        jButton_Home.setBorder(null);
        jButton_Home.setFocusPainted(false);
        jButton_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HomeActionPerformed(evt);
            }
        });

        jButton_Books.setBackground(new java.awt.Color(255, 182, 28));
        jButton_Books.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jButton_Books.setForeground(new java.awt.Color(43, 37, 56));
        jButton_Books.setText("Books");
        jButton_Books.setBorder(null);
        jButton_Books.setFocusPainted(false);
        jButton_Books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BooksActionPerformed(evt);
            }
        });

        jButton_Posts.setBackground(new java.awt.Color(255, 182, 28));
        jButton_Posts.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jButton_Posts.setForeground(new java.awt.Color(43, 37, 56));
        jButton_Posts.setText("Posts");
        jButton_Posts.setBorder(null);
        jButton_Posts.setFocusPainted(false);
        jButton_Posts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PostsActionPerformed(evt);
            }
        });

        jButton_Trending.setBackground(new java.awt.Color(255, 182, 28));
        jButton_Trending.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jButton_Trending.setForeground(new java.awt.Color(43, 37, 56));
        jButton_Trending.setText("Trending");
        jButton_Trending.setBorder(null);
        jButton_Trending.setFocusPainted(false);
        jButton_Trending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TrendingActionPerformed(evt);
            }
        });

        jButton_Settings.setBackground(new java.awt.Color(255, 182, 28));
        jButton_Settings.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jButton_Settings.setForeground(new java.awt.Color(43, 37, 56));
        jButton_Settings.setText("Settings");
        jButton_Settings.setBorder(null);
        jButton_Settings.setFocusPainted(false);
        jButton_Settings.setPreferredSize(new java.awt.Dimension(80, 35));
        jButton_Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SettingsActionPerformed(evt);
            }
        });

        jButton_AddPost.setBackground(new java.awt.Color(255, 182, 28));
        jButton_AddPost.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jButton_AddPost.setText("+ Add Post");
        jButton_AddPost.setBorder(null);
        jButton_AddPost.setFocusPainted(false);
        jButton_AddPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddPostActionPerformed(evt);
            }
        });

        jButton_Profile.setBackground(new java.awt.Color(255, 182, 28));
        jButton_Profile.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jButton_Profile.setForeground(new java.awt.Color(43, 37, 56));
        jButton_Profile.setText("Profile");
        jButton_Profile.setBorder(null);
        jButton_Profile.setFocusPainted(false);
        jButton_Profile.setPreferredSize(new java.awt.Dimension(85, 35));
        jButton_Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_PostsLayout = new javax.swing.GroupLayout(jPanel_Posts);
        jPanel_Posts.setLayout(jPanel_PostsLayout);
        jPanel_PostsLayout.setHorizontalGroup(
            jPanel_PostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PostsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Books, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Posts, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Trending, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(jButton_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PostsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_AddPost, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel_PostsLayout.setVerticalGroup(
            jPanel_PostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PostsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel_PostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Settings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_PostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Books, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Posts, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Trending, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_AddPost, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLayeredPane_PostsSub.setLayer(jPanel_Posts, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane_PostsSubLayout = new javax.swing.GroupLayout(jLayeredPane_PostsSub);
        jLayeredPane_PostsSub.setLayout(jLayeredPane_PostsSubLayout);
        jLayeredPane_PostsSubLayout.setHorizontalGroup(
            jLayeredPane_PostsSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane_PostsSubLayout.createSequentialGroup()
                .addComponent(jPanel_Posts, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );
        jLayeredPane_PostsSubLayout.setVerticalGroup(
            jLayeredPane_PostsSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane_PostsSubLayout.createSequentialGroup()
                .addComponent(jPanel_Posts, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        displayPosts();
        jPanel_Post.setBackground(new java.awt.Color(43, 37, 56));
        jPanel_Post.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane_Posts.setViewportView(jPanel_Post);

        javax.swing.GroupLayout jPanel_TabsLayout = new javax.swing.GroupLayout(jPanel_Tabs);
        jPanel_Tabs.setLayout(jPanel_TabsLayout);
        jPanel_TabsLayout.setHorizontalGroup(
            jPanel_TabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane_Posts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1125, Short.MAX_VALUE)
            .addGroup(jPanel_TabsLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLayeredPane_PostsSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_TabsLayout.setVerticalGroup(
            jPanel_TabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TabsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLayeredPane_PostsSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_Posts, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
        );

        jLayeredPane_PostsMain.setLayer(jPanel_Tabs, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane_PostsMainLayout = new javax.swing.GroupLayout(jLayeredPane_PostsMain);
        jLayeredPane_PostsMain.setLayout(jLayeredPane_PostsMainLayout);
        jLayeredPane_PostsMainLayout.setHorizontalGroup(
            jLayeredPane_PostsMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Tabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane_PostsMainLayout.setVerticalGroup(
            jLayeredPane_PostsMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Tabs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane_PostsMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane_PostsMain)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HomeActionPerformed
        // TODO add your handling code here:
        HomePage h = new HomePage(this.username);
        h.show();
        dispose();
    }//GEN-LAST:event_jButton_HomeActionPerformed

    private void jButton_AddPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddPostActionPerformed
        // TODO add your handling code here:
        AddPost a = new AddPost(this.username);
        a.show();
        dispose();
    }//GEN-LAST:event_jButton_AddPostActionPerformed

    private void jButton_TrendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TrendingActionPerformed
        // TODO add your handling code here:
        Trending t = new Trending(this.username);
        t.show();
        dispose();
    }//GEN-LAST:event_jButton_TrendingActionPerformed

    private void jButton_SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SettingsActionPerformed
        // TODO add your handling code here:
        Settings s = new Settings(this.username);
        s.show();
        dispose();
    }//GEN-LAST:event_jButton_SettingsActionPerformed

    private void jButton_ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ProfileActionPerformed
        // TODO add your handling code here:
        Profile p = new Profile(this.username);
        p.show();
        dispose();
    }//GEN-LAST:event_jButton_ProfileActionPerformed

    private void jButton_BooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BooksActionPerformed
        // TODO add your handling code here:
        BooksPage b = new BooksPage(this.username);
        b.show();
        dispose();
    }//GEN-LAST:event_jButton_BooksActionPerformed

    private void jButton_PostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PostsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_PostsActionPerformed

    public void displayPosts() {
        jPanel_Post.removeAll();
    	
        validate();
        repaint();
        jScrollPane_Posts.validate();
        //JLabel BookLabel = new JLabel();
        //BookLabel.setPreferredSize(new Dimension(100,200));
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
        	
            Connection con=DriverManager.getConnection(  
		    "jdbc:oracle:thin:@localhost:1521:xe","it175","sravya");  
  
            Statement stmt=con.createStatement(); 	
            ResultSet rs = stmt.executeQuery("SELECT * FROM POSTS ORDER BY TIME DESC");
            
            while(rs.next())  {
                JLabel BookLabel = new JLabel();
		String bookname = rs.getString(1);
		String authorName = rs.getString(2);
		String genre = rs.getString(3);
		String review = rs.getString(4);
		Float rating = rs.getFloat(5);
                String username = rs.getString(7);
                        
                Blob b = rs.getBlob(6);
                byte barr[] = b.getBytes(1,(int)b.length());
                ImageIcon icon = new ImageIcon(barr);
                java.awt.Image img = icon.getImage();
                java.awt.Image scale = img.getScaledInstance(200, 300,java.awt.Image.SCALE_SMOOTH);
                ImageIcon scaled = new ImageIcon(scale);
                BookLabel.setIcon(scaled);   
                       
		JPanel mainPanel = new JPanel();
                mainPanel.setBackground(new java.awt.Color(43,37,56));
	        JPanel PostsPanel = new javax.swing.JPanel();
                //JLabel BookLabel = new javax.swing.JLabel();
                JScrollPane SummaryScrollPane = new javax.swing.JScrollPane();
                JTextArea SummaryTextArea = new javax.swing.JTextArea();
                JLabel bookNameLabel = new javax.swing.JLabel();
                JLabel authorNameLabel = new javax.swing.JLabel();
                JLabel genreLabel = new javax.swing.JLabel();
                JLabel RatingLabel = new javax.swing.JLabel();
                JLabel ReviewLabel = new javax.swing.JLabel();
                JTextField BookTextField = new javax.swing.JTextField();
                JTextField AuthorTextField = new javax.swing.JTextField();
                JTextField GenreTextField = new javax.swing.JTextField();
                JTextField jTextField1 = new javax.swing.JTextField();
                JLabel Usernamelabel = new javax.swing.JLabel();
                JTextField usernametextfield = new javax.swing.JTextField();

                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setPreferredSize(new java.awt.Dimension(886, 345));
 
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setPreferredSize(new java.awt.Dimension(886, 345));

                PostsPanel.setBackground(new java.awt.Color(17, 94, 111));


	        //BookLabel.setIcon(new ImageIcon("C:\\Users\\srile\\Desktop\\pic.jpg")); // NOI18N

                SummaryTextArea.setBackground(new java.awt.Color(43, 37, 56));
                SummaryTextArea.setColumns(20);
                SummaryTextArea.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
                SummaryTextArea.setText(review);
                SummaryTextArea.setBorder(new EmptyBorder(5, 5, 5, 5));
                SummaryTextArea.setForeground(new java.awt.Color(255, 255, 255));
                SummaryTextArea.setLineWrap(true);
                SummaryTextArea.setRows(5);
                SummaryTextArea.setWrapStyleWord(true);
                SummaryScrollPane.setViewportView(SummaryTextArea);
                SummaryScrollPane.setBorder(null);


                bookNameLabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
                bookNameLabel.setForeground(new java.awt.Color(255, 255, 255));
                bookNameLabel.setText("Book");

                authorNameLabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
                authorNameLabel.setForeground(new java.awt.Color(255, 255, 255));
                authorNameLabel.setText("Author");

                genreLabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
                genreLabel.setForeground(new java.awt.Color(255, 255, 255));
                genreLabel.setText("Genre");

                RatingLabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
                RatingLabel.setForeground(new java.awt.Color(255, 255, 255));
                RatingLabel.setText("Rating");

                ReviewLabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
                ReviewLabel.setForeground(new java.awt.Color(255, 255, 255));
                ReviewLabel.setText("Review");

                BookTextField.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
                BookTextField.setForeground(Color.WHITE);
                BookTextField.setBackground(new java.awt.Color(43, 37, 56));
                BookTextField.setText(bookname);
                BookTextField.setBorder(new EmptyBorder(5, 5, 5, 5));

                AuthorTextField.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
                AuthorTextField.setForeground(Color.WHITE);
                AuthorTextField.setBackground(new java.awt.Color(43, 37, 56));
                AuthorTextField.setText(authorName);
                AuthorTextField.setBorder(new EmptyBorder(5, 5, 5, 5));

                GenreTextField.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
                GenreTextField.setForeground(Color.WHITE);
                GenreTextField.setBackground(new java.awt.Color(43, 37, 56));
                GenreTextField.setText(genre);
                GenreTextField.setBorder(new EmptyBorder(5, 5, 5, 5));

                jTextField1.setFont(new java.awt.Font("Malgun Gothic", 1, 37)); // NOI18N
                jTextField1.setHorizontalAlignment(JTextField.CENTER);
                jTextField1.setForeground(Color.WHITE);
                jTextField1.setBackground(new java.awt.Color(43, 37, 56));
                jTextField1.setText(rating.toString());
                jTextField1.setBorder(new EmptyBorder(5, 5, 5, 5));
                jTextField1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                    }
                });
                    
                Usernamelabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
                Usernamelabel.setForeground(new java.awt.Color(255, 255, 255));
                Usernamelabel.setText("Username");

                usernametextfield.setBackground(new java.awt.Color(43, 37, 56));
                usernametextfield.setBorder(new EmptyBorder(0, 5, 0, 0));
                usernametextfield.setFont(new java.awt.Font("Malgun Gothic", 1, 11)); // NOI18N
                usernametextfield.setForeground(new java.awt.Color(255, 255, 255));
                usernametextfield.setPreferredSize(new Dimension(285,21));
                usernametextfield.setText(username);

                javax.swing.GroupLayout PostsPanelLayout = new javax.swing.GroupLayout(PostsPanel);
                PostsPanel.setLayout(PostsPanelLayout);
                PostsPanelLayout.setHorizontalGroup(
                    PostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PostsPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(BookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(PostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ReviewLabel)
                            .addGroup(PostsPanelLayout.createSequentialGroup()
                                .addGroup(PostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bookNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(authorNameLabel)
                                    .addComponent(genreLabel)
                                    .addComponent(Usernamelabel))
                                .addGap(30, 30, 30)
                                .addGroup(PostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PostsPanelLayout.createSequentialGroup()
                                        .addGroup(PostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AuthorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(GenreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(65, 65, 65)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(usernametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PostsPanelLayout.createSequentialGroup()
                                        .addComponent(BookTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RatingLabel)
                                        .addGap(11, 11, 11))))
                            .addComponent(SummaryScrollPane))
                        .addContainerGap(44, Short.MAX_VALUE))
                );
                PostsPanelLayout.setVerticalGroup(
                    PostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PostsPanelLayout.createSequentialGroup()
                        .addContainerGap(83, Short.MAX_VALUE)
                        .addGroup(PostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PostsPanelLayout.createSequentialGroup()
                                .addGroup(PostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PostsPanelLayout.createSequentialGroup()
                                        .addGroup(PostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Usernamelabel)
                                            .addComponent(usernametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(PostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(bookNameLabel)
                                            .addComponent(BookTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(PostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(authorNameLabel)
                                            .addComponent(AuthorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(PostsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(GenreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PostsPanelLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(RatingLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ReviewLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SummaryScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BookLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                );
                mainPanel.add(PostsPanel);
                JLabel gap = new JLabel();
                gap.setBackground(Color.WHITE);
                mainPanel.add(gap);
                    jPanel_Post.add(mainPanel);
            }
        } catch (Exception e) {
        	System.out.println(e);
        }
        pack();   
        setPreferredSize(new Dimension(1000, 600));
        jPanel_Post.setBackground(new java.awt.Color(43,37,56));
        setVisible(true);
	}
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Metal".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Posts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Posts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Posts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Posts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Posts().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AddPost;
    private javax.swing.JButton jButton_Books;
    private javax.swing.JButton jButton_Home;
    private javax.swing.JButton jButton_Posts;
    private javax.swing.JButton jButton_Profile;
    private javax.swing.JButton jButton_Settings;
    private javax.swing.JButton jButton_Trending;
    private javax.swing.JLayeredPane jLayeredPane_PostsMain;
    private javax.swing.JLayeredPane jLayeredPane_PostsSub;
    private javax.swing.JPanel jPanel_Post;
    private javax.swing.JPanel jPanel_Posts;
    private javax.swing.JPanel jPanel_Tabs;
    private javax.swing.JScrollPane jScrollPane_Posts;
    // End of variables declaration//GEN-END:variables
}
