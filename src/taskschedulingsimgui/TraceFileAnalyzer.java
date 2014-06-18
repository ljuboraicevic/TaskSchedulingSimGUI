package taskschedulingsimgui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nikola
 */
public final class TraceFileAnalyzer {

    Surface panel;
    int startRenderingFromTime;
    int endRenderingAtTime;

    public TraceFileAnalyzer(Surface pPanel, File traceFile, int pStart, int pEnd) {
        this.panel = pPanel;
        this.startRenderingFromTime = pStart;
        this.endRenderingAtTime = pEnd;
        parseTraceFile(traceFile);
    }

    /**
     * reads trace file and calculates statistic parameters
     *
     */
    public void parseTraceFile(File f) {
        try {
            Scanner scan = new Scanner(f);
            //int periodicTaskCounter = 0; //number of diferent id, seen so far
            //int listIndex; //index in statistic list (used in hash map as value) 
            int counter = 0;
            
            while (scan.hasNextLine()) {
                try {
                    //read id of periodic task 
                    //first line in trace is periodic task id
                    String id = scan.next();
                    
                    //add activation time
                    int activationTime = scan.nextInt();
                    
                    //if current instance is not in the interval
                    //that is supposed to be shown, skip this cycle
                    if (activationTime < startRenderingFromTime) {
                        scan.nextLine();
                        scan.nextLine();
                        scan.nextLine();
                        scan.nextLine();
                        scan.nextLine();
                        scan.nextLine();
                        scan.nextLine();
                        continue;
                    } else if (activationTime > endRenderingAtTime) {
                        break;
                    }
                    
                    //if this is the first time the task has showed up
                    //add the task to panel.tasks
                    if (!panel.tasks.containsKey(id)) {
                        panel.tasks.put(id, new Task());
                    }
                    
                    panel.tasks.get(id).addActivationTime(activationTime);
                    
                    //add deadline
                    int deadline = scan.nextInt();
                    panel.tasks.get(id).addAbsoluteDeadline(deadline);
                    
                    //skipping a line
                    scan.nextLine(); //int totalExecutionTime
                    scan.nextLine();

                    String startTimes = scan.nextLine();
                    Scanner lineFirst = new Scanner(startTimes);

                    String endTimes = scan.nextLine();
                    Scanner lineSecond = new Scanner(endTimes);
                    
                    ArrayList<Integer> startTimesArray = new ArrayList<>();
                    ArrayList<Integer> endTimesArray = new ArrayList<>();
                    
                    //for each start and end of execution of this task
                    while (lineFirst.hasNextInt() && lineSecond.hasNextInt()) {
                        startTimesArray.add(lineFirst.nextInt());
                        endTimesArray.add(lineSecond.nextInt());
                    }

                    panel.tasks.get(id).addStartTimes(startTimesArray);
                    panel.tasks.get(id).addEndTimes(endTimesArray);
                    
                    //add breached deadline
                    int missedDeadline = scan.nextInt();
                    panel.tasks.get(id).addDeadlineBreach(missedDeadline);

                    //moving scanner on next line, one line below missed deadline 
                    scan.nextLine();
                    
                    //scanning empty line
                    scan.nextLine();

                } catch (InputMismatchException e) {
                    System.out.println("File not found1.");

                } catch (NoSuchElementException e) {
                    System.out.println("File not found2.");
                    break;
                }
                
                if (counter++ > 2) {
                    //break;
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DGanttChart.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("File not found!");
        }
    }
}
