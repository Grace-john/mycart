package grace.onlinecart.mycart.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpServletRequest;


@Controller
public class GuestController {
    @GetMapping("/")
    public String home(){
        return "guest/home";
    }
    
    @GetMapping("/login")
    public String login(){
        return "guest/login";
    }

    @PostMapping("/login")
    public String loginCheck(@RequestParam String userName,@RequestParam String password,Model model,HttpServletRequest req){
        
        System.out.println(userName +"," +password);
        
        
        return "guest/login";
    }

    @GetMapping("/logout")
    public String logout(){
        return "guest/login";
    }

    


}
