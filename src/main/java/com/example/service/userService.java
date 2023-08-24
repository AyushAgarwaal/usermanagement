// package com.example.service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import org.springframework.web.client.RestTemplate;

// import com.example.model.userModel;

// @Service
// public class userService {

//     @Autowired
//     private RestTemplate template = new RestTemplate();

//     public Object[] findAllUsersComplete() {
//         return template.getForObject("https://qa2.sunbasedata.com/sunbase/portal/api/assignment.jsp ", Object[].class);
//     }

//     public userModel[] findAllUsers() {
//         return template.getForObject("https://qa2.sunbasedata.com/sunbase/portal/api/assignment.jsp",
//                 userModel[].class);
//     }

// }