package Gruzdzis.Wicki.ankieter.Api;

import Gruzdzis.Wicki.ankieter.Model.Test;
import Gruzdzis.Wicki.ankieter.Repository.TestRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class TestApi {

    private TestRepository repository;

    public TestApi(TestRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/leaf")
    String test() {
        return "leaf";
    }

    @PostMapping("/lfs")
    String addTest(@Valid Test test, BindingResult result, Model model) {
        repository.save(test);
        return "redirect:/leaf";
    }
}
