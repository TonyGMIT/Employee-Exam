package ie.gmit.exam;

public class Employee {
    private String title;
    //private String name;
    //private String pps;
    //private long phone;
    private String empType;
    private int age;

    public String getTitle() {return title;}
    //public String getName() {return name;}
    //public String getPPS() {return pps;}
    //public long getPhone() {return phone;}
    public String getEmploymentType() {return empType;}
    public int getAge() {return age;}

    public Employee(String title, String empType, int age) {
        setTitle(title);
        //setName(name);
        //setPPS(pps);
        //setPhone(phone);
        setEmploymentType(empType);
        setAge(age);
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
    private void setAge(int age) {
        if (age > 16){
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be over 16!");
        }

    }

}
