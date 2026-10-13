package data;

import model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

    public static ArrayList<Student> readStudents(String filePath) {

        ArrayList<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Read header
            String line = br.readLine();

            if (line == null) {
                System.out.println("CSV file is empty.");
                return students;
            }

            int lineNumber = 1;

            while ((line = br.readLine()) != null) {

                lineNumber++;

                if (line.trim().isEmpty()) {
                    continue;
                }

                try {

                    // -1 keeps empty fields
                    String[] data = line.split(";", -1);

                    if (data.length != 37) {
                        System.out.println(
                                "Skipping line " + lineNumber +
                                        ": expected 37 columns but found " +
                                        data.length
                        );
                        continue;
                    }

                    Student student = new Student(

                            Integer.parseInt(data[0].trim()),
                            Integer.parseInt(data[1].trim()),
                            Integer.parseInt(data[2].trim()),
                            Integer.parseInt(data[3].trim()),
                            Integer.parseInt(data[4].trim()),

                            Integer.parseInt(data[5].trim()),
                            Double.parseDouble(data[6].trim()),

                            Integer.parseInt(data[7].trim()),
                            Integer.parseInt(data[8].trim()),
                            Integer.parseInt(data[9].trim()),
                            Integer.parseInt(data[10].trim()),
                            Integer.parseInt(data[11].trim()),

                            Double.parseDouble(data[12].trim()),

                            Integer.parseInt(data[13].trim()),
                            Integer.parseInt(data[14].trim()),
                            Integer.parseInt(data[15].trim()),
                            Integer.parseInt(data[16].trim()),
                            Integer.parseInt(data[17].trim()),
                            Integer.parseInt(data[18].trim()),
                            Integer.parseInt(data[19].trim()),

                            Integer.parseInt(data[20].trim()),

                            Integer.parseInt(data[21].trim()),
                            Integer.parseInt(data[22].trim()),
                            Integer.parseInt(data[23].trim()),
                            Integer.parseInt(data[24].trim()),
                            Double.parseDouble(data[25].trim()),
                            Integer.parseInt(data[26].trim()),

                            Integer.parseInt(data[27].trim()),
                            Integer.parseInt(data[28].trim()),
                            Integer.parseInt(data[29].trim()),
                            Integer.parseInt(data[30].trim()),
                            Double.parseDouble(data[31].trim()),
                            Integer.parseInt(data[32].trim()),

                            Double.parseDouble(data[33].trim()),
                            Double.parseDouble(data[34].trim()),
                            Double.parseDouble(data[35].trim()),

                            data[36].trim()
                    );

                    students.add(student);

                } catch (NumberFormatException e) {

                    System.out.println(
                            "Skipping invalid line " +
                                    lineNumber + ": " + e.getMessage()
                    );
                }
            }

        } catch (IOException e) {

            System.out.println("Error reading CSV file.");
            System.out.println(e.getMessage());
        }

        return students;
    }
}