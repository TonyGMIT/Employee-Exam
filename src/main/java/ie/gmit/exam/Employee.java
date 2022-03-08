package ie.gmit.exam;

public class Employee {
    private String title;
    //private String name;
    //private String pps;
    //private long phone;
    private String empType;

    public String getTitle() {return title;}
    //public String getName() {return name;}
    //public String getPPS() {return pps;}
    //public long getPhone() {return phone;}
    public String getEmploymentType() {return empType;}

    public Employee(String title, String empType) {
        setTitle(title);
        //setName(name);
        setEmploymentType(empType);
    }

    private void setTitle(String title) {
        if (title == "Mr" || title == "Mrs" || title == "Ms") {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Invalid Title!");
        }
    }
    private void setEmploymentType(String empType) {
        if (empType == "Full-time" || empType == "Part-time" || empType == "Contract"){
            this.empType = empType;
        } else {
            throw new IllegalArgumentException("Invalid Employment Type!");
        }

    }
//    private void setName(String name) {
//        if(toString().length())
//
//    }


}
