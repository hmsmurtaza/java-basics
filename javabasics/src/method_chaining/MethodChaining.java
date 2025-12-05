package method_chaining;

public class MethodChaining {
    private String name;
    private int id;

    public MethodChaining setName(String name) {
        this.name = name;
        return this;
    }

    public MethodChaining setId(int id) {
        this.id = id;
        return this;
    }

    public void printDetails() {
        System.out.println("Name: " + name + " ID: " + id);
    }

    public static void main(String[] args) {
        new MethodChaining().setId(123).setName("Murtaza").printDetails();
    }
}
