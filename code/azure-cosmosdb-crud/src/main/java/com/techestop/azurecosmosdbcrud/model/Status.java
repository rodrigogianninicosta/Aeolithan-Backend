package com.techestop.azurecosmosdbcrud.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Status {
    @JsonProperty("life")
    private String life;
    @JsonProperty("attack")
    private String attack;
    @JsonProperty("magic")
    private String magic;
    @JsonProperty("defense")
    private String defense;
    @JsonProperty("speed")
    private String speed;
}
