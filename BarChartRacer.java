///////////////////////////////////////////////////////////////////////////////
// Main Class File:    PA7Tester.java
// File:               BarChartRacer.java
// Quarter:            CSE 8B Winter 2022
//
// Email:              rthavixay@ucsd.edu
// Instructor's Name:  Greg Miranda
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * Driver to create a video/multiple BarCharts successively and display
 * them to the user.
 * Run command: java BarChartRacer <input_file> <num entries per chart>
 * For example: java BarChartRacer cities-usa.txt 10
 *
 * Bugs: None known
 *
 * @author Roger Thavixay
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.io.*;

public class BarChartRacer {

    // a tracker for the year/date of the current chunk
    private static String caption;

    // TODO: Add Header
    private static ArrayList<Bar> getBars(Scanner in) {
        // Create an array list
        //user scanner to read #entries
        //loop readline()
         // for(i=0 ; i < numEntry; i++)
        //add data to arrayList
        //setcaption() to first string in column
        //see .txt files
        //use string to  turn it into list
        //create  the object
        //put the list index in object
        return null;
    }

    // TODO: Add Header
    private static void createChart(BarChart chart, ArrayList<Bar> bars, int numEntries) {
        // TODO
    }

    // TODO: Add Header
    public static void main(String[] args) throws FileNotFoundException {

        // do not modify these two lines
        StdDraw.setCanvasSize(1000, 700);
        StdDraw.enableDoubleBuffering();

        // TODO (reading the file and creating the BarChart object)

        // For each chunk of data, create a BarChart object and draw it
        // TODO
    
        // do not modify these lines
        // clear and redraw chart (you need to do this for every graph you create)
        // chart.draw(); // here chart is your BarChart object
        // StdDraw.show();
        // StdDraw.pause(1);
        // chart.reset(); // here chart is your BarChart object
    }
}
