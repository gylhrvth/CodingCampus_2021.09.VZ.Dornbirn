package Lena.ReadWriteStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class CSVExcercise {

    public static void main(String[] args) throws IOException {
        String path = "assets/population-figures-by-country-csv_csv.csv";



        String[] countries = new String [] {"Kuba", "Schweiz", "Griechenland", "Finnland", "Mexiko", "Indien",
        "Thailand", "Ägypten", "Türkei", "Japan", "Portugal", "China", "Kanada", "Brasilien", "Russland", "USA",
                "Marokko", "Irland", "Argentinien", "Montenegro"};
        String[] randomCountries = getRandomCountries(countries);
        drawingWichtel(randomCountries);

     //   for (int i = 0; i < randomCountries.length; i++) {
       //     System.out.println(randomCountries[i]);
       // }


       // matrixToString(fillMatrix(readFile(path)));
       // sortByUserInput(fillMatrix(readFile(path)));

    }

    public static void drawingWichtel(String[]randomCountries){
        Random random = new Random();
        String[]names = new String[]{"Hermann", "Margit", "Lisa", "Daniel", "Philipp M.", "Christiane",
                "Dietmar", "Beate", "Anna", "Ulli", "Greta", "Franz-Josef",
        "Otmar", "Annette", "Niklas", "Anja", "Philipp B.", "Lena"};

        String[][]draw = new String[randomCountries.length][2];

        int randNameI;
        int randCounI;

        for (int i = 0; i < draw.length; i++) {
            do{
                randNameI = random.nextInt(names.length);
                randCounI = random.nextInt(randomCountries.length);
            }while (names[randNameI]==null || randomCountries[randCounI]==null);

            draw[i][0]= names[randNameI];
            names[randNameI]=null;
            draw[i][1]=randomCountries[randCounI];
            randomCountries[randCounI]=null;
        }

        for (int i = 0; i < draw.length; i++) {
            System.out.println(draw[i][0]+" --> "+draw[i][1]);
        }

    }

    public static String[] getRandomCountries(String[] countries) {
        Random random = new Random();
        String[] randomCountries = new String[18];
        int randomIndex;

        for (int i = 0; i < randomCountries.length; i++) {
            do {
                randomIndex = random.nextInt(countries.length);
            } while (countries[randomIndex] == null || Objects.equals(countries[randomIndex], "Unknown"));

            randomCountries[i] = countries[randomIndex];
            countries[randomIndex] = null;

        }

        return randomCountries;
    }


    public static String[] getCountries(String[][] matrix) {
        String[] countries = new String[matrix.length];

        for (int i = 1; i < matrix.length; i++) {
            countries[i] = matrix[i][0];
        }
        return countries;
    }

    public static String readFile(String path) throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String text;
            while ((text = br.readLine()) != null) {
                sb
                        .append(text).
                        append(System.lineSeparator());
            }
            br.close();
        } catch (FileNotFoundException fnfExc) {
            System.out.println("Das File kann nicht gefunden werden");
        } catch (IOException exc) {
            System.out.println("IOException");
        }

        return sb.toString();
    }

    public static String[][] fillMatrix(String string) {
        String[] tempRows = string.split("\n");
        String[][] matrix = new String[tempRows.length][];

        for (int i = 0; i < tempRows.length; i++) {
            tempRows[i] = tempRows[i].replaceAll("\".*?,.*?\"", "Unknown").replaceAll(",,", ",0,0");
            matrix[i] = tempRows[i].split(",");
        }

        return matrix;
    }

    public static void matrixToString(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0) {
                    System.out.printf("%55s", matrix[i][j]);
                } else if (j == 1) {
                    System.out.printf("%15s", matrix[i][j]);
                } else {
                    System.out.printf("%20s", matrix[i][j]);
                }

            }
            System.out.println();

        }
    }

    private static void sortByUserInput(String[][] matrix) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nach welchem Jahr von 1960 bis 2016 möchten Sie sortieren?");
        int column = sc.nextInt();

/*        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i].equals("Year_" + year)) {
                column = i;
            }
        }*/

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length - 1 - i; j++) {

                try {
                    if (Long.parseLong(matrix[j][column]) > Long.parseLong(matrix[j + 1][column])) {
                        String[] temp = matrix[j];
                        matrix[j] = matrix[j + 1];
                        matrix[j + 1] = temp;
                    }
                } catch (NumberFormatException nfex) {
                    for (int k = 0; k < matrix.length; k++) {
                        for (int l = 1; l < matrix.length - 1 - k; l++) {
                            if (matrix[k][column].compareTo(matrix[k + 1][column]) > 0) {
                                String[] temp = matrix[l];
                                matrix[l] = matrix[l + 1];
                                matrix[l + 1] = temp;
                            }
                        }
                    }
                }
            }
        }

        matrixToString(matrix);


    }

}
