package data;

public abstract class User {
    private String FirstName;
    private String lastName;
    int id;

    public User(String firstName, String lastName, int id) {
        FirstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
