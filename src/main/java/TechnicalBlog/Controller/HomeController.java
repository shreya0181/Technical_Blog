package TechnicalBlog.Controller;

import TechnicalBlog.Model.Post;
import TechnicalBlog.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;

@Controller
public class HomeController {

    //response body annotation sirf tb use hoti hai jb hmei koi string return kraani hai agar koi html page open krana hai to req mapping use hota hai
    @RequestMapping("/posts")
       public String getAllPosts(Model model)
       {
           PostService postService=new PostService();
          ArrayList<Post> list=postService.getAllPosts();
           Post p1=new Post();
           p1.setId(1);
           p1.setTitle("java");
           p1.setBody("java is a programming language");
           p1.setDate(new Date());

           Post p2=new Post();
           p2.setId(2);
           p2.setTitle("c++");
           p2.setBody("c++ is a programming language");
           p2.setDate(new Date());

           Post p3=new Post();
           p3.setId(3);
           p3.setTitle("c");
           p3.setBody("c is a programming language");
           p3.setDate(new Date());

           list.add(p1);
           list.add(p2);
           list.add(p3);

           model.addAttribute("posts",list);

           return "index";
       }
}
