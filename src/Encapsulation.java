package src;

class Object {

    private String name;
    private int ID;

    public Object(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Object obj = new Object("Deepti", 25);
        System.out.println(obj.getName());
    }
}
