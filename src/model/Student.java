package model;

public class Student {

    // 1. Personal / application information
    private int maritalStatus;
    private int applicationMode;
    private int applicationOrder;
    private int course;
    private int daytimeEveningAttendance;

    // 2. Previous education
    private int previousQualification;
    private double previousQualificationGrade;

    // 3. Demographic / family information
    private int nationality;
    private int mothersQualification;
    private int fathersQualification;
    private int mothersOccupation;
    private int fathersOccupation;

    // 4. Admission / financial / personal status
    private double admissionGrade;
    private int displaced;
    private int educationalSpecialNeeds;
    private int debtor;
    private int tuitionFeesUpToDate;
    private int gender;
    private int scholarshipHolder;
    private int ageAtEnrollment;
    private int international;

    // 5. First semester
    private int curricularUnits1stSemCredited;
    private int curricularUnits1stSemEnrolled;
    private int curricularUnits1stSemEvaluations;
    private int curricularUnits1stSemApproved;
    private double curricularUnits1stSemGrade;
    private int curricularUnits1stSemWithoutEvaluations;

    // 6. Second semester
    private int curricularUnits2ndSemCredited;
    private int curricularUnits2ndSemEnrolled;
    private int curricularUnits2ndSemEvaluations;
    private int curricularUnits2ndSemApproved;
    private double curricularUnits2ndSemGrade;
    private int curricularUnits2ndSemWithoutEvaluations;

    // 7. Economic indicators
    private double unemploymentRate;
    private double inflationRate;
    private double gdp;

    // 8. Target
    private String target;


    public Student(
            int maritalStatus,
            int applicationMode,
            int applicationOrder,
            int course,
            int daytimeEveningAttendance,
            int previousQualification,
            double previousQualificationGrade,
            int nationality,
            int mothersQualification,
            int fathersQualification,
            int mothersOccupation,
            int fathersOccupation,
            double admissionGrade,
            int displaced,
            int educationalSpecialNeeds,
            int debtor,
            int tuitionFeesUpToDate,
            int gender,
            int scholarshipHolder,
            int ageAtEnrollment,
            int international,
            int curricularUnits1stSemCredited,
            int curricularUnits1stSemEnrolled,
            int curricularUnits1stSemEvaluations,
            int curricularUnits1stSemApproved,
            double curricularUnits1stSemGrade,
            int curricularUnits1stSemWithoutEvaluations,
            int curricularUnits2ndSemCredited,
            int curricularUnits2ndSemEnrolled,
            int curricularUnits2ndSemEvaluations,
            int curricularUnits2ndSemApproved,
            double curricularUnits2ndSemGrade,
            int curricularUnits2ndSemWithoutEvaluations,
            double unemploymentRate,
            double inflationRate,
            double gdp,
            String target
    ) {
        this.maritalStatus = maritalStatus;
        this.applicationMode = applicationMode;
        this.applicationOrder = applicationOrder;
        this.course = course;
        this.daytimeEveningAttendance = daytimeEveningAttendance;
        this.previousQualification = previousQualification;
        this.previousQualificationGrade = previousQualificationGrade;
        this.nationality = nationality;
        this.mothersQualification = mothersQualification;
        this.fathersQualification = fathersQualification;
        this.mothersOccupation = mothersOccupation;
        this.fathersOccupation = fathersOccupation;
        this.admissionGrade = admissionGrade;
        this.displaced = displaced;
        this.educationalSpecialNeeds = educationalSpecialNeeds;
        this.debtor = debtor;
        this.tuitionFeesUpToDate = tuitionFeesUpToDate;
        this.gender = gender;
        this.scholarshipHolder = scholarshipHolder;
        this.ageAtEnrollment = ageAtEnrollment;
        this.international = international;
        this.curricularUnits1stSemCredited = curricularUnits1stSemCredited;
        this.curricularUnits1stSemEnrolled = curricularUnits1stSemEnrolled;
        this.curricularUnits1stSemEvaluations = curricularUnits1stSemEvaluations;
        this.curricularUnits1stSemApproved = curricularUnits1stSemApproved;
        this.curricularUnits1stSemGrade = curricularUnits1stSemGrade;
        this.curricularUnits1stSemWithoutEvaluations = curricularUnits1stSemWithoutEvaluations;
        this.curricularUnits2ndSemCredited = curricularUnits2ndSemCredited;
        this.curricularUnits2ndSemEnrolled = curricularUnits2ndSemEnrolled;
        this.curricularUnits2ndSemEvaluations = curricularUnits2ndSemEvaluations;
        this.curricularUnits2ndSemApproved = curricularUnits2ndSemApproved;
        this.curricularUnits2ndSemGrade = curricularUnits2ndSemGrade;
        this.curricularUnits2ndSemWithoutEvaluations = curricularUnits2ndSemWithoutEvaluations;
        this.unemploymentRate = unemploymentRate;
        this.inflationRate = inflationRate;
        this.gdp = gdp;
        this.target = target;
    }


