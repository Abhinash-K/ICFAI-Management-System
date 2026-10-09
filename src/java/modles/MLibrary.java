package modles;

public class MLibrary 
{
    private Integer bookcode;
    private String bookname;
    private String author;
    private String ibsnnumber;
    private Short copies;
    private Short available;
    private String entrydate;

    public MLibrary() {
    }

    public Integer getBookcode() {
        return bookcode;
    }
    public void setBookcode(Integer bookcode) {
        this.bookcode = bookcode;
    }

    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIbsnnumber() {
        return ibsnnumber;
    }
    public void setIbsnnumber(String ibsnnumber) {
        this.ibsnnumber = ibsnnumber;
    }

    public Short getCopies() {
        return copies;
    }
    public void setCopies(Short copies) {
        this.copies = copies;
    }

    public Short getAvailable() {
        return available;
    }
    public void setAvailable(Short available) {
        this.available = available;
    }

    public String getEntrydate() {
        return entrydate;
    }
    public void setEntrydate(String entrydate) {
        this.entrydate = entrydate;
    }
    
    
    
}
