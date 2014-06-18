package taskschedulingsimgui;

import java.awt.BorderLayout;
import java.io.File;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

/**
 *
 * @author Ljubo Raicevic <rljubo90@gmail.com>
 */

public class FGanttChart extends javax.swing.JDialog {

    /**
     * Creates new form FMain
     */
    public FGanttChart(
            java.awt.Frame parent, 
            boolean modal,
            String file, 
            int start, 
            int end, 
            int width,
            boolean showDeadlines) {
        //initComponents();  // default netbeans initialization
        super(parent, modal);
        
        JScrollPane pane = new JScrollPane(
                new Surface(new File(file), start, end, width, showDeadlines),
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        pane.getViewport().setScrollMode(JViewport.SIMPLE_SCROLL_MODE);
        
        getContentPane().add(pane, BorderLayout.CENTER);
        setSize(800, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
