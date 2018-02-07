package se.tempcoder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

@Controller

public class StarterController extends HttpServlet {

    @RequestMapping("/hello")
    public ModelAndView showPage(HttpSession session) {

        ModelAndView mv = new ModelAndView("hello");

        mv.addObject("test", "This is just text that can be sent back to the view, Strings, object and so on");

        return mv;

    }

}
