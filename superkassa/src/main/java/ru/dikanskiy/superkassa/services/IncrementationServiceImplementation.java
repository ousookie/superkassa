package ru.dikanskiy.superkassa.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dikanskiy.superkassa.exceptions.MyException;
import ru.dikanskiy.superkassa.persistance.entities.Obj;
import ru.dikanskiy.superkassa.persistance.entities.Sk_Example_Table;
import ru.dikanskiy.superkassa.persistance.repositories.Sk_Example_Table_Repository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IncrementationServiceImplementation implements IncrementationService {

    private final Sk_Example_Table_Repository sk_example_table_repository;

    @Transactional
    public Obj increment(final Long id, final Integer incrementValue) {

        Optional<Sk_Example_Table> sk_example_table = sk_example_table_repository.findById(id);

        if (sk_example_table.isPresent()) {

            Sk_Example_Table current_table = sk_example_table.get();

            Integer current = current_table.getObj().getCurrent();
            current += incrementValue;
            current_table.getObj().setCurrent(current);

            return current_table.getObj();

        } else {
            throw new MyException();
        }
    }

}
