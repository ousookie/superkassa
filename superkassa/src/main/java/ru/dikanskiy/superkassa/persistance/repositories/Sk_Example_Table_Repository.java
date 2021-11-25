package ru.dikanskiy.superkassa.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dikanskiy.superkassa.persistance.entities.Sk_Example_Table;

import java.util.UUID;

@Repository
public interface Sk_Example_Table_Repository extends JpaRepository<Sk_Example_Table, UUID> {
}
