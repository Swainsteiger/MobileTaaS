package com.example.controller;

import com.example.beans.WebRequest;
import com.example.beans.WebResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping("/")
    public String getHomepage() {
        return "index";
    }


    @RequestMapping(value="/sample",method = RequestMethod.POST)
    public WebResponse WebRequest (@RequestBody WebRequest inputPayload)
    //Sample(@RequestParam(value = "name",defaultValue = "Robot") String name)
    {
        Services servobj = new Services();
        WebResponse response = new WebResponse();

       // System.out.println("user id " +response.getEmail() +"  id :  "+response.());
        response.setUserid(inputPayload.getUserid());
        response.setEmail( inputPayload.getEmail());
        response.setFirstname(inputPayload.getFirstname());
        response.setLastname( inputPayload.getLastname());
        response.setPassword(inputPayload.getPassword());


        //call DB insert
        servobj.create_data(inputPayload.getUserid(),inputPayload.getFirstname(),inputPayload.getLastname(),inputPayload.getEmail(),inputPayload.getPassword());
       return response;

    }


   /* @RequestMapping(value = "/test", )
    public PostResponse Test(@RequestBody PostRequest inputPayload) {
        PostResponse response = new PostResponse();
        response.setId(inputPayload.getId()*100);
        response.setMessage("Hello " + inputPayload.getName());
        response.setExtra("Some text");
        return response;
    }*/
}