package py.com.ci.academy.course.entities;

public class Course {
    private int courseId;
    private String courseName;
    private int teacherId;
    private String teacherName;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "courseId = " + courseId +
                "\n courseName = " + courseName +
                "\n teacherId = " + teacherId +
                "\n teacherName = " + teacherName +
                "\n-----------------------------------";
    }
}
