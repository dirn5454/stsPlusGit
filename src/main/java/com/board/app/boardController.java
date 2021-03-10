package com.board.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/board/*")
public class boardController {

 @RequestMapping(value = "/list", method = RequestMethod.GET)
 public void getList() throws Exception {
  
   
 }
}