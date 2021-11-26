package ru.dikanskiy.superkassa.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;
import ru.dikanskiy.superkassa.persistance.entities.Sk_Example_Table;

import javax.persistence.LockModeType;
import java.util.Optional;

@Repository
public interface Sk_Example_Table_Repository extends JpaRepository<Sk_Example_Table, Long> {

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Optional<Sk_Example_Table> findById(Long id);

}
