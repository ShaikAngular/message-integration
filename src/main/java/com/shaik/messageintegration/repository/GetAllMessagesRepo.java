package com.shaik.messageintegration.repository;

import com.shaik.messageintegration.entity.GetAllMessagesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GetAllMessagesRepo extends JpaRepository<GetAllMessagesEntity, Integer> {
    @Query(nativeQuery = true,value="SELECT * FROM 100k")
    List<GetAllMessagesEntity> allMessages();
}
