package grace.onlinecart.mycart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import grace.onlinecart.mycart.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import grace.onlinecart.mycart.model.Customer;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;




@Controller
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("")
    public String home(Model model ,HttpSession session) {
        model.addAttribute("session",session);
        model.addAttribute("data",service.read());
        return "admin/home";
    }
    
    @GetMapping("/create")
    public String create() {
        return "/admin/create";
    }
    
    @PostMapping("/create")
    public String createPost(@ModelAttribute Customer customer,Model model) {
        Customer c=service.create(customer);
        if(c==null){
            model.addAttribute("msg","Not able to create!Try later!");
        }
        else{
            model.addAttribute("msg",c.getName()+" Registered");
        }
        return "/admin/create";
    }

    @GetMapping("/delete")
    public String delete() {
        return "/admin/delete";
    }

    @GetMapping("/edit")
    public String edit() {
        return "/admin/edit";
    }

    @Autowired
    private CustomerService service;
}
