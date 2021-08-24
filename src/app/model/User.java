package app.model;

public class User {

    final String user;
    final String password;
    final String email;

    public User(String user, String password, String email) {
        this.user = user;
        this.password = password;
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        String encrpty = "";
        for (int i = 0; i < this.password.length(); i++) {
            encrpty += "*";
        }
        return this.user + " " + encrpty + " " + this.email;
    }
}
