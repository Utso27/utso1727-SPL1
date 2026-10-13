package statistics;

import model.Student;

import java.util.ArrayList;

public class Statistics {

    // ---------------------------------------------------------
    // Count Dropout Students
    // ---------------------------------------------------------
    public int countDropoutStudents(ArrayList<Student> students) {

        int count = 0;

        for (Student s : students) {
            if (s.getTarget().equalsIgnoreCase("Dropout")) {
                count++;
            }
        }

        return count;
    }


    // ---------------------------------------------------------
    // Count Enrolled Students
    // ---------------------------------------------------------
    public int countEnrolledStudents(ArrayList<Student> students) {

        int count = 0;

        for (Student s : students) {
            if (s.getTarget().equalsIgnoreCase("Enrolled")) {
                count++;
            }
        }

        return count;
    }


    // ---------------------------------------------------------
    // Count Graduate Students
    // ---------------------------------------------------------
    public int countGraduateStudents(ArrayList<Student> students) {

        int count = 0;

        for (Student s : students) {
            if (s.getTarget().equalsIgnoreCase("Graduate")) {
                count++;
            }
        }

        return count;
    }


    // ---------------------------------------------------------
    // Mean Admission Grade
    // ---------------------------------------------------------
    public double calculateMeanAdmissionGrade(
            ArrayList<Student> students) {

        if (students.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (Student s : students) {
            sum += s.getAdmissionGrade();
        }

        return sum / students.size();
    }


    // ---------------------------------------------------------
    // Mean Age at Enrollment
    // ---------------------------------------------------------
    public double calculateMeanAge(
            ArrayList<Student> students) {

        if (students.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (Student s : students) {
            sum += s.getAgeAtEnrollment();
        }

        return sum / students.size();
    }


    // ---------------------------------------------------------
    // Mean First Semester Grade
    // ---------------------------------------------------------
    public double calculateMeanFirstSemesterGrade(
            ArrayList<Student> students) {

        if (students.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (Student s : students) {
            sum += s.getCurricularUnits1stSemGrade();
        }

        return sum / students.size();
    }


    // ---------------------------------------------------------
    // Mean Second Semester Grade
    // ---------------------------------------------------------
    public double calculateMeanSecondSemesterGrade(
            ArrayList<Student> students) {

        if (students.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (Student s : students) {
            sum += s.getCurricularUnits2ndSemGrade();
        }

        return sum / students.size();
    }


    // ---------------------------------------------------------
    // First Semester Grade Standard Deviation
    // ---------------------------------------------------------
    public double standardDeviationFirstSemesterGrade(
            ArrayList<Student> students) {

        if (students.isEmpty()) {
            return 0;
        }

        double mean = calculateMeanFirstSemesterGrade(students);

        double sum = 0;

        for (Student s : students) {
            sum += Math.pow(
                    s.getCurricularUnits1stSemGrade() - mean,
                    2
            );
        }

        return Math.sqrt(sum / students.size());
    }


    // ---------------------------------------------------------
    // Second Semester Grade Standard Deviation
    // ---------------------------------------------------------
    public double standardDeviationSecondSemesterGrade(
            ArrayList<Student> students) {

        if (students.isEmpty()) {
            return 0;
        }

        double mean = calculateMeanSecondSemesterGrade(students);

        double sum = 0;

        for (Student s : students) {
            sum += Math.pow(
                    s.getCurricularUnits2ndSemGrade() - mean,
                    2
            );
        }

        return Math.sqrt(sum / students.size());
    }


    // ---------------------------------------------------------
    // Mean Approved Units - First Semester
    // ---------------------------------------------------------
    public double calculateMeanFirstSemesterApproved(
            ArrayList<Student> students) {

        if (students.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (Student s : students) {
            sum += s.getCurricularUnits1stSemApproved();
        }

        return sum / students.size();
    }


    // ---------------------------------------------------------
    // Mean Approved Units - Second Semester
    // ---------------------------------------------------------
    public double calculateMeanSecondSemesterApproved(
            ArrayList<Student> students) {

        if (students.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (Student s : students) {
            sum += s.getCurricularUnits2ndSemApproved();
        }

        return sum / students.size();
    }


    // ---------------------------------------------------------
    // Dropout Average First Semester Grade
    // ---------------------------------------------------------
    public double dropoutAverageFirstSemesterGrade(
            ArrayList<Student> students) {

        double sum = 0;
        int count = 0;

        for (Student s : students) {

            if (s.getTarget().equalsIgnoreCase("Dropout")) {

                sum += s.getCurricularUnits1stSemGrade();
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return sum / count;
    }


    // ---------------------------------------------------------
    // Non-Dropout Average First Semester Grade
    // ---------------------------------------------------------
    public double nonDropoutAverageFirstSemesterGrade(
            ArrayList<Student> students) {

        double sum = 0;
        int count = 0;

        for (Student s : students) {

            if (!s.getTarget().equalsIgnoreCase("Dropout")) {

                sum += s.getCurricularUnits1stSemGrade();
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return sum / count;
    }
}