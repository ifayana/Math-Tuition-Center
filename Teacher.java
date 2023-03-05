// createed by team in Bangalore
public class Teacher {
    // data
    private String name;
    private String ic;
    private String address;
    private int numyearexp;
    private String qualification;
  
  //constructor
    public Teacher(String name, String IC, String address, String qualification, int numyearexp) {
        this.name = name;
        this.ic= ic;
        this.address = address;
        this.qualification = qualification;
        this.numyearexp = numyearexp;
    }
    
    //getters and setters
    public String getname() {
        return name;
    }
    
    public void setname(String name) {
        this.name = name;
    }
    
    public String getic() {
        return ic;
    }
    
    public void setIC(String IC) {
        this.ic = ic;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }  
    
}
