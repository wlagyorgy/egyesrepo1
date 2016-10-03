package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@Controller
//public class GreetingController
//{
//    @Autowired
//    private MyBean bean;
//
//    @RequestMapping("/greeting")
//    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model)
//    {
//        model.addAttribute("name", bean.modifyName(name));
//        model.addAttribute("scale", bean.scale());
//        return "greeting";
//    }
//
//}