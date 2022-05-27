package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
@Controller
public class MvcController{
    ArrayList<Customer> custlist = new ArrayList<>();
    List<String> userslist = new ArrayList<>();
    ArrayList<String> selectedusers = new ArrayList<>();
    //ArrayList<String> users = new ArrayList<>();
    @Bean 
    public List<String> demo(CustomerRepository repository){
        return (args) -> {
            //adding customers in repository
            repository.save(new Customer("ravi","ravi"));
            repository.save(new Customer("rani","rani"));
            repository.save(new Customer("grp1","raju,chutki"));
            repository.save(new Customer("grp2","ramesh,suresh"));
            for(Customer cus:repository.findAll()){
                    custlist.add(cus);
                    userslist.add(cus.getName());
            }
    
            for(String i:userslist){
                System.out.println(i);
            }
            //return userlist;
        };
    } 
    @RequestMapping("/")
    public String home() {
        System.out.println("Going home...");
        return "index";

    }
    @GetMapping("/dropdownform")
    public String listUsers(Model model){
        System.out.println("fhkjhl");
        System.out.println(userslist);
        model.addAttribute("message",userslist);
        //model.addAttribute("users",users);
        return "/dropdownform";
    }
    @GetMapping("/register_success")
    public String showusers(){
        return "register_success";
    }
}