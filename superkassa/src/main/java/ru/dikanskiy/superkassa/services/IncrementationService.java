package ru.dikanskiy.superkassa.services;

import ru.dikanskiy.superkassa.persistance.entities.Obj;

public interface IncrementationService {

    Obj increment(final Long id, final Integer incrementValue);

}
