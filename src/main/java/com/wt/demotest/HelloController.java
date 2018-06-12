package com.wt.demotest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

  @RequestMapping(method = RequestMethod.GET)
  public BaseResponse hello() {
    BaseResponse response = new BaseResponse();

    response.setStatus("Success");
    response.setCode(200);
    response.setMessage("It Worked | Powerup Cloud");
    return response;
  }
}
