package com.shaik.messageintegration.service.implementation;

import com.shaik.messageintegration.entity.GetAllMessagesEntity;
import com.shaik.messageintegration.repository.GetAllMessagesRepo;
import com.shaik.messageintegration.service.GetAllMessagesService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GetAllMessagesServiceImplTest {


    @InjectMocks
    private GetAllMessagesServiceImpl getAllMessagesService = new GetAllMessagesServiceImpl();

    @Mock
    public GetAllMessagesRepo getAllMessagesRepo;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllMessages_test(){

        List<GetAllMessagesEntity> list= new ArrayList<GetAllMessagesEntity>();
        GetAllMessagesEntity getAllMessagesEntity = new GetAllMessagesEntity();
        getAllMessagesEntity.setName("abcd");
        getAllMessagesEntity.setAge(5);
        getAllMessagesEntity.setId(1);
        getAllMessagesEntity.setAddressState("TS");
        getAllMessagesEntity.setAddressCity("HYD");
        getAllMessagesEntity.setGender("M");
        list.add(getAllMessagesEntity);

        Page<GetAllMessagesEntity> pagedResult = Mockito.mock(Page.class);
        //when(getAllMessagesRepo.findAll(any())).thenReturn(pagedResult);
        Mockito.when(getAllMessagesRepo.findAll(org.mockito.ArgumentMatchers.isA(Pageable.class))).thenReturn(pagedResult);

        List<GetAllMessagesEntity>  response = getAllMessagesService.getAllMessages(1,5);
        //System.out.println("response" + response);
        Assert.assertEquals(response.size(),0);

    }
}
