/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.gui.dashboard;

import sk.stu.fiit.gui.utils.StatistikaItem;
import java.awt.Color;
import sk.stu.fiit.app.Potulkor;
import sk.stu.fiit.app.user.Pouzivatel;
import sk.stu.fiit.app.user.Vyletnik;
import sk.stu.fiit.gui.MainWindow;
import sk.stu.fiit.gui.utils.RoundedPanel;

/**
 *
 * @author dlhyl
 */
public class StatistikyPanel extends javax.swing.JPanel {
    private final MainWindow main;
    private final Vyletnik v;
    /**
     * Creates new form RebricekPanel
     */
    public StatistikyPanel(MainWindow m) {
        this.main = m;
        this.v = (Vyletnik) m.getLoggedInPouzivatel();
        initComponents();
        
//        this.addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentShown(ComponentEvent evt) {
//                updateScreen();
//            }
//        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlTitle = new RoundedPanel(20, new Color(101, 21, 40, 180));
        lblTitle = new javax.swing.JLabel();
        pnlContent = new RoundedPanel(50, new Color(144,30,57,180));
        lblBack = new javax.swing.JLabel();
        pnlStatistika = new javax.swing.JPanel();
        pnlStatsVylety = new StatistikaItem(java.util.ResourceBundle.getBundle("sk/stu/fiit/gui/bundle").getString("VYLETY"),v.getStats().getPocetVyletov());
        pnlStatsOdznaky = new StatistikaItem(java.util.ResourceBundle.getBundle("sk/stu/fiit/gui/bundle").getString("ZISKANYCH ODZNAKOV"), v.getStats().getPocetOdznakov());
        pnlStatsPoints = new StatistikaItem(java.util.ResourceBundle.getBundle("sk/stu/fiit/gui/bundle").getString("KOMUNITNYCH BODOV"),v.getStats().getPoints());
        pnlBadgePoints = new StatistikaItem(java.util.ResourceBundle.getBundle("sk/stu/fiit/gui/bundle").getString("BODY ODZNAK"),v.getStats().getPocetBodovOdznaky());
        pnlDistance = new StatistikaItem(java.util.ResourceBundle.getBundle("sk/stu/fiit/gui/bundle").getString("PREJDENE KM"),v.getStats().getPocetKm());
        pnlSteps = new StatistikaItem(java.util.ResourceBundle.getBundle("sk/stu/fiit/gui/bundle").getString("NACHODENE KROKY"),v.getStats().getPocetKrokov());

        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        pnlTitle.setMaximumSize(new java.awt.Dimension(0, 0));
        pnlTitle.setMinimumSize(new java.awt.Dimension(0, 0));
        pnlTitle.setOpaque(false);
        pnlTitle.setPreferredSize(new java.awt.Dimension(0, 0));
        pnlTitle.setLayout(new java.awt.GridBagLayout());

        lblTitle.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 204, 204));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("sk/stu/fiit/gui/bundle"); // NOI18N
        lblTitle.setText(bundle.getString("ŠTATISTIKY")); // NOI18N
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblTitleMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        pnlTitle.add(lblTitle, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(80, 100, -1, 100);
        add(pnlTitle, gridBagConstraints);

        pnlContent.setOpaque(false);
        pnlContent.setLayout(new java.awt.GridBagLayout());

        lblBack.setBackground(new java.awt.Color(255, 255, 255));
        lblBack.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        lblBack.setForeground(new java.awt.Color(200, 200, 200));
        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sk/stu/fiit/assets/icons/previous.png"))); // NOI18N
        lblBack.setText(bundle.getString("SPÄŤ")); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBackMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 25);
        pnlContent.add(lblBack, gridBagConstraints);

        pnlStatistika.setOpaque(false);
        pnlStatistika.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        pnlStatistika.add(pnlStatsVylety, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        pnlStatistika.add(pnlStatsOdznaky, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        pnlStatistika.add(pnlStatsPoints, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        pnlStatistika.add(pnlBadgePoints, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        pnlStatistika.add(pnlDistance, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        pnlStatistika.add(pnlSteps, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(35, 25, 25, 25);
        pnlContent.add(pnlStatistika, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 100, 100);
        add(pnlContent, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseReleased
        this.main.changeDashboardScreen("cardDashboardMenu");
    }//GEN-LAST:event_lblBackMouseReleased

    private void lblTitleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTitleMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTitleMouseReleased

    private void updateScreen() {
        Pouzivatel usr = this.main.getLoggedInPouzivatel();
        Potulkor p = this.main.getPotulkor();
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBadgePoints;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlDistance;
    private javax.swing.JPanel pnlStatistika;
    private javax.swing.JPanel pnlStatsOdznaky;
    private javax.swing.JPanel pnlStatsPoints;
    private javax.swing.JPanel pnlStatsVylety;
    private javax.swing.JPanel pnlSteps;
    private javax.swing.JPanel pnlTitle;
    // End of variables declaration//GEN-END:variables
}