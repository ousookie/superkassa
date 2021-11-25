package ru.dikanskiy.superkassa.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dikanskiy.superkassa.exceptions.MyException;
import ru.dikanskiy.superkassa.persistance.entities.ResponseEntity;
import ru.dikanskiy.superkassa.persistance.entities.Sk_Example_Table;
import ru.dikanskiy.superkassa.persistance.repositories.Sk_Example_Table_Repository;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class IncrementationServiceImplementation implements IncrementationService {

    private final Sk_Example_Table_Repository sk_example_table_repository;

    @Transactional
    public ResponseEntity increment(final UUID uuid,
                                    final Integer incrementValue) {
        Optional<Sk_Example_Table> sk_example_table = sk_example_table_repository.findById(uuid);
        if (sk_example_table.isPresent()) {
            Sk_Example_Table current_table = sk_example_table.get();
            Integer current = current_table.getValue();
            current += incrementValue;
            current_table.setValue(current);
            return new ResponseEntity(current);
        } else {
            throw new MyException();
        }
    }

}
