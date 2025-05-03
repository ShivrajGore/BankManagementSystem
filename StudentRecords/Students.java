package StudentRecords;

public class Students {
    int id;
    String name;
    int marks;

    public Students(int id, String name, int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    public void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
