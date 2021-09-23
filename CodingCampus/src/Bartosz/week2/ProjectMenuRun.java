package Bartosz.week2;

import Bartosz.week1.loops.functions.ChristmasTree.LoopsEx4Assemble;
import Bartosz.week1.loops.functions.CreateBox;
import Bartosz.week1.loops.loopFunctions.Ex3Arrow;
import Bartosz.week2.ProjectMenuMethods.ProjectMenuHeader;
import Bartosz.week2.ProjectMenuMethods.ProjectMenuScanners;


public class ProjectMenuRun {
    public static void main(String[] args) {

        ProjectMenuHeader.menuHeader();

        int input = ProjectMenuScanners.inputScanner();

        System.out.println();

        switch (input) {
            case 1 -> {
                int height = ProjectMenuScanners.heightScanner();
                Ex3Arrow.printArrow(height);
            }
            case 2 -> {
                int height2 = ProjectMenuScanners.heightScanner();
                LoopsEx4Assemble.assemble(height2);
            }
            case 3 -> {
                int height3 = ProjectMenuScanners.heightScanner();
                int width = ProjectMenuScanners.widthScanner();
                CreateBox.CreateConsoleBox(height3, width);
            }
            case 4 -> {
                double number1 = ProjectMenuScanners.number1Scanner();
                String operator = ProjectMenuScanners.operatorScanner();
                double number2 = ProjectMenuScanners.number2Scanner();
                Calulator.printCalculator(number1, operator, number2);
            }
            case 5 -> {
                int maxDays = ProjectMenuScanners.maxDaysScanner();
                int offset = ProjectMenuScanners.offsetScanner();
                ;
                CalendarRun.printCalendar(maxDays, offset);
            }
            case 6 -> ProjectMenuHeader.menuHeader();

            default -> System.out.println("What type of mushrooms did you eat? I can't see this listed.");
        }
    }
}