package Ingo.week7.testRadio;

import java.time.LocalDateTime;

public class Application {

    private static Object LocalDateTime;

    public static void main(String[] args) {
        Radio r1 = new Radio();
        r1.setClock();
        r1.setFrequency(90);
        r1.setOn(true);
        r1.setName("Hallo Ingo altes Radio");
        r1.setAge();
        r1.volumeUp();
        r1.volumeDown();
        System.out.println(r1.toString());
        System.out.println(r1);

        Radio r2 = new Radio();
        System.out.println(r2.getFrequency());
        System.out.println(r2.isOn());
        System.out.println(r2.getVolume());
        System.out.println(r2.getName());
        System.out.println(r2.getFrequency());

        ProductionDate productionDate = new ProductionDate().Month(12).Year(2020); // fluent api , kaskadieren

        System.out.println(productionDate.Month());
        System.out.println(productionDate.Year());
        System.out.println();


    //    LocalDateTime time = time.LocalDateTime();
    //    System.out.println(time);
        System.out.println(LocalDateTime);



    }

    public static void setLocalDateTime(Object localDateTime) {
        LocalDateTime = localDateTime;
    }

    public static Object getLocalDateTime() {
        return LocalDateTime;
    }
}
