
package modles;


public class MCourses 
{
    private Short coursecode;
    private String coursename;
    private Short fee;
    private Short duration;

    public MCourses() {
    }

    public MCourses(Short coursecode, String coursename, Short fee, Short duration) {
        this.coursecode = coursecode;
        this.coursename = coursename;
        this.fee = fee;
        this.duration = duration;
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

    public Short getFee() {
        return fee;
    }
    public void setFee(Short fee) {
        this.fee = fee;
    }

    public Short getDuration() {
        return duration;
    }
    public void setDuration(Short duration) {
        this.duration = duration;
    }
            
}
