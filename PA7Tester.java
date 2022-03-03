///////////////////////////////////////////////////////////////////////////////
// Main Class File:    PA7Tester.java
// File:               PA7Tester.java
// Quarter:            CSE 8B Winter 2022
//
// Email:              rthavixay@ucsd.edu
// Instructor's Name:  Greg Miranda
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * Sample tests to check if other classes work as intended
 *
 * Bugs: None known
 *
 * @author Roger Thavixay
 */

import java.util.*;

public class PA7Tester {
    // sample client
    public static void main(String[] args) {
        BarChart chart = new BarChart("WorldWide","Population", "www.SubiSubi.com");

        // do not modify these two lines
        StdDraw.setCanvasSize(1000, 700);
        StdDraw.enableDoubleBuffering();

        // TODO: Add Bar.java tests

        Bar Bar1 = new Bar("USA",3, "North America");
        Bar Bar2 = new Bar("Vietnam",1,"Asia");
        Bar Bar3 = new Bar("Korea",1,"Asia");

        System.out.println("First bar data: ");
        System.out.println(Bar1.getName() + ", " + Bar1.getCategory() + ", " + Bar1.getValue());

        System.out.println("Second bar data: ");
        System.out.println(Bar2.getName() + ", " + Bar2.getCategory() + ", " + Bar2.getValue());

        System.out.println("Third bar data: ");
        System.out.println(Bar3.getName() + ", " + Bar3.getCategory() + ", " + Bar3.getValue());


        System.out.println("Testing compareTo: ");
        System.out.println("Comparing Bar1 (value=" + Bar1.getValue() + ") with Bar2 (value=" +Bar2.getValue()+ ")...");
        System.out.println("Result: " + Bar1.compareTo(Bar2));

        System.out.println("Comparing Bar2 (value=" + Bar1.getValue() + ") with Bar1 (value=" +Bar2.getValue()+ ")...");
        System.out.println("Result: " + Bar2.compareTo(Bar1));

        System.out.println("Comparing Bar2 (value=" + Bar1.getValue() + ") with Bar3 (value=" +Bar2.getValue()+ ")...");
        System.out.println("Result: " + Bar2.compareTo(Bar3));


        // TODO: Add BarChart.java tests

        // BarChart chart = new BarChart();

        
        // TEST 1 
        // do not modify these lines, otherwise drawing behavior will be weird

        chart.draw(); // here chart is your BarChart object
        StdDraw.show(); // you can also use Std.show(1000)/StdDraw.pause() to show for a specified interval
        chart.reset(); // here chart is your BarChart object

        // TEST 2
        // do not modify these lines, otherwise drawing behavior will be weird
        chart.draw(); // here chart is your BarChart object
        StdDraw.show(); // you can also use Std.show(1000)/StdDraw.pause() to show for a specified interval
        chart.reset(); // here chart is your BarChart object

        // BarChartRacer.java tests can directly be run in it's own main method
        // once Bar and BarChart work correctly.
    }
}
