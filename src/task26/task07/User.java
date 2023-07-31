package task26.task07;

import java.util.Scanner;
public class User { //POJO CLASS
    private String name;
    private String password;
    private int id;
    private boolean active;
    private boolean signedIn;

    static Scanner input = new Scanner(System.in);

    public User() {
    }

    public User(String name, String password, int id, boolean active, boolean signedIn) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.active = active;
        this.signedIn = signedIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String ad) {
        this.name = name;
    }

    public String getPassword() {
      return password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
}
