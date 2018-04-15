package demo.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * 
 * Create by ginz on 18/04/15
 */
@Controller
public class HelloWorldController {

  @RequestMapping(value="/",method=RequestMethod.GET)
  @ResponseBody
  public String sayHello() {
    return"Hello,World!";
  }
}
