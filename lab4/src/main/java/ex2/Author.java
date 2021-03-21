package ex2;

public class Author {

    public String name;
    public String email;
    public char gender;

    public Author(){

    }

    public Author(String name, String email, char gender){
        this.name=name;
        this.email=email;
        if(gender=='m' || gender=='f') {
            this.gender = gender;
        }

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString () {

        return name + " (" + gender + ") at " + email;
    }
}