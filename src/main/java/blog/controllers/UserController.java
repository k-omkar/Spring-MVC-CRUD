package blog.controllers;


import blog.models.User;
import blog.services.NotificationService;
import blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notifyService;

    @RequestMapping("/users/list_users")
    public String list_users(Model model) {
        List<User> allUsers = userService.listUsers();

       if(allUsers == null) {
        notifyService.addErrorMessage("No Registered users found");
        return "redirect:/";
        }

        model.addAttribute("allUsers", allUsers);

        return "users/list_users";
    }

}
