package Saadaq.weekTwo;

public class Square {
    public static void main(String[] args) {


        int height = 8;
        int width = 6;

        for (int i = 1; i <= height; i++) {// Loop for amounts of rows
            // if first     or  last
            if (i == 1 || i == height) {                  // Conditon (if it's the first or last row) print for loop with// Starborder
                for (int k = 0; k < width; k++) {   // print stars until width is reached
                    System.out.print("*");
                }
                System.out.println();       //Linebreak after width is reached
            } else {      // if it's not first or last row
                for (int widthCounter = 1; widthCounter <= width; widthCounter++) { //print characters until it reaches width
                    if (widthCounter == 1 || widthCounter == width) {      // Conditon if its the first or last character in the row
                        System.out.print("*");              // Print a star
                    } else { // if it's not the first or last character print an empty space
                        System.out.print(" ");
                    }
                }
                System.out.println();       // Linebreak after the width of the row is reached
            }
        }
    }
}
