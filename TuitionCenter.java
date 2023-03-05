public class TuitionCenter {
    String Address;
    String headmaster;
    int listTutor;
    int date;
    
    public TuitionCenter(String Address, String headmaster, int listTutor, int date){
        this.Address=Address;
        this.headmaster=headmaster;
        this.listTutor=listTutor;
        this.date=date;
    }
    
    //getters and setters
    public String getAddress() {
        return Address;
    }
    
    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    public String getheadmaster() {
        return headmaster;
    }
    
    public void setheadmaster(String headmaster) {
        this.headmaster= headmaster;
    }
    
    public int listTutor() {
        return listTutor;
    }
    
    public void setlistTutor(int listTutor) {
        this.listTutor = listTutor;
    }
    
    public int setdate(){
        return date;
    }
    public void setdate(int date){
        this.date=date;
    }
}
