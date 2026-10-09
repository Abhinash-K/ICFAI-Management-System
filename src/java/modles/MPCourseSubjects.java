
package modles;


public class MPCourseSubjects 
{
    private Short coursecode;
    private String coursename;
    private Short subjectcode;
    private String subjectname;

    public MPCourseSubjects() {
    }

    public MPCourseSubjects(Short coursecode, String coursename, Short subjectcode, String subjectname) {
        this.coursecode = coursecode;
        this.coursename = coursename;
        this.subjectcode = subjectcode;
        this.subjectname = subjectname;
    }

    public Short getCoursecode() {
        return coursecode;
    }
    public void setCoursecode(Short coursecode) {
        this.coursecode = coursecode;
    }
    
    public String getCoursename() {
        return coursename;
    }
    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
    
    public Short getSubjectcode() {
        return subjectcode;
    }
    public void setSubjectcode(Short subjectcode) {
        this.subjectcode = subjectcode;
    }

    public String getSubjectname() {
        return subjectname;
    }
    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

            
}
