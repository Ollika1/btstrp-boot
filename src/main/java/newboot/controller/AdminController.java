package newboot.controller;

import newboot.model.User;
import newboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public String adminHome(ModelMap model){
        model.addAttribute("list",userService.getAllUsers());
        model.addAttribute("allRoles", userService.getAllRoles());
        model.addAttribute("newUser", new User());
        return "admin";
    }

    @PostMapping("")
    public String create(@ModelAttribute("addUser") User user){
        userService.save(user);
        return "redirect:/admin/";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user, @PathVariable("id") Long id){
        userService.edit(id, user);
        return "redirect:/admin";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id){
        userService.delete(id);
        return "redirect:/admin";
    }

//    @GetMapping("/{id}")
//    public String show(@PathVariable("id") Long id, Model model){
//        model.addAttribute("person", userService.getById(id));
//        return "show";
//    }
//    @GetMapping("/new")
//    public String newPerson(Model model){
//        model.addAttribute("person", new User());
//        return "new";
//    }
//    @GetMapping("/{id}/edit")
//    public String edit(Model model, @PathVariable("id") Long id){
//        model.addAttribute("user",userService.getById(id));
//        return "edit";
//    }

}
