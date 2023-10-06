package Computer_lab_inventory_system;

public class Lab {

    private String labID;
    Computer Computers[]=new Computer[10];
    private LabStatus Status;
    private static String designation ="lab Ateendant";
    int computercount=0;
    Lab(){

    }

    public Lab(String labID, Computer[] computers, LabStatus status) {
        this.labID = labID;
        Computers = computers;
        Status = status;
    }


    public String getLabID() {
        return labID;
    }

    public void setLabID(String labID) {
        this.labID = labID;
    }

    public Computer[] getComputers() {
        return Computers;
    }

    public void setComputers(Computer[] computers) {
        Computers = computers;
    }

    public LabStatus getStatus() {
        return Status;
    }

    public void setStatus(LabStatus status) {
        Status = status;
    }

    public static String getDesignation() {
        return designation;
    }

    public static void setDesignation(String designation) {
        Lab.designation = designation;
    }
    public void addcomputer(Computer computer){
        if(computercount<Computers.length){
            Computers[computercount++]= computer;
        }
        else{
            System.out.println("No Space!!!!!!!!!!!!!!!!!1");
        }
    }
    public void removedata(String Computerno){
        for (int i=0;i<computercount;i++){
            if(Computers[i].getIcdModel().equals(Computerno));
            for(int j=i;j<computercount-1;j++)
            {
               Computers[j]=Computers[j+1];
            }
            Computers[computercount-1]=null;
            computercount--;
            break;
        }
    }
}
