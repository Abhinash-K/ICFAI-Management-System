
package modles;


public class Conformation 
{    
    private Integer usercode;    
    private String userfname;    
    private String userlname;
    private String userid;
    private String mobilenumber;
    private String coursename;
    private String userstatus;    
    private String roles; 

    public Conformation() {
    }

    public Conformation(String userfname, String userlname, String userid, String mobilenumber, String coursename) {
        this.userfname = userfname;
        this.userlname = userlname;
        this.userid = userid;
        this.mobilenumber = mobilenumber;
        this.coursename = coursename;
        this.userstatus = userstatus;
        this.roles = roles;
        this.usercode = usercode;
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

    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }
    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getCoursename() {
        return coursename;
    }
    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getUserstatus() {
        return userstatus;
    }
    public void setUserstatus(String userstatus) {
        this.userstatus = userstatus;
    }

    public String getRoles() {
        return roles;
    }
    public void setRoles(String roles) {
        this.roles = roles;
    }
     
    
}
