package taskschedulingsimgui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Ljubo Raicevic <rljubo90@gmail.com>
 */
public class FMain extends javax.swing.JFrame {

    /**
     * Creates new form FMain
     */
    public FMain() {
        initComponents();
        lInputSet.setModel(new DefaultListModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAddTask = new javax.swing.JButton();
        btnRemoveTask = new javax.swing.JButton();
        btnSimulate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lInputSet = new javax.swing.JList();
        spnRepetitions = new javax.swing.JSpinner();
        spnSimulationLength = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        cbAlgorithm = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cbType = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        mainMenu = new javax.swing.JMenuBar();
        mmFile = new javax.swing.JMenu();
        mmLoadFromFile = new javax.swing.JMenuItem();
        mmSaveToFile = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task Scheduling Sim");

        jLabel1.setText("Input Set");

        btnAddTask.setText("Add Task");
        btnAddTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTaskActionPerformed(evt);
            }
        });

        btnRemoveTask.setText("Remove Task");
        btnRemoveTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveTaskActionPerformed(evt);
            }
        });

        btnSimulate.setText("Simulate");
        btnSimulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimulateActionPerformed(evt);
            }
        });

        jLabel2.setText("Repetitions:");

        jScrollPane2.setViewportView(lInputSet);

        spnRepetitions.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        spnRepetitions.setValue(1);

        spnSimulationLength.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(20), Integer.valueOf(20), null, Integer.valueOf(1)));

        jLabel3.setText("Simulation length:");

        cbAlgorithm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RM", "EDF", "DM" }));

        jLabel4.setText("Algorithm:");
        jLabel4.setToolTipText("Rate Monotonic, Earliest Deadline First or Deadline Monotonic");

        cbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HARD", "SOFT" }));

        jLabel5.setText("Type:");

        mmFile.setText("File");

        mmLoadFromFile.setText("Load From File");
        mmLoadFromFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmLoadFromFileActionPerformed(evt);
            }
        });
        mmFile.add(mmLoadFromFile);

        mmSaveToFile.setText("Save To File");
        mmSaveToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmSaveToFileActionPerformed(evt);
            }
        });
        mmFile.add(mmSaveToFile);

        mainMenu.add(mmFile);

        setJMenuBar(mainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnSimulationLength, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoveTask, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddTask, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSimulate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAlgorithm, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnRepetitions, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(cbType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spnSimulationLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddTask)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveTask)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbAlgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnRepetitions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSimulate, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mmLoadFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmLoadFromFileActionPerformed
        JFileChooser openFileDialog = new JFileChooser();
        int ret = openFileDialog.showOpenDialog(null);
        
        if (ret == JFileChooser.APPROVE_OPTION) {
             loadInputFile(openFileDialog.getSelectedFile());
        }
    }//GEN-LAST:event_mmLoadFromFileActionPerformed

    private void btnRemoveTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveTaskActionPerformed
        if (lInputSet.getSelectedIndex() > -1) {
            DefaultListModel dlm = (DefaultListModel) lInputSet.getModel();
            dlm.removeElementAt(lInputSet.getSelectedIndex());
        }
    }//GEN-LAST:event_btnRemoveTaskActionPerformed

    private void mmSaveToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmSaveToFileActionPerformed
        JFileChooser saveFileDialog = new JFileChooser();
        int ret = saveFileDialog.showOpenDialog(null);
        
        if (ret == JFileChooser.APPROVE_OPTION) {
            if (saveToFile(saveFileDialog.getSelectedFile())) {
                JOptionPane.showMessageDialog(null, "File saved.");
            } else {
                JOptionPane.showMessageDialog(null, "Error saving file.");
            }
        }
    }//GEN-LAST:event_mmSaveToFileActionPerformed

    private void btnAddTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTaskActionPerformed
        DAddTask dat = new DAddTask(this, true);
        dat.setLocationRelativeTo(this);
        dat.setVisible(true);
        if (!dat.task.isEmpty()) {
            addTask(dat.task);
        }
    }//GEN-LAST:event_btnAddTaskActionPerformed

    private void btnSimulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimulateActionPerformed
        if (lInputSet.getModel().getSize() > 0) {
            File dirIo = new File("io");
            File dirInput = new File("io/input");
            File dirTrace = new File("io/trace");

            dirIo.mkdir();
            dirInput.mkdir();
            dirTrace.mkdir();

            saveToFile(new File("io/input/SIMULATION"));

            DSimulation ds = new DSimulation(
                    this, 
                    true, 
                    "", 
                    cbAlgorithm.getModel().getSelectedItem().toString(), 
                    cbType.getModel().getSelectedItem().toString(), 
                    spnRepetitions.getValue().toString());

            ds.setLocationRelativeTo(this);
            ds.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No tasks in input set.");
        }
    }//GEN-LAST:event_btnSimulateActionPerformed

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
            java.util.logging.Logger.getLogger(FMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FMain fm = new FMain();
                fm.setLocationRelativeTo(null);
                fm.setVisible(true);
                //new FMain().setVisible(true);
            }
        });
    }
    
    private void addTask(String task) {
        DefaultListModel dlm = (DefaultListModel)lInputSet.getModel();
        dlm.addElement(task);
    }
    
    private void loadInputFile(File f) {
        try {
            Scanner scan = new Scanner(f);
            scan.nextLine();
            
            DefaultListModel dlm = new DefaultListModel();
            
            while (scan.hasNextLine()) {
                dlm.addElement(scan.nextLine());
            }
            
            spnSimulationLength.setValue(Integer.valueOf(dlm.lastElement().toString()));
            dlm.removeElementAt(dlm.size() - 1);
            
            lInputSet.setModel(dlm);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FMain.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("File not found");
        }
    }
    
    private boolean saveToFile(File f) {
        try (PrintWriter writer = new PrintWriter(f)) {
                DefaultListModel dlm = (DefaultListModel)lInputSet.getModel();
                writer.println(dlm.size());
                
                for (int iCount = 0; iCount < dlm.size(); iCount++) {
                    writer.println(dlm.get(iCount));
                }
                
                try {
                    spnSimulationLength.commitEdit();
                } catch (ParseException ex) {
                    Logger.getLogger(FMain.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Not a number!");
                }
                
                writer.println(spnSimulationLength.getValue().toString());
                
                return true;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FMain.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error saving file!");
                return false;
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTask;
    private javax.swing.JButton btnRemoveTask;
    private javax.swing.JButton btnSimulate;
    private javax.swing.JComboBox cbAlgorithm;
    private javax.swing.JComboBox cbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lInputSet;
    private javax.swing.JMenuBar mainMenu;
    private javax.swing.JMenu mmFile;
    private javax.swing.JMenuItem mmLoadFromFile;
    private javax.swing.JMenuItem mmSaveToFile;
    private javax.swing.JSpinner spnRepetitions;
    private javax.swing.JSpinner spnSimulationLength;
    // End of variables declaration//GEN-END:variables
}
