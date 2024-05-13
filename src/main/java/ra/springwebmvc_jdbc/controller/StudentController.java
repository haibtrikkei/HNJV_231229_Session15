package ra.springwebmvc_jdbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.springwebmvc_jdbc.dao.impl.StudentDAOImpl;
import ra.springwebmvc_jdbc.entity.Student;

import java.util.List;

@Controller
//@RequestMapping("/user")
public class StudentController {
    @RequestMapping(value = {"/","/home"})
    public String home(Model model){
        List<Student> list = new StudentDAOImpl().getStudents();
        model.addAttribute("list",list);
        return "home";
    }
}
