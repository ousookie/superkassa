package ru.dikanskiy.superkassa.persistance.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class IncrementRequest {

    private UUID id;

    private Integer incrementValue;

}
