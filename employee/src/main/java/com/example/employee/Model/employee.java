package com.example.employee.Model;

public class employee {
    
    private long id;
    private String firstname;
    private String lastname;
    private String email;

    public employee(){

    }

    public employee(long id,String firstname,String lastname,String email){
        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;

    }
    public long getid(){
        return id;
    }
    public void setid(long id){
        this.id=id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
    }

}
