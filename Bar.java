///////////////////////////////////////////////////////////////////////////////
// Main Class File:    PA7Tester.java
// File:               Bar.java
// Quarter:            CSE 8B Winter 2022
//
// Email:              rthavixay@ucsd.edu
// Instructor's Name:  Greg Miranda
//
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * Implementation to create a single Bar in a BarChart
 *
 * Bugs: None known
 *
 * @author your name
 */

public class Bar implements Comparable<Bar> {
    private String name;
    private int value;
    private String category;

    //Bar Constructor with the member variables
    public Bar(String name, int value, String category) {
        this.name = name;
        this.value = value;
        this.category = category;
    }

    //Method to return value of the name member variable
    public String getName() {
        return name;
    }

    // Method to return the value member variable
    public int getValue() {
        return value;
    }

    //Method returns the category member variable
    public String getCategory() {
        return category;
    }

    //Need help on task 5 in PART1
    public int compareTo(Bar that){ //This will take in the value
        //Implement this method to compare Bar object with Bar object passed in
        if(this.value < that.getValue()){
            return -1;
            }
        if(this.value == that.getValue()){
            return 0;
        }
        else {
            return 1;
            }

        //Do I need an exception handler if an int is not passed in or out?

        
        ////Fix This Issue!!!!!////

        // if (Bar1 < Bar2){ // if that object less than 0 return -1 (Negative #)
        //     return -1;
        // }

        // if (Bar1.equals(Bar2)){//if that object equal 0 return 0
        //     return 0;
        // }

        // if (Bar1 > Bar2){// if that object greater than 0 return 1 (Positive #)
        //     return 1;
        // }
    }
}
