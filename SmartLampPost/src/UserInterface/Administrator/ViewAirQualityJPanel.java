/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Administrator;

import Business.AirQuality.AirIndex;
import Business.Enterprise.Enterprise;
import Business.Sensor.Sensor;
import Business.Street.Street;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Priyank
 */
public class ViewAirQualityJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    final Browser browser;
    public static final int MIN_ZOOM = 0;
    public static final int MAX_ZOOM = 21;

    /**
     * Creates new form ViewAirQualityJPanel
     */
    public ViewAirQualityJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        browser = new Browser();
        BrowserView browserView = new BrowserView(browser);
        //browser.loadURL("C:\\Users\\priya\\Desktop\\thenewboston\\FitBitCity\\map.html");
        File myFile = new File("map.html");
        System.out.println(myFile.getAbsolutePath());
        browser.loadURL(myFile.getAbsolutePath());
        mapPanel.add(browserView, BorderLayout.CENTER);
        revalidate();
        repaint();

        for (Street street : enterprise.getStreetDirectory().getStreetList()) {
            streetJComboBox.addItem(street);
        }

        enterpriseJLabel.setText(enterprise.getName());

    }

    public void refreshPerformed(ActionEvent e) {
        browser.executeJavaScript("var myLatlng = new google.maps.LatLng(42.3000, -71.8000);\n"
                + "var marker = new google.maps.Marker({\n"
                + "    position: myLatlng,\n"
                + "    map: map,\n"
                + "    title: 'Massachusetts'\n"
                + "});");
    }

    public void actionAllPerformed(ActionEvent e) {
        for (Street street : enterprise.getStreetDirectory().getStreetList()) {
            for (Sensor sensor : street.getSensorDirectory().getSensorList()) {
                String latitude = String.valueOf(sensor.getLatitude());
                String longitude = String.valueOf(sensor.getLongitude());
                int pos = sensor.getAirIndexDirectory().getAirIndexList().size();
                AirIndex airIndex = sensor.getAirIndexDirectory().getAirIndexList().get(pos - 1);
                String result = airIndex.getResult();
                browser.executeJavaScript("var myLatlng = new google.maps.LatLng(" + latitude + "," + longitude + ");\n"
                        + "var marker = new google.maps.Marker({\n"
                        + "    position: myLatlng,\n"
                        + "    map: map,\n"
                        + "    animation: google.maps.Animation.DROP,\n"
                        + "    title: '" + result + "',\n"
                        + "});");
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        Street street = (Street) streetJComboBox.getSelectedItem();
        for (Sensor sensor : street.getSensorDirectory().getSensorList()) {
            String latitude = String.valueOf(sensor.getLatitude());
            String longitude = String.valueOf(sensor.getLongitude());
            int pos = sensor.getAirIndexDirectory().getAirIndexList().size();
            AirIndex airIndex = sensor.getAirIndexDirectory().getAirIndexList().get(pos - 1);
            String result = airIndex.getResult();
            browser.executeJavaScript("var myLatlng = new google.maps.LatLng(" + latitude + "," + longitude + ");\n"
                    + "var marker = new google.maps.Marker({\n"
                    + "    position: myLatlng,\n"
                    + "    map: map,\n"
                    + "    animation: google.maps.Animation.DROP,\n"
                    + "    title: '" + result + "',\n"
                    + "});");
        }
    }

//        String latitude = String.valueOf(sensor.getLatitude());
//        String longitude = String.valueOf(sensor.getLongitude());
//        int pos = sensor.getAirIndexDirectory().getAirIndexList().size();
//        AirIndex airIndex = sensor.getAirIndexDirectory().getAirIndexList().get(pos - 1);
//        String result = airIndex.getResult();
//        browser.executeJavaScript("var myLatlng = new google.maps.LatLng("+latitude+","+longitude+");\n"
//                + "var marker = new google.maps.Marker({\n"
//                + "    position: myLatlng,\n"
//                + "    map: map,\n"
//                + "    animation: google.maps.Animation.DROP,\n"
//                + "    title: '"+result+"',\n"
//                + "});");
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        enterpriseJLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        backjButton = new javax.swing.JButton();
        mapPanel = new javax.swing.JPanel();
        streetJComboBox = new javax.swing.JComboBox();
        getLocationJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        refreshJButton = new javax.swing.JButton();
        getAllLocationJButton = new javax.swing.JButton();
        showChartJButton = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel6.setText("Air Quality");

        enterpriseJLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        enterpriseJLabel.setText("<value>");

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel7.setText("Enterprise :");

        backjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backjButton.setText("<< Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        mapPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mapPanel.setPreferredSize(new java.awt.Dimension(600, 500));
        mapPanel.setLayout(new java.awt.BorderLayout());

        getLocationJButton.setText("Get Location");
        getLocationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getLocationJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Street");

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        getAllLocationJButton.setText("Get All Locations");
        getAllLocationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAllLocationJButtonActionPerformed(evt);
            }
        });

        showChartJButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        showChartJButton.setText("Show Chart");
        showChartJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showChartJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(streetJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(getLocationJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(getAllLocationJButton)
                        .addGap(18, 18, 18)
                        .addComponent(refreshJButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(enterpriseJLabel)
                            .addGap(93, 93, 93)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(showChartJButton))
                            .addComponent(mapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(enterpriseJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(getLocationJButton)
                    .addComponent(refreshJButton)
                    .addComponent(getAllLocationJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backjButton)
                    .addComponent(showChartJButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void getLocationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getLocationJButtonActionPerformed
        Street street = (Street) streetJComboBox.getSelectedItem();
        if (street.getSensorDirectory().getSensorList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The street has no sensors installed currently.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            actionPerformed(evt);
        }
    }//GEN-LAST:event_getLocationJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        refreshPerformed(evt);
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void getAllLocationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAllLocationJButtonActionPerformed
        Street street = (Street) streetJComboBox.getSelectedItem();
        if (street.getSensorDirectory().getSensorList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The street has no sensors installed currently.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            actionAllPerformed(evt);
        }
    }//GEN-LAST:event_getAllLocationJButtonActionPerformed

    private void showChartJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showChartJButtonActionPerformed
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        Street street = (Street) streetJComboBox.getSelectedItem();
        ChartFrame frame = null;
        if (street.getSensorDirectory().getSensorList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The street has no sensors installed currently.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            for (Sensor sensor : street.getSensorDirectory().getSensorList()) {
                for (AirIndex airIndex : sensor.getAirIndexDirectory().getAirIndexList()) {
                    dataSet.addValue(airIndex.getAirIndex(), "Air Index", airIndex.getTimeStamp());
                    dataSet.addValue(airIndex.getNitrogenDioxide(), "Nitrogen Dioxide", airIndex.getTimeStamp());
                    dataSet.addValue(airIndex.getSulphurDioxide(), "Sulphur Dioxide", airIndex.getTimeStamp());
                    dataSet.addValue(airIndex.getCarbonMonoxide(), "Carbon Monoxide", airIndex.getTimeStamp());
                    dataSet.addValue(airIndex.getParticulateMatter(), "Particulate Matter", airIndex.getTimeStamp());
                    dataSet.addValue(airIndex.getOzone(), "Ozone", airIndex.getTimeStamp());
                }
                JFreeChart chartFactory = ChartFactory.createStackedBarChart3D("AirIndex", "Timestamp", "Value", dataSet, PlotOrientation.VERTICAL, false, true, false);
                CategoryPlot plot = chartFactory.getCategoryPlot();
                plot.setRangeGridlinePaint(Color.blue);
                frame = new ChartFrame(streetJComboBox.getSelectedItem().toString(), chartFactory);                
            }
            frame.setVisible(true);
            frame.setSize(700, 420);
            frame.setLocationRelativeTo(null);
        }

    }//GEN-LAST:event_showChartJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JLabel enterpriseJLabel;
    private javax.swing.JButton getAllLocationJButton;
    private javax.swing.JButton getLocationJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel mapPanel;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton showChartJButton;
    private javax.swing.JComboBox streetJComboBox;
    // End of variables declaration//GEN-END:variables

}
