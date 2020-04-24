package TechnicalBlog.Controller;
import TechnicalBlog.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class UserController {
    @RequestMapping("users/login")
    public String login()
    {
        return "users/login";
    }


    @RequestMapping("users/registration")
    public String registration()
    {
        return "users/registration";
    }

    @RequestMapping(value="users/login",method = RequestMethod.POST)
    public String loginUser(User user)
    {
        boolean name=user.getUsername().equals("abc");
        boolean pwd=user.getPassword().equals("123");

        if(name && pwd)
        {
            return "redirect:/posts";
        }
        else
        {
            return "users:/login";
        }
    }
//    @RequestMapping("/hellospring")
//    @ResponseBody
//    public String helloWorld() {
//        return "hello World";
//    }
//    @RequestMapping("/homepage")
//    @ResponseBody
//    public String homePage() {
//        return "home Page";
//    }
//    @RequestMapping("/courses")
//    @ResponseBody
//    public String courses() {
//        return "courses";
//    }


}
