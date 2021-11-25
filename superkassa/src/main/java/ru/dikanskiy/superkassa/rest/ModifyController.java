package ru.dikanskiy.superkassa.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import ru.dikanskiy.superkassa.exceptions.MyException;
import ru.dikanskiy.superkassa.persistance.entities.IncrementRequest;
import ru.dikanskiy.superkassa.persistance.entities.ResponseEntity;
import ru.dikanskiy.superkassa.services.IncrementationServiceImplementation;

@RestController
@RequiredArgsConstructor
public class ModifyController {

    private final IncrementationServiceImplementation incrementationServiceImplementation;

    @PostMapping(value = "/modify")
    public ResponseEntity modifyEntity(@RequestBody IncrementRequest incrementRequest) {
        try {
            return incrementationServiceImplementation.increment(incrementRequest.getId(),
                    incrementRequest.getIncrementValue());
        } catch (MyException myException) {
            throw new ResponseStatusException(HttpStatus.I_AM_A_TEAPOT, "Sk_Example_Table Not Found", myException);
        }
    }

}
