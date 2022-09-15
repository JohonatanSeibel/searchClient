package com.example.searchclient.controller;

import com.example.searchclient.SearchClientApplication;
import com.example.searchclient.dto.ClientsResponseDto;
import com.example.searchclient.service.SearchClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@Slf4j
@RestController
@Api(tags = "Clients")
@Validated
@RequiredArgsConstructor
public class clientController {

    private final SearchClientService searchClientService;

    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping(path = "clients", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Returns the list of customer clients accounts")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Clients successfully listed."),
            @ApiResponse(code = 500, message = "Internal server error when listing clients.")})
    public ClientsResponseDto listAccounts() {
        log.trace("List all clients.");

        return searchClientService.execute();
    }
}
