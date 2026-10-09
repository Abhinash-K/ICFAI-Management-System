
package modles;


public class Certificatre 
{
    private Integer usercode;    
    private Short coursecode;    
    private String coursename;    
    private Short semistercode;    
    private Short regyear;    

    public Certificatre() {
    }

    public Integer getUsercode() {
        return usercode;
    }
    public void setUsercode(Integer usercode) {
        this.usercode = usercode;
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
    
    public Short getSemistercode() {
        return semistercode;
    }
    public void setSemistercode(Short semistercode) {
        this.semistercode = semistercode;
    }

    public Short getRegyear() {
        return regyear;
    }
    public void setRegyear(Short regyear) {
        this.regyear = regyear;
    }
    
    
}
