package com.example.overrol;

public class usuario {
    public String username;
    public  String genero;
    public String email;
  //  public boolean acepto;

    public usuario(){

    }

    public usuario(String username, String genero, String email){
        this.username=username;
        this.genero=genero;
        this.email=email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
