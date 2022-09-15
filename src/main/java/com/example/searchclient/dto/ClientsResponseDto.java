package com.example.searchclient.dto;

import com.example.searchclient.domain.Client;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientsResponseDto {

    List<Client> clients;

}
