package com.example.api_call;

public class CourseModal {
    private String courseName;
    private String courseimg;

    public CourseModal(String courseName, String courseimg) {
        this.courseName = courseName;
        this.courseimg = courseimg;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseimg() {
        return courseimg;
    }

    public void setCourseimg(String courseimg) {
        this.courseimg = courseimg;
    }
}
