package ru.dikanskiy.superkassa.services;

import ru.dikanskiy.superkassa.persistance.entities.ResponseEntity;

import java.util.UUID;

public interface IncrementationService {

    ResponseEntity increment(final UUID id, final Integer incrementValue);

}
