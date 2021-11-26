package ru.dikanskiy.superkassa.persistance.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IncrementRequest {

    private Long id;

    private Integer add;

}
