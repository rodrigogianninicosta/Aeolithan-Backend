package com.techestop.azurecosmosdbcrud.model;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Random;
import java.util.List;


@Getter
@Setter
@Container(containerName = "Customer", ru = "400")
public class Customer {

    @Id
    @GeneratedValue
    private String id;
    private String name;

    @PartitionKey
    private String character;
    private String race;
    private String level;
    private String exp;

    private String health;
    private String attack;
    private String magic;
    private String defense;
    private String speed;

    private String skillName;
    private String skill;

    public Customer(
            String name, String character, String race,
            String health, String attack, String magic,
            String defense, String speed, String skillName,
            String skill
    ) {
        Random random = new Random();
        this.id = String.valueOf(random.nextInt(1000000));
        this.name = name;
        this.character = character;
        this.race = race;

        this.level = "1";
        this.exp = "0";

        this.health = health;
        this.attack = attack;
        this.magic = magic;
        this.defense = defense;
        this.speed = speed;

        this.skillName = skillName;
        this.skill = skill;
    }

}
