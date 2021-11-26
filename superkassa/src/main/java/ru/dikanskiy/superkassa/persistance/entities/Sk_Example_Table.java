package ru.dikanskiy.superkassa.persistance.entities;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "sk_example_table")
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class Sk_Example_Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, columnDefinition = "bigint")
    private long id;

    @Type(type = "jsonb")
    @Column(name = "obj", columnDefinition = "jsonb")
    private Obj obj;

}
