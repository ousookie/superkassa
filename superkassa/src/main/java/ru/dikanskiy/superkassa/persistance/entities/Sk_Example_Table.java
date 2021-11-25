package ru.dikanskiy.superkassa.persistance.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "sk_example_table")
public class Sk_Example_Table {

    @Id
    @Column(name = "id", unique = true)
    private UUID id;

    @Column(name = "value", nullable = false)
    private Integer value;

}
