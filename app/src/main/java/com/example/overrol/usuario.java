package com.example.overrol;

public class usuario {
    public String username;
    public  String genero;
    public String email;
    public boolean acepto;

    public usuario(){

    }

    public usuario(String username, String genero, String email, boolean acepto){
        this.username=username;
        this.genero=genero;
        this.email=email;
        this.acepto=acepto;
    }
}
