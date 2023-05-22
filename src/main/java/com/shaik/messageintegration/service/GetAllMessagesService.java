package com.shaik.messageintegration.service;

import com.shaik.messageintegration.entity.GetAllMessagesEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.data.domain.Pageable;

@Service
public interface GetAllMessagesService {

    public List<GetAllMessagesEntity> getAllMessages(int pageNo, int pageSize );
}
