package Bartosz.oldStuff.week1.loops;

import Bartosz.oldStuff.week1.loops.functions.ChristmasTree.LoopsEx4Assemble;

import java.util.Scanner;

public class LoopsEx4Run {
    public static void main(String[] args) {

        System.out.println("Wie hoch soll der Baum sein?");
        Scanner treeHeight = new Scanner(System.in);
        int height = treeHeight.nextInt();

        LoopsEx4Assemble.assemble(height);
    }

}
