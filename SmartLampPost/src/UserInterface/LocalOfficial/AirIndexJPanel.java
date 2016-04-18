/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LocalOfficial;

import Business.AirQuality.AirIndex;
import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LocalOfficialOrganization;
import Business.Sensor.Sensor;
import Business.Sensor.SensorDirectory;
import Business.Street.Street;
import Business.UserAccount.UserAccount;
import com.sun.prism.j2d.J2DPipeline;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RefineryUtilities;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author priyank
 */
public class AirIndexJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private LocalOfficialOrganization localOfficialOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    private SensorDirectory sensorDirectory;
    private Toolkit toolkit;
    private Timer timer;
    private long startTime = -1;
    private long duration = 1000;

    /**
     * Creates new form AirIndexJPanel
     */
    public AirIndexJPanel(JPanel userProcessContainer, UserAccount userAccount, SensorDirectory sensorDirectory, LocalOfficialOrganization localOfficialOrganization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.sensorDirectory = sensorDirectory;
        this.localOfficialOrganization = localOfficialOrganization;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;

        for (Sensor sensor : sensorDirectory.getSensorList()) {
            sensorJComboBox.addItem(sensor);
        }

        streetNameJTextField.setText(userAccount.getStreetLocation().toString());
        Sensor sensor = (Sensor) sensorJComboBox.getSelectedItem();
    }

    public float randomGenerator(float min, float max) {
        return (float) (min + Math.random() * (max - min));
    }

    public void addAirIndex() {
        Sensor sensor = (Sensor) sensorJComboBox.getSelectedItem();
        AirIndex airIndex = sensor.getAirIndexDirectory().addAirIndex();
        airIndex.setOzone(randomGenerator(0, 500));
        airIndex.setParticulateMatter(randomGenerator(0, 500));
        airIndex.setCarbonMonoxide(randomGenerator(0, 500));
        airIndex.setSulphurDioxide(randomGenerator(0, 500));
        airIndex.setNitrogenDioxide(randomGenerator(0, 500));

        Date date = new Date();
        airIndex.setTimeStamp(date);
        sensor.getAirIndexDirectory();

        float maxValue = Math.max(airIndex.getCarbonMonoxide(), Math.max(airIndex.getNitrogenDioxide(), Math.max(airIndex.getOzone(), Math.max(airIndex.getParticulateMatter(), airIndex.getSulphurDioxide()))));
        airIndex.setAirIndex((int) maxValue);
        airIndex.setResult(getResult(airIndex));
    }

    String getResult(AirIndex airIndex) {
        String result = "N/A";
        if (airIndex.getAirIndex() >= 0 && airIndex.getAirIndex() <= 440) {
            result = "Good";
        } else if (airIndex.getAirIndex() >= 441 && airIndex.getAirIndex() <= 450) {
            result = "Moderate";
        } else if (airIndex.getAirIndex() >= 451 && airIndex.getAirIndex() <= 460) {
            result = "Unhealthy for Sensitive Groups";
        } else if (airIndex.getAirIndex() >= 461 && airIndex.getAirIndex() <= 470) {
            result = "Unhealthy";
        } else if (airIndex.getAirIndex() >= 471 && airIndex.getAirIndex() <= 480) {
            result = "Very Unhealthy";
        } else if (airIndex.getAirIndex() >= 481 && airIndex.getAirIndex() <= 490) {
            result = "Hazardous";
        } else if (airIndex.getAirIndex() >= 491 && airIndex.getAirIndex() <= 500) {
            result = "Very Hazardous";
        }
        return result;
    }

    public void populateAirIndexTable() {
        DefaultTableModel model = (DefaultTableModel) airIndexJTable.getModel();
        model.setRowCount(0);
        Sensor sensor = (Sensor) sensorJComboBox.getSelectedItem();
        for (AirIndex airIndex : sensor.getAirIndexDirectory().getAirIndexList()) {
            Object[] row = new Object[8];
            row[0] = airIndex.getAirIndex();
            row[1] = airIndex.getNitrogenDioxide();
            row[2] = airIndex.getSulphurDioxide();
            row[3] = airIndex.getCarbonMonoxide();
            row[4] = airIndex.getParticulateMatter();
            row[5] = airIndex.getOzone();
            row[6] = airIndex.getTimeStamp();
            row[7] = airIndex.getResult();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        streetNameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        airIndexJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sensorJComboBox = new javax.swing.JComboBox();
        startTimerJButton = new javax.swing.JButton();
        showChartJButton = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel3.setText("Air Index");

        streetNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        streetNameJTextField.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Street Name");

        airIndexJTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        airIndexJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Air Index", "Nitrogen Dioxide", "Sulphur Dioxide", "Carbon Monoxide", "Particulate Matter", "Ozone", "Date & Time", "Air Quality"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(airIndexJTable);

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Sensor Name");

        sensorJComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sensorJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sensorJComboBoxActionPerformed(evt);
            }
        });

        startTimerJButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        startTimerJButton.setText("Start Capturing");
        startTimerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTimerJButtonActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(354, 354, 354)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startTimerJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(showChartJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(streetNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(sensorJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(backJButton))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(streetNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(sensorJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startTimerJButton)
                    .addComponent(showChartJButton))
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void sensorJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sensorJComboBoxActionPerformed
        populateAirIndexTable();
    }//GEN-LAST:event_sensorJComboBoxActionPerformed

    private void startTimerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTimerJButtonActionPerformed
        timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (startTime < 0) {
                    startTime = System.currentTimeMillis();

                }
                startTimerJButton.setEnabled(false);
                long now = System.currentTimeMillis();
                long clockTime = now - startTime;
                if (clockTime >= duration) {
                    clockTime = duration;
                    timer.stop();

                }
                System.out.println(" " + clockTime);
                SimpleDateFormat df = new SimpleDateFormat("mm:ss:SSS");
                //jLabel5.setText(df.format(duration - clockTime));
                addAirIndex();
                populateAirIndexTable();
                startTimerJButton.setEnabled(true);
            }
        });
        if (!timer.isRunning()) {
            startTime = -1;
            timer.start();
        }
        //stopJButton.setEnabled(true);
    }//GEN-LAST:event_startTimerJButtonActionPerformed
