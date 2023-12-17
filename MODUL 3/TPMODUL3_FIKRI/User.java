import java.util.ArrayList;

class User {
    protected String Name;
    protected int id;

    public User(String name, int id) {
        Name = name;
        this.id = id;
    }

    public String getUserDetails() {
        return "Name: " + Name + ", ID: " + id;
    }
}
