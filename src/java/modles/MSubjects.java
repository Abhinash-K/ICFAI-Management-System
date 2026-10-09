
package modles;


public class MSubjects 
{
    private Short subjectcode;
    private String subjectname;

    public MSubjects() {
    }

    public MSubjects(Short subjectcode, String subjectname) {
        this.subjectcode = subjectcode;
        this.subjectname = subjectname;
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
