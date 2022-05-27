package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; 
import javax.persistence.Id;

@Entity
public class Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String members;
    public Customer(){
        
    }

    public Customer(String name, String members){
        this.name=name;
        this.members=members;
        
    }

    @Override
    public String toString() {
        return String.format("User[id=%d,name=%s,members='%s']",id,name,members);
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getMembers(){
        return members;
    }

}
