
package com.example.nikma.json;



public class Listitem {


    private String name;

    private String email;
    public Listitem(String name,String email){
    this.name = name;
    this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
