import java.io.*;

public class SchoolResultPortal {

    public static void generateReport(String inputFile,
                                      String outputFile) {

        try (
            BufferedReader br =
                    new BufferedReader(new FileReader(inputFile));

            // true = append mode
            PrintWriter pw =
                    new PrintWriter(new FileWriter(outputFile, true))
        ) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];

                int total = 0;

                for (int i = 1; i < data.length; i++) {
                    total += Integer.parseInt(data[i]);
                }

                double average =
                        (double) total / (data.length - 1);

                pw.println("Student Name : " + name);
                pw.println("Average Marks: " + average);
                pw.println("---------------------------");
            }

            System.out.println("Report generated successfully!");

        } catch (FileNotFoundException e) {

            System.out.println(
                    "Error: Student data file not found."
            );

        } catch (IOException e) {

            System.out.println(
                    "File operation error: "
                    + e.getMessage()
            );

        } catch (NumberFormatException e) {

            System.out.println(
                    "Invalid marks format in file."
            );
        }
    }

    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "reportCard.txt";

        generateReport(inputFile, outputFile);
    }
}
