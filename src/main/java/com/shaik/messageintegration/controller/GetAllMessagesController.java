package com.shaik.messageintegration.controller;

import com.shaik.messageintegration.entity.GetAllMessagesEntity;
import com.shaik.messageintegration.service.GetAllMessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@RestController
public class GetAllMessagesController {

    @Autowired
    private GetAllMessagesService getAllMessagesService;

    @GetMapping("/allMessages/index={pageNo}&limit={pageSize}")
    public List<GetAllMessagesEntity> getAllMessages(@PathVariable int pageNo,
                                                     @PathVariable int pageSize){
        return getAllMessagesService.getAllMessages(pageNo, pageSize);
    }
}
