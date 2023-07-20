package com.shaik.messageintegration.controller;

import com.shaik.messageintegration.entity.GetAllMessagesEntity;
import com.shaik.messageintegration.models.BadRequestResponse;
import com.shaik.messageintegration.service.GetAllMessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class GetAllMessagesController {

    @Autowired
    private GetAllMessagesService getAllMessagesService;

   // @PostMapping("/allMessages/index={pageNo}&limit={pageSize}")
   @PostMapping("/allMessages")
//    public List<GetAllMessagesEntity> getAllMessages(
      public ResponseEntity<?> getAllMessages(
//            @PathVariable int pageNo,
//            @PathVariable int pageSize,
            @RequestParam(value="index",required = true) int pageNo,
            @RequestParam(value="limit",required = true) int pageSize
            ) {

       try {
           List<GetAllMessagesEntity> result = getAllMessagesService.getAllMessages(pageNo, pageSize);

           if (!CollectionUtils.isEmpty(result)) {
               return  new ResponseEntity<>(result,HttpStatus.OK);
           } else {
               System.out.println("null");
               return new ResponseEntity<>(new BadRequestResponse("404","404","No record Found"),HttpStatus.NOT_FOUND);
           }

       } catch (Exception e) {
           System.out.println("error" + e);
           return new ResponseEntity<>("500-Internal server error",HttpStatus.INTERNAL_SERVER_ERROR);
       }
       //return getAllMessagesService.getAllMessages(pageNo, pageSize);
   }


}
