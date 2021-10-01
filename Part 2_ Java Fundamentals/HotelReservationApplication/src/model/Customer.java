package model;

import java.util.regex.Pattern;

public class Customer {
    protected String firstName;
    protected String lastName;
    protected String email;

    public Customer(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;

        String emailRegex = "^(.+)@(.+).com$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (pattern.matcher(email).matches()){
            this.email = email;}
        else{
            throw new IllegalArgumentException("\"" + email + "\"" + " is not a valid email address");
        }
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setEmail(String email){
        String emailRegex = "^(.+)@(.+).com$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (pattern.matcher(email).matches()){
            this.email = email;}
        else{
            throw new IllegalArgumentException("\"" + email + "\"" + " is not a valid email address");
        }
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getEmail(){
        return this.email;
    }

    @Override
    public String toString(){
        return this.firstName + " " + this.lastName + "'s email address is:" + this.email;

    }
}
