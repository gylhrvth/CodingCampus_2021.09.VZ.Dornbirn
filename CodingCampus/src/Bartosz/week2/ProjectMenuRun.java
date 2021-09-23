package Bartosz.week2;

import Bartosz.week1.loops.functions.ChristmasTree.LoopsEx4Assemble;
import Bartosz.week1.loops.functions.CreateBox;
import Bartosz.week1.loops.loopFunctions.Ex3Arrow;
import Bartosz.week2.ProjectMenuMethods.ProjectMenuHeaderScanner;
import Bartosz.week2.ProjectMenuMethods.ProjectMenuScanners;


public class ProjectMenuRun {
    public static void main(String[] args) {

        ProjectMenuHeaderScanner.menuHeader();

        int input = ProjectMenuScanners.inputScanner();

        System.out.println("auswahl ist : " + input);
        System.out.println();

        switch (input) {
            case 1:
                int height = ProjectMenuScanners.heightScanner();
                Ex3Arrow.printArrow(height);
                break;

            case 2:
                int height2 = ProjectMenuScanners.heightScanner();
                LoopsEx4Assemble.assemble(height2);
                break;

            case 3:
                int height3 = ProjectMenuScanners.heightScanner();
                int width = ProjectMenuScanners.widthScanner();
                CreateBox.CreateConsoleBox(height3, width);break;

            case 4:
                double number1 = ProjectMenuScanners.number1Scanner();
                String operator = ProjectMenuScanners.operatorScanner();
                double number2 = ProjectMenuScanners.number2Scanner();
                Calulator.printCalculator(number1,operator,number2);break;

            case 5:
                int maxDays = ProjectMenuScanners.maxDaysScanner();
                int offset = ProjectMenuScanners.offsetScanner();;
                CalendarRun.printCalendar(maxDays, offset);break;

            case 6: ProjectMenuHeaderScanner.menuHeader();break;

            default: System.out.println("What type of mushrooms did you eat? I can't see this listed."); break;
        }
    }
}