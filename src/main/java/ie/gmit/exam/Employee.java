package ie.gmit.exam;

public class Employee {
    private String title;

    public String getTitle() {return title;}

    public Employee(String title) {
        setTitle(title);
    }

    private void setTitle(String title)  {
        if(title == "Mr" || title == "Mrs" ||title == "Ms"){
            this.title = title;
        }
        else{
              throw new IllegalArgumentException("Invalid Title!");
        }
    }




}
