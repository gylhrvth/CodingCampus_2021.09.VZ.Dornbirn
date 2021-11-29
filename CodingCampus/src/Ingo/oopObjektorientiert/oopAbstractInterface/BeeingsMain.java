package Ingo.oopObjektorientiert.oopAbstractInterface;

public class BeeingsMain {
    public static void main(String[] args) {

        God votan = new God();
        God shiva = new God();
        shiva.language();

        Human human = new Human();
        human.travel();

        System.out.println(human.name);

        Robot robot = new Robot(5,"name",4);
        Robot robot1 = new Robot(3,"name",7);

        System.out.println(human.fingers);
        System.out.println(robot.chips);


    }
}
