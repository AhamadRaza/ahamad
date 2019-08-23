import java.io.Serializable;
public class Student implements Serializable {
  public static void main(String args[]){
    private int sno;
    private String sname;
    private String semail;
    private String smobile;
    
    public int getSno(){
      return sno;
    }
    public void setSno(int no){
      this.sno=sno;
    }
    
    public String getSname(){
      return sname;
    }
    public void setSname(String sname){
      this.sname=sname;
    }
    
    public String getSemail(){
      return eemail;
    }
    public void setSemail(String semail){
      this.semail=semail;
    }
    public String getSmobile(){
      return smobil;
    }
    public void setSmobile(String smobile){
      this.smobile=smobile;
    }
    
  }


}
