package com.shaik.messageintegration.service.implementation;

import com.shaik.messageintegration.entity.GetAllMessagesEntity;
import com.shaik.messageintegration.repository.GetAllMessagesRepo;
import com.shaik.messageintegration.service.GetAllMessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllMessagesServiceImpl implements GetAllMessagesService {

    @Autowired
    public GetAllMessagesRepo getAllMessagesRepo;
    @Override
    public List<GetAllMessagesEntity> getAllMessages(int pageNo, int pageSize) throws NullPointerException {
        Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<GetAllMessagesEntity> pagedResult = getAllMessagesRepo.findAll(paging);
        //return getAllMessagesRepo.allMessages();
        return pagedResult.toList();
    }
}
