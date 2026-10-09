
package modles;


public class TMarks 
{
    private Integer usercode;
    private String userlname;
    private String userfname;
    private String coursename;
    private String subjectname;
    private Short regyear;
    private Short marks;
    private String rollno; 

    public TMarks() {
    }

    public Integer getUsercode() {
        return usercode;
    }
    public void setUsercode(Integer usercode) {
        this.usercode = usercode;
    }

    public String getUserfname() {
        return userfname;
    }
    public void setUserfname(String userfname) {
        this.userfname = userfname;
    }

    public String getUserlname() {
        return userlname;
    }
    public void setUserlname(String userlname) {
        this.userlname = userlname;
    }

    public String getCoursename() {
        return coursename;
    }
    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getSubjectname() {
        return subjectname;
    }
    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public Short getRegyear() {
        return regyear;
    }
    public void setRegyear(Short regyear) {
        this.regyear = regyear;
    }

    public Short getMarks() {
        return marks;
    }
    public void setMarks(Short marks) {
        this.marks = marks;
    }

    public String getRollno() {
        return rollno;
    }
    public void setRollno(String rollno) {
        this.rollno = rollno;
    }    
}
