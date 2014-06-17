package taskschedulingsimgui;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ljubo Raicevic <rljubo90@gmail.com>
 */
public class DSimulation extends javax.swing.JDialog {

    /**
     * Creates new form DSimulation
     */
    public DSimulation(
            java.awt.Frame parent, 
            boolean modal,
            String directory,
            String algorithm,
            String type,
            String repetitions) {
        super(parent, modal);
        
        initComponents();
        
        executeSimulation(directory, algorithm, type, repetitions);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        taOutput.setColumns(20);
        taOutput.setRows(5);
        jScrollPane1.setViewportView(taOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void executeSimulation(
            String dir, 
            String algorithm, 
            String type, 
            String repetitions) {
        
        StringBuilder output = new StringBuilder();
	Process p;
        
	try {
            String command = "java -jar " + System.getProperty("user.dir") 
                    + File.separator + "TaskSchedulingSimulator.jar 1 "  
                    + "is " + 
                    algorithm + " " 
                    + type + " "
                    + repetitions; 
            
            System.out.println(command);
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader = 
                new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = "";			
            while ((line = reader.readLine())!= null) {
                    output.append(line).append("\n");
            }

        } catch (IOException | InterruptedException e) { }
        
        taOutput.setText(output.toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taOutput;
    // End of variables declaration//GEN-END:variables
}