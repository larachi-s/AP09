package dz.sofiane.apt_9.apt9.controllers;

import dz.sofiane.apt_9.apt9.models.Patient;
import dz.sofiane.apt_9.apt9.models.Traitement;
import dz.sofiane.apt_9.apt9.services.PatientService;
import dz.sofiane.apt_9.apt9.services.TraitementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/traitement")

public class TraitementController {
    @Autowired
    TraitementService traitementService;
    @GetMapping("/traitements")
    public List<Traitement> getAllPatient(){
        return traitementService.getAllTraitement();
    }

    @GetMapping("/{nom}")
    public Traitement getPatientByName(@PathVariable String nom) {
       // return traitementService.getById(nomTraitement);
       return  traitementService.getById(nom);

    }

    @PostMapping("/add/Traitement")
    public void createPatient(@RequestBody Traitement Traitement) {
        traitementService.createTraitement(Traitement);
        System.out.println("Traitement add successfully");
    }
    @PutMapping("/update/traitement")
    public void updatePatient(@RequestBody Traitement traitement) {
        traitementService.updateTraitement(traitement);
        System.out.println("traitemet updated successfully");
    }
    @DeleteMapping("delete")
    public void deletePatient(@RequestBody int traitement) {
        traitementService.deletTraitement(traitement);
        System.out.println("patient delete successfully");
    }
}
