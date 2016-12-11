package com.okubo_tech.reportcard;

/**
 * Created by okubo on 2016/11/19.
 */

public class ReportCard {
    // Name of Student (e.g. MasahiroOKUBO )
    private String mStudentName;

    // School grade and Class of Student (e.g. 1-A, 2-B)
    private String mStudentClass;

    // portrait of Student
    private int mImageResourceId;

    // grade of Mathematics (e.g. A,B,C,D,E)
    private String mGradeMathematics;

    // grade of language (e.g. A,B,C,D,E)
    private String mGradeLanguage;

    // grade of Civics (e.g. A,B,C,D,E)
    private String mGradeCivics;

    // grade of Science (e.g. A,B,C,D,E)
    private String mGradeScience;


    private static final int GRADE_A = 90;
    private static final int GRADE_B = 70;
    private static final int GRADE_C = 50;

    /*
    * Create a new ReportCard object.
    *
    * @param Name is the name of the Student (e.g. MasahiroOKUBO)
    * @param Class is School grade and Class of Student (e.g. 1-A, 2-B)
    * @param imageResourceId is drawable reference ID that corresponds to the Student
    * @param Mathematics is Student's grade of Mathematics
    * @param Language is Student's grade of Language
    * @param Civics is Student's grade of Civics
    * @param Science is Student's grade of Science
    * */
    public ReportCard(String studentName, String studentClass, int imageResourceId) {
        mStudentName = studentName;
        mStudentClass = studentClass;
        mImageResourceId = imageResourceId;
    }

    public ReportCard(String studentName, String studentClass, int imageResourceId,
                      String gradeMathematics, String gradeLanguage,
                      String gradeCivics, String gradeScience) {
        mStudentName = studentName;
        mStudentClass = studentClass;
        mImageResourceId = imageResourceId;
        mGradeMathematics = gradeMathematics;
        mGradeLanguage = gradeLanguage;
        mGradeCivics = gradeCivics;
        mGradeScience = gradeScience;
    }

    /**
     * getter
     **/
    public String getmStudentName() {
        return mStudentName;
    }


    public String getmStudentClass() {
        return mStudentClass;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmGradeMathematics() {
        return mGradeMathematics;
    }

    public String getmGradeLanguage() {
        return mGradeLanguage;
    }

    public String getmGradeCivics() {
        return mGradeCivics;
    }

    public String getmGradeScience() {
        return mGradeScience;
    }

    /**
     * setter
     **/
    public void setmStudentName(String mStudentName) {
        this.mStudentName = mStudentName;
    }

    public void setmStudentClass(String mStudentClass) {
        this.mStudentClass = mStudentClass;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public void setmGradeMathematics(int scoreMathematics) {
        String grade = "D";
        if (scoreMathematics > GRADE_A) {
            grade = "A";
        } else if (scoreMathematics > GRADE_B) {
            grade = "B";
        } else if (scoreMathematics > GRADE_C) {
            grade = "C";
        }
        this.mGradeMathematics = grade;
    }

    public void setmGradeLanguage(int scoreLanguage) {
        String grade = "D";
        if (scoreLanguage > GRADE_A) {
            grade = "A";
        } else if (scoreLanguage > GRADE_B) {
            grade = "B";
        } else if (scoreLanguage > GRADE_C) {
            grade = "C";
        }
        this.mGradeLanguage = grade;
    }

    public void setmGradeCivics(int scoreCivics) {
        String grade = "D";
        if (scoreCivics > GRADE_A) {
            grade = "A";
        } else if (scoreCivics > GRADE_B) {
            grade = "B";
        } else if (scoreCivics > GRADE_C) {
            grade = "C";
        }
        this.mGradeCivics = grade;
    }

    public void setmGradeScience(int scoreScience) {
        String grade = "D";
        if (scoreScience > GRADE_A) {
            grade = "A";
        } else if (scoreScience > GRADE_B) {
            grade = "B";
        } else if (scoreScience > GRADE_C) {
            grade = "C";
        }
        this.mGradeScience = grade;
    }

    @Override
    public String toString() {
        String message = "Message";
        message += "Student name:" + mStudentName;
        message += "Student class:" + mStudentClass;
        message += "Mathematics:" + mGradeMathematics;
        message += "Language:" + mGradeLanguage;
        message += "Civics:" + mGradeCivics;
        message += "Science:" + mGradeScience;
        return message;
    }
}