//
//    public AirIndexJPanel(final String title) {
//        //super(title);
//        final CategoryDataset dataset = createDataset();
//        final JFreeChart chart = createChart(dataset);
//        final ChartPanel chartPanel = new ChartPanel(chart);
//        chartPanel.setPreferredSize(new Dimension(500, 270));
//        //setContentPane(chartPanel);
//    }
//
//    private CategoryDataset createDataset() {
//
//        // row keys...
//        final String series1 = "Air Index";
//        final String series2 = "Nitrogen Dioxide";
//        final String series3 = "Sulphur Dioxide";
//        final String series4 = "Carbon Monoxide";
//        final String series5 = "Particulate Matter";
//        final String series6 = "Ozone";
//
//        // column keys...
//        final String category1 = "Category 1";
//        final String category2 = "Category 2";
//        final String category3 = "Category 3";
//        final String category4 = "Category 4";
//        final String category5 = "Category 5";
//
//        // create the dataset...
//        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//
//        Sensor sensor = (Sensor) sensorJComboBox.getSelectedItem();
//        for (AirIndex airIndex : sensor.getAirIndexDirectory().getAirIndexList()) {
//
//            dataset.addValue(airIndex.getAirIndex(), series1, category1);
//            dataset.addValue(2.0, series1, category2);
//            dataset.addValue(3.0, series1, category3);
//            dataset.addValue(5.0, series1, category4);
//            dataset.addValue(5.0, series1, category5);
//
//            dataset.addValue(airIndex.getNitrogenDioxide(), series2, category1);
//            dataset.addValue(7.0, series2, category2);
//            dataset.addValue(6.0, series2, category3);
//            dataset.addValue(8.0, series2, category4);
//            dataset.addValue(4.0, series2, category5);
//
//            dataset.addValue(airIndex.getSulphurDioxide(), series3, category1);
//            dataset.addValue(3.0, series3, category2);
//            dataset.addValue(2.0, series3, category3);
//            dataset.addValue(3.0, series3, category4);
//            dataset.addValue(6.0, series3, category5);
//
//            dataset.addValue(airIndex.getCarbonMonoxide(), series4, category1);
//            dataset.addValue(3.0, series4, category2);
//            dataset.addValue(2.0, series4, category3);
//            dataset.addValue(3.0, series4, category4);
//            dataset.addValue(6.0, series4, category5);
//
//            dataset.addValue(airIndex.getParticulateMatter(), series5, category1);
//            dataset.addValue(3.0, series5, category2);
//            dataset.addValue(2.0, series5, category3);
//            dataset.addValue(3.0, series5, category4);
//            dataset.addValue(6.0, series5, category5);
//
//            dataset.addValue(3.0, series6, category2);
//            dataset.addValue(2.0, series6, category3);
//            dataset.addValue(3.0, series6, category4);
//            dataset.addValue(6.0, series6, category5);
//        }
//        return dataset;
//    }
//
//    /**
//     * Creates a sample chart.
//     *
//     * @param dataset the dataset.
//     *
//     * @return The chart.
//     */
//    private JFreeChart createChart(final CategoryDataset dataset) {
//
//        // create the chart...
//        final JFreeChart chart = ChartFactory.createBarChart(
//                "Air Index", // chart title
//                "Category", // domain axis label
//                "Value", // range axis label
//                dataset, // data
//                PlotOrientation.VERTICAL, // orientation
//                true, // include legend
//                true, // tooltips?
//                false // URLs?
//        );
//
//        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...
//        // set the background color for the chart...
//        chart.setBackgroundPaint(Color.white);
//
//        // get a reference to the plot for further customisation...
//        final CategoryPlot plot = chart.getCategoryPlot();
//        plot.setBackgroundPaint(Color.lightGray);
//        plot.setDomainGridlinePaint(Color.white);
//        plot.setRangeGridlinePaint(Color.white);
//
//        // set the range axis to display integers only...
//        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
//        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
//
//        // disable bar outlines...
//        final BarRenderer renderer = (BarRenderer) plot.getRenderer();
//        renderer.setDrawBarOutline(false);
//
//        // set up gradient paints for series...
//        final GradientPaint gp0 = new GradientPaint(
//                0.0f, 0.0f, Color.black,
//                0.0f, 0.0f, Color.lightGray
//        );
//        final GradientPaint gp1 = new GradientPaint(
//                0.0f, 0.0f, Color.green,
//                0.0f, 0.0f, Color.lightGray
//        );
//        final GradientPaint gp2 = new GradientPaint(
//                0.0f, 0.0f, Color.red,
//                0.0f, 0.0f, Color.lightGray
//        );
//        final GradientPaint gp3 = new GradientPaint(
//                0.0f, 0.0f, Color.blue,
//                0.0f, 0.0f, Color.lightGray
//        );
//        final GradientPaint gp4 = new GradientPaint(
//                0.0f, 0.0f, Color.yellow,
//                0.0f, 0.0f, Color.lightGray
//        );
//        final GradientPaint gp5 = new GradientPaint(
//                0.0f, 0.0f, Color.orange,
//                0.0f, 0.0f, Color.lightGray
//        );
//
//        renderer.setSeriesPaint(0, gp0);
//        renderer.setSeriesPaint(1, gp1);
//        renderer.setSeriesPaint(2, gp2);
//        renderer.setSeriesPaint(3, gp3);
//        renderer.setSeriesPaint(4, gp4);
//        renderer.setSeriesPaint(5, gp5);
//
//        final CategoryAxis domainAxis = plot.getDomainAxis();
//        domainAxis.setCategoryLabelPositions(
//                CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
//        );
//        // OPTIONAL CUSTOMISATION COMPLETED.
//
//        return chart;
//
//    }

    private void showChartJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showChartJButtonActionPerformed
        
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        Sensor sensor = (Sensor) sensorJComboBox.getSelectedItem();
        for (AirIndex airIndex : sensor.getAirIndexDirectory().getAirIndexList()) {

            //String str = String.valueOf(count);
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
        ChartFrame frame = new ChartFrame(userAccount.getStreetLocation().toString(), chartFactory);
        frame.setVisible(true);
        frame.setSize(700, 420);
        frame.setLocationRelativeTo(null);

    }//GEN-LAST:event_showChartJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable airIndexJTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox sensorJComboBox;
    private javax.swing.JButton showChartJButton;
    private javax.swing.JButton startTimerJButton;
    private javax.swing.JTextField streetNameJTextField;
    // End of variables declaration//GEN-END:variables

}
