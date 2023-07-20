package com.shaik.messageintegration.controller;

import com.shaik.messageintegration.entity.GetAllMessagesEntity;
import com.shaik.messageintegration.service.GetAllMessagesService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GetAllMessagesControllerTest {

    @InjectMocks
    private GetAllMessagesController getAllMessagesController = new GetAllMessagesController();

    @Mock
    GetAllMessagesService  getAllMessagesService;

    @Test
    public void getAllMessages_test(){

        List<GetAllMessagesEntity> listGetAllMessagesEntity = new ArrayList<GetAllMessagesEntity>();

        GetAllMessagesEntity getAllMessagesEntity  = new GetAllMessagesEntity();
        getAllMessagesEntity.setAddressCity("Hyderabad");
        getAllMessagesEntity.setAddressState("TS");
        getAllMessagesEntity.setAge(30);
        getAllMessagesEntity.setGender("M");
        getAllMessagesEntity.setId(1);
        getAllMessagesEntity.setName("Name");
        listGetAllMessagesEntity.add(getAllMessagesEntity);

        when(getAllMessagesService.getAllMessages(1,5)).thenReturn(listGetAllMessagesEntity);

        ResponseEntity<?>  response = getAllMessagesController.getAllMessages(1,5);

        Assert.assertEquals(response.getStatusCode().is2xxSuccessful(),true);


    }

}
