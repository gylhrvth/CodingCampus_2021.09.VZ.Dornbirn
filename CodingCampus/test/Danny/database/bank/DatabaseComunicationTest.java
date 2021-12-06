package Danny.database.bank;

import org.junit.jupiter.api.Test;

public class DatabaseComunicationTest {
    @Test
    public void testThread() throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println("Hallo");
                } catch(InterruptedException exc) {
                    //noop - no operation
                }
            }
        };
        thread.start();
        thread.join();
    }

    public void testTransaktion() throws InterruptedException {
        Thread[] threads = new Thread[10];

        for(int i=0; i<10; i++) {
            threads[i] = new Thread() {
                @Override
                public void run() {
                    Database database = new Database("testurl");
                    DatabaseComunication communication = new DatabaseComunication(database);

                    for(int i=0; i<1000; i++) {
//                        communication.addTransaktionTable();
                    }
                }
            };
        }

        //Prüfen ob der Kontostand passt

        for (Thread thread : threads) {
            thread.start();
        }
        for(Thread thread : threads) {
            thread.join();
        }
    }
}
