import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws Exception {
        FileInputStream fis=null;
        Properties property = new Properties();


        try {
        fis = new FileInputStream("src/main/resources/config.properties");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка! Файл .properties не найден!");
        }

        property.load(fis);

        int column_value = Integer.parseInt(property.getProperty("column_value"));

        Scanner scanner = new Scanner(System.in);

        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("src/main/resources/0.csv"));
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка! Файл .csv не найден!");
        }

        int value = 0;
        String[] next_line;
        String string_search;
        List<Airports> list = new ArrayList();


        System.out.println("Введите запрос");
        string_search = scanner.nextLine();

        Pattern pattern = Pattern.compile("^" + string_search);

        Matcher matcher;

        long m = System.currentTimeMillis();

        while ((next_line = reader.readNext()) != null) {
            matcher = pattern.matcher(next_line[column_value - 1]);

            if (matcher.find()) {
                value++;
                list.add(new Airports(next_line));
            }
        }
        System.out.println("Время потраченное на поиск: " + (double) (System.currentTimeMillis() - m));

        System.out.println("Количество найденных записей: " + value);

        switch (column_value - 1) {
            case 0:
                list.sort(Comparator.comparing(Airports::getName0));
                break;
            case 1:
                list.sort(Comparator.comparing(Airports::getName1, String.CASE_INSENSITIVE_ORDER));
                break;
            case 2:
                list.sort(Comparator.comparing(Airports::getName2, String.CASE_INSENSITIVE_ORDER));
                break;
            case 3:
                list.sort(Comparator.comparing(Airports::getName3, String.CASE_INSENSITIVE_ORDER));
                break;
            case 4:
                list.sort(Comparator.comparing(Airports::getName4, String.CASE_INSENSITIVE_ORDER));
                break;
            case 5:
                list.sort(Comparator.comparing(Airports::getName5, String.CASE_INSENSITIVE_ORDER));
                break;
            case 6:
                list.sort(Comparator.comparing(Airports::getName6));
                break;
            case 7:
                list.sort(Comparator.comparing(Airports::getName7));
                break;
            case 8:
                list.sort(Comparator.comparing(Airports::getName8));
                break;
            case 9:
                list.sort(Comparator.comparing(Airports::getName9));
                break;
            case 10:
                list.sort(Comparator.comparing(Airports::getName10, String.CASE_INSENSITIVE_ORDER));
                break;
            case 11:
                list.sort(Comparator.comparing(Airports::getName11, String.CASE_INSENSITIVE_ORDER));
                break;
            case 12:
                list.sort(Comparator.comparing(Airports::getName12, String.CASE_INSENSITIVE_ORDER));
                break;
        }

        for (Airports airports : list) {
            switch (column_value - 1) {
                case 0:
                    System.out.println(airports.getName0());
                    break;
                case 1:
                    System.out.println(airports.getName1());
                    break;
                case 2:
                    System.out.println(airports.getName2());
                    break;
                case 3:
                    System.out.println(airports.getName3());
                    break;
                case 4:
                    System.out.println(airports.getName4());
                    break;
                case 5:
                    System.out.println(airports.getName5());
                    break;
                case 6:
                    System.out.println(airports.getName6());
                    break;
                case 7:
                    System.out.println(airports.getName7());
                    break;
                case 8:
                    System.out.println(airports.getName8());
                    break;
                case 9:
                    System.out.println(airports.getName9());
                    break;
                case 10:
                    System.out.println(airports.getName10());
                    break;
                case 11:
                    System.out.println(airports.getName11());
                    break;
                case 12:
                    System.out.println(airports.getName12());
                    break;
            }
            System.out.println(airports.toString()+"\n");
        }
    }
}