    public int getMaritalStatus() {
        return maritalStatus;
    }

    public int getApplicationMode() {
        return applicationMode;
    }

    public int getApplicationOrder() {
        return applicationOrder;
    }

    public int getCourse() {
        return course;
    }

    public int getDaytimeEveningAttendance() {
        return daytimeEveningAttendance;
    }

    public int getPreviousQualification() {
        return previousQualification;
    }

    public double getPreviousQualificationGrade() {
        return previousQualificationGrade;
    }

    public int getNationality() {
        return nationality;
    }

    public int getMothersQualification() {
        return mothersQualification;
    }

    public int getFathersQualification() {
        return fathersQualification;
    }

    public int getMothersOccupation() {
        return mothersOccupation;
    }

    public int getFathersOccupation() {
        return fathersOccupation;
    }

    public double getAdmissionGrade() {
        return admissionGrade;
    }

    public int getDisplaced() {
        return displaced;
    }

    public int getEducationalSpecialNeeds() {
        return educationalSpecialNeeds;
    }

    public int getDebtor() {
        return debtor;
    }

    public int getTuitionFeesUpToDate() {
        return tuitionFeesUpToDate;
    }

    public int getGender() {
        return gender;
    }

    public int getScholarshipHolder() {
        return scholarshipHolder;
    }

    public int getAgeAtEnrollment() {
        return ageAtEnrollment;
    }

    public int getInternational() {
        return international;
    }

    public int getCurricularUnits1stSemCredited() {
        return curricularUnits1stSemCredited;
    }

    public int getCurricularUnits1stSemEnrolled() {
        return curricularUnits1stSemEnrolled;
    }

    public int getCurricularUnits1stSemEvaluations() {
        return curricularUnits1stSemEvaluations;
    }

    public int getCurricularUnits1stSemApproved() {
        return curricularUnits1stSemApproved;
    }

    public double getCurricularUnits1stSemGrade() {
        return curricularUnits1stSemGrade;
    }

    public int getCurricularUnits1stSemWithoutEvaluations() {
        return curricularUnits1stSemWithoutEvaluations;
    }

    public int getCurricularUnits2ndSemCredited() {
        return curricularUnits2ndSemCredited;
    }

    public int getCurricularUnits2ndSemEnrolled() {
        return curricularUnits2ndSemEnrolled;
    }

    public int getCurricularUnits2ndSemEvaluations() {
        return curricularUnits2ndSemEvaluations;
    }

    public int getCurricularUnits2ndSemApproved() {
        return curricularUnits2ndSemApproved;
    }

    public double getCurricularUnits2ndSemGrade() {
        return curricularUnits2ndSemGrade;
    }

    public int getCurricularUnits2ndSemWithoutEvaluations() {
        return curricularUnits2ndSemWithoutEvaluations;
    }

    public double getUnemploymentRate() {
        return unemploymentRate;
    }

    public double getInflationRate() {
        return inflationRate;
    }

    public double getGdp() {
        return gdp;
    }

    public String getTarget() {
        return target;
    }


    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", ageAtEnrollment=" + ageAtEnrollment +
                ", admissionGrade=" + admissionGrade +
                ", target='" + target + '\'' +
                '}';
    }
}