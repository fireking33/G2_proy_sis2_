/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cinev;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author fband
 */
public class InterfazGestionPelis extends javax.swing.JFrame {
    
  int xMouse, yMouse;
  private String rutaImagen; 
  private Conexion conexion = new Conexion();
    Connection con = conexion.establecerConexion();
    
    /**
     * Creates new form InterfazRegPeli
     */
    public InterfazGestionPelis() {
        initComponents();
        this.setLocationRelativeTo(this);
        SetImageLabel(menulbl,"src/main/java/images/Menu75.png");
        SetImageLabel(candylbl,"src/main/java/images/Store 75.png");
        SetImageLabel(ticlbl,"src/main/java/images/Ticket75.png");
        SetImageLabel(usulbl,"src/main/java/images/User75.png");
        SetImageLabel(whatsalbl,"src/main/java/images/Whats75.png");
       cargarPeliculasEnComboBox();


    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        menuF = new javax.swing.JPanel();
        menulbl = new javax.swing.JLabel();
        ticF = new javax.swing.JPanel();
        ticlbl = new javax.swing.JLabel();
        candyF = new javax.swing.JPanel();
        candylbl = new javax.swing.JLabel();
        usuF = new javax.swing.JPanel();
        usulbl = new javax.swing.JLabel();
        whatsaF = new javax.swing.JPanel();
        whatsalbl = new javax.swing.JLabel();
        prece = new javax.swing.JPanel();
        guardar = new javax.swing.JPanel();
        cerrarlbl = new javax.swing.JLabel();
        subTituloActi = new javax.swing.JLabel();
        añadirPeliBtn = new javax.swing.JToggleButton();
        pelisComboBox = new javax.swing.JComboBox<>();
        tituloGeslbl = new javax.swing.JLabel();
        subTituloaniadir = new javax.swing.JLabel();
        actualizarBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(11, 23, 128));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(13, 20, 58));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(17, 27, 82));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuF.setBackground(new java.awt.Color(17, 27, 82));
        menuF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuFMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuFMouseExited(evt);
            }
        });

        menulbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menulbl.setForeground(new java.awt.Color(204, 204, 204));
        menulbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menulbl.setText("MENU");
        menulbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menulblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuFLayout = new javax.swing.GroupLayout(menuF);
        menuF.setLayout(menuFLayout);
        menuFLayout.setHorizontalGroup(
            menuFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuFLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menulbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menuFLayout.setVerticalGroup(
            menuFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuFLayout.createSequentialGroup()
                .addComponent(menulbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menu.add(menuF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 70));

        ticF.setBackground(new java.awt.Color(17, 27, 82));
        ticF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ticF.setPreferredSize(new java.awt.Dimension(70, 70));
        ticF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ticFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ticFMouseExited(evt);
            }
        });

        ticlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ticlbl.setForeground(new java.awt.Color(204, 204, 204));
        ticlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ticlbl.setText("VENDER");
        ticlbl.setPreferredSize(new java.awt.Dimension(70, 70));

        javax.swing.GroupLayout ticFLayout = new javax.swing.GroupLayout(ticF);
        ticF.setLayout(ticFLayout);
        ticFLayout.setHorizontalGroup(
            ticFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(ticFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ticFLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ticlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ticFLayout.setVerticalGroup(
            ticFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(ticFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ticFLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ticlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        menu.add(ticF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 70));

        candyF.setBackground(new java.awt.Color(17, 27, 82));
        candyF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        candyF.setPreferredSize(new java.awt.Dimension(70, 70));
        candyF.setRequestFocusEnabled(false);
        candyF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                candyFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                candyFMouseExited(evt);
            }
        });

        candylbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        candylbl.setForeground(new java.awt.Color(204, 204, 204));
        candylbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        candylbl.setText("CANDY");

        javax.swing.GroupLayout candyFLayout = new javax.swing.GroupLayout(candyF);
        candyF.setLayout(candyFLayout);
        candyFLayout.setHorizontalGroup(
            candyFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(candyFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(candyFLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(candylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        candyFLayout.setVerticalGroup(
            candyFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(candyFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(candyFLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(candylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        menu.add(candyF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        usuF.setBackground(new java.awt.Color(17, 27, 82));
        usuF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usuF.setPreferredSize(new java.awt.Dimension(70, 70));
        usuF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usuFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usuFMouseExited(evt);
            }
        });

        usulbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usulbl.setForeground(new java.awt.Color(204, 204, 204));
        usulbl.setText("MENU US");

        javax.swing.GroupLayout usuFLayout = new javax.swing.GroupLayout(usuF);
        usuF.setLayout(usuFLayout);
        usuFLayout.setHorizontalGroup(
            usuFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usuFLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(usulbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        usuFLayout.setVerticalGroup(
            usuFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usuFLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(usulbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menu.add(usuF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, 70));

        whatsaF.setBackground(new java.awt.Color(17, 27, 82));
        whatsaF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        whatsaF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                whatsaFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                whatsaFMouseExited(evt);
            }
        });

        whatsalbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        whatsalbl.setForeground(new java.awt.Color(204, 204, 204));
        whatsalbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whatsalbl.setText("CONTACTO");

        javax.swing.GroupLayout whatsaFLayout = new javax.swing.GroupLayout(whatsaF);
        whatsaF.setLayout(whatsaFLayout);
        whatsaFLayout.setHorizontalGroup(
            whatsaFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(whatsalbl, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        whatsaFLayout.setVerticalGroup(
            whatsaFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(whatsalbl, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        menu.add(whatsaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 70, 70));

        bg.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 500));

        prece.setBackground(new java.awt.Color(13, 20, 58));
        prece.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                preceMouseDragged(evt);
            }
        });
        prece.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                preceMousePressed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(102, 0, 102));
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarMouseExited(evt);
            }
        });

        cerrarlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cerrarlbl.setForeground(new java.awt.Color(255, 255, 255));
        cerrarlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarlbl.setText("x");

        javax.swing.GroupLayout guardarLayout = new javax.swing.GroupLayout(guardar);
        guardar.setLayout(guardarLayout);
        guardarLayout.setHorizontalGroup(
            guardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrarlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        guardarLayout.setVerticalGroup(
            guardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrarlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout preceLayout = new javax.swing.GroupLayout(prece);
        prece.setLayout(preceLayout);
        preceLayout.setHorizontalGroup(
            preceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, preceLayout.createSequentialGroup()
                .addGap(0, 691, Short.MAX_VALUE)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        preceLayout.setVerticalGroup(
            preceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(preceLayout.createSequentialGroup()
                .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(prece, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 730, -1));

        subTituloActi.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        subTituloActi.setForeground(new java.awt.Color(255, 255, 255));
        subTituloActi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTituloActi.setText("Actualizar Datos de Peliculas:");
        bg.add(subTituloActi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 370, 40));

        añadirPeliBtn.setBackground(new java.awt.Color(0, 255, 0));
        añadirPeliBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        añadirPeliBtn.setText("AÑADIR+");
        añadirPeliBtn.setToolTipText("");
        añadirPeliBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                añadirPeliBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                añadirPeliBtnMouseExited(evt);
            }
        });
        añadirPeliBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirPeliBtnActionPerformed(evt);
            }
        });
        bg.add(añadirPeliBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 160, 50));

        pelisComboBox.setBackground(new java.awt.Color(102, 0, 102));
        pelisComboBox.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        pelisComboBox.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(pelisComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 360, 40));

        tituloGeslbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloGeslbl.setForeground(new java.awt.Color(255, 255, 255));
        tituloGeslbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloGeslbl.setText("Gestion de Peliculas");
        tituloGeslbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bg.add(tituloGeslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 310, 40));

        subTituloaniadir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        subTituloaniadir.setForeground(new java.awt.Color(255, 255, 255));
        subTituloaniadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTituloaniadir.setText("Añadir Peliculas:");
        bg.add(subTituloaniadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 220, 40));

        actualizarBtn.setBackground(new java.awt.Color(0, 0, 255));
        actualizarBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        actualizarBtn.setForeground(new java.awt.Color(255, 255, 255));
        actualizarBtn.setText("ACTUALIZAR");
        actualizarBtn.setToolTipText("");
        actualizarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizarBtnMouseExited(evt);
            }
        });
        actualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBtnActionPerformed(evt);
            }
        });
        bg.add(actualizarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 200, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseEntered
       guardar.setBackground(Color.red);
    }//GEN-LAST:event_guardarMouseEntered

    private void guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseExited
        guardar.setBackground(new Color(102,0,102));
    }//GEN-LAST:event_guardarMouseExited

    private void preceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preceMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_preceMousePressed

    private void preceMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preceMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_preceMouseDragged

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked

        System.exit(0);    }//GEN-LAST:event_guardarMouseClicked

    private void menuFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFMouseEntered
        menuF.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_menuFMouseEntered

    private void menuFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFMouseExited
       menuF.setBackground(new Color(17,27,82));
    }//GEN-LAST:event_menuFMouseExited

    private void ticFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticFMouseEntered
        ticF.setBackground(new Color(153,153,255)); 
    }//GEN-LAST:event_ticFMouseEntered

    private void ticFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticFMouseExited
       ticF.setBackground(new Color(17,27,82));
    }//GEN-LAST:event_ticFMouseExited

    private void candyFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candyFMouseEntered
        candyF.setBackground(new Color(153,153,255)); 
    }//GEN-LAST:event_candyFMouseEntered

    private void candyFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candyFMouseExited
        candyF.setBackground(new Color(17,27,82));
    }//GEN-LAST:event_candyFMouseExited

    private void usuFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuFMouseEntered
        usuF.setBackground(new Color(153,153,255)); 

    }//GEN-LAST:event_usuFMouseEntered

    private void usuFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuFMouseExited
       usuF.setBackground(new Color(17,27,82)); 
    }//GEN-LAST:event_usuFMouseExited

    private void whatsaFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whatsaFMouseEntered
        whatsaF.setBackground(new Color(153,153,255)); 
    }//GEN-LAST:event_whatsaFMouseEntered

    private void whatsaFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whatsaFMouseExited
         whatsaF.setBackground(new Color(17,27,82)); 
    }//GEN-LAST:event_whatsaFMouseExited

    private void añadirPeliBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirPeliBtnActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegPeli().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_añadirPeliBtnActionPerformed

    private void añadirPeliBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirPeliBtnMouseEntered
        añadirPeliBtn.setBackground(Color.green);
    }//GEN-LAST:event_añadirPeliBtnMouseEntered

    private void añadirPeliBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirPeliBtnMouseExited
      añadirPeliBtn.setBackground(new Color(102,0,102));
    }//GEN-LAST:event_añadirPeliBtnMouseExited

    private void actualizarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarBtnMouseEntered
        actualizarBtn.setBackground(Color.blue);
    }//GEN-LAST:event_actualizarBtnMouseEntered

    private void actualizarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarBtnMouseExited
        actualizarBtn.setBackground(new Color(102,0,102));
    }//GEN-LAST:event_actualizarBtnMouseExited

    private void actualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBtnActionPerformed
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAcTPelis().setVisible(true);
            }
        });
         this.setVisible(false);
    }//GEN-LAST:event_actualizarBtnActionPerformed

    private void menuFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFMouseClicked
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAdmin().setVisible(true);
            }
        });
      this.setVisible(false);
    }//GEN-LAST:event_menuFMouseClicked

    private void menulblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menulblMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAdmin().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_menulblMouseClicked

 
     public JComboBox<String> getPelisComboBox() {
        return pelisComboBox;
    }
    
    public void cargarPeliculasEnComboBox() {
        String sql = "SELECT nombre_pelicula FROM pelicula"; // Consulta SQL para obtener los nombres de las películas

        try {
            // Verifica que la conexión no sea nula
            if (con == null || con.isClosed()) {
                JOptionPane.showMessageDialog(null, "Error: No se pudo establecer la conexión con la base de datos.");
                return;
            }

            // Preparar la consulta
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            // Limpiar el JComboBox antes de cargar nuevos datos
            pelisComboBox.removeAllItems();

            // Agregar cada película obtenida al JComboBox
            while (rs.next()) {
                pelisComboBox.addItem(rs.getString("nombre_pelicula"));
            }

            // Cerrar los recursos
            rs.close();
            pst.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar las películas: " + e.getMessage());
        }
    }
     


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
            java.util.logging.Logger.getLogger(InterfazGestionPelis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGestionPelis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGestionPelis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGestionPelis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGestionPelis().setVisible(true);
            }
        });
    }
    private void SetImageLabel(JLabel labelName, String root){
        
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton actualizarBtn;
    private javax.swing.JToggleButton añadirPeliBtn;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel candyF;
    private javax.swing.JLabel candylbl;
    private javax.swing.JLabel cerrarlbl;
    private javax.swing.JPanel guardar;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuF;
    private javax.swing.JLabel menulbl;
    private javax.swing.JComboBox<String> pelisComboBox;
    private javax.swing.JPanel prece;
    private javax.swing.JLabel subTituloActi;
    private javax.swing.JLabel subTituloaniadir;
    private javax.swing.JPanel ticF;
    private javax.swing.JLabel ticlbl;
    private javax.swing.JLabel tituloGeslbl;
    private javax.swing.JPanel usuF;
    private javax.swing.JLabel usulbl;
    private javax.swing.JPanel whatsaF;
    private javax.swing.JLabel whatsalbl;
    // End of variables declaration//GEN-END:variables
}
