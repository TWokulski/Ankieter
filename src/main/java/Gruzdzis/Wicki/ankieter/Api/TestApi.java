package Gruzdzis.Wicki.ankieter.Api;

import Gruzdzis.Wicki.ankieter.Model.Test;
import Gruzdzis.Wicki.ankieter.Repository.TestRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestApi {

    private TestRepository repository;

    public TestApi(TestRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    ResponseEntity<Test> saveTest(@RequestBody Test test)
    {
        return ResponseEntity.ok(repository.save(test));
    }

    @GetMapping
    ResponseEntity<List<Test>> showTests(){
        return ResponseEntity.ok(repository.findAll());
    }
}
