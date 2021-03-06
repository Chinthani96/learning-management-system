package entity;

import java.io.Serializable;

public class StudentCoursePK implements Serializable {
    private String studentId;
    private String courseId;

    public StudentCoursePK() {
    }

    public StudentCoursePK(String studentId, String courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}
