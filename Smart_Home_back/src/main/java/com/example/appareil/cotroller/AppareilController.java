package com.example.appareil.cotroller;

import java.util.List;
import java.util.Optional;
import com.example.appareil.entity.Appareil;
import com.example.appareil.service.AppareilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/controller/appareil")
@CrossOrigin
public class AppareilController {


    @Autowired
    private AppareilService appareilService;

    @GetMapping("/id/{id}")
    public Optional<Appareil> findById(@PathVariable Long id) {
        return appareilService.findById(id);
    }

    @PostMapping("/")
    public Appareil save(@RequestBody Appareil appareil) {
        return appareilService.save(appareil);
    } 

    @PutMapping("/id/{id}")
    public void update(@PathVariable Long id, @RequestBody Appareil appInfo) {
        appareilService.update(id, appInfo);
    }


    @GetMapping("/update/state/{state}")
    public void updateAll(@PathVariable boolean state) {
        appareilService.updateAll(state);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        appareilService.deleteById(id);
    }

    @GetMapping("/")
    public List<Appareil> findAll() {
        return appareilService.findAll();
    }
}
