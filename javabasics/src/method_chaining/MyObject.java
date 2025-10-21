package method_chaining;

public class MyObject {
    private String name;
    private int value;

    public MyObject setName(String name){
        this.name = name;
        return this;    // returns the current object
    }

    public MyObject setValue(int value) {
        this.value = value;
        return this;
    }

    public void printDetails() {
        System.out.println("Name: " + name + " Value: " + value);
    }

    public static void main(String[] args) {
        MyObject object = new MyObject().setName("Shoaib").setValue(2);
        object.printDetails();
    }

}