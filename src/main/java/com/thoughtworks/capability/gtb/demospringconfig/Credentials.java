package com.thoughtworks.capability.gtb.demospringconfig;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Credentials {
    private String username;
    private String password;
    private String authMethod;
}
