package com.gaurav.boot.devtool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test()    {
        int a= 20, b=200;        //If we change value after running then again project stop and rerun required this can be overcome by devtools
        return "this is just for test /t sum of a and b is "+(a+b);
    }
}
