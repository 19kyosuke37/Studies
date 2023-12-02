package Capsule;

public class EmployeeCap {
    
    private String employeeName;
    private int vitality;
    
    public EmployeeCap() {
        
    }
    
    public EmployeeCap(String employeeName, int vitality) {
        this.employeeName = employeeName;
        this.vitality = vitality;
    }
    
    //employeeNameのgetter,setter
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    //vitalityのgetter,setter
    public int getVitality() {
        return vitality;
    }
    public void setVitality(int vitality) {
        this.vitality = vitality;
    }
    
    

}
