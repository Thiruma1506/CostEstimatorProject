package com.example.User_Input.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.User_Input.Entity.Inputs;
import com.example.User_Input.Service.InputsService;

@RestController
@RequestMapping("/api/inputs")
public class InputsController {

    @Autowired
    private InputsService inputsService;

    @GetMapping
    public ResponseEntity<List<Inputs>> getAllInputs() {
        return ResponseEntity.ok(inputsService.getAllInputs());
    }

    @PostMapping
    public ResponseEntity<Inputs> createInput(@RequestBody Inputs input) {
        return ResponseEntity.status(201).body(inputsService.createInput(input));
    }

    @GetMapping("getid/{id}")
    public ResponseEntity<Inputs> getInputById(@PathVariable Long id) {
        Optional<Inputs> inputOptional = inputsService.getInputById(id);
        
        if (inputOptional.isPresent()) {
            return ResponseEntity.ok(inputOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
