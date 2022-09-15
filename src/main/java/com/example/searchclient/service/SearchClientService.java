package com.example.searchclient.service;

import com.example.searchclient.domain.Client;
import com.example.searchclient.dto.ClientsResponseDto;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.utility.RandomString;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;

@Service
@Slf4j
@Validated
public class SearchClientService {

    private static final int MAX_RUN = 1000;

    public ClientsResponseDto execute(){

        var listClients = new ArrayList<Client>();
        var run = 0;
        while (run < MAX_RUN){
            listClients.add(Client.builder().name("Will " + new RandomString().nextString()).build());
            run++;
        }


        return ClientsResponseDto.builder().clients(listClients).build();
    }
}
