package dz.sofiane.apt_9.apt9.controllers;

import dz.sofiane.apt_9.apt9.models.Patient;
import dz.sofiane.apt_9.apt9.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
     @Autowired
    PatientService patientService;
     @GetMapping("/patients")
   public List<Patient> getAllPatient(){
        return patientService.getAll();
    }

    @GetMapping("/nom/{nom_patient}")
    public List<Patient> getPatientByName(@PathVariable String nom_patient) {
        return patientService.getPatientByName(nom_patient);

    }

    @PostMapping("/add/patient")
    public void createPatient(@RequestBody Patient patient) {
        patientService.createPatient(patient);
        System.out.println("patient add successfully");
    }
    @PutMapping("/update/patient")
    public void updatePatient(@RequestBody Patient patient) {
        patientService.updatePatient(patient);
        System.out.println("patient updated successfully");
    }
    @DeleteMapping("delete")
    public void deletePatient(@RequestBody Patient patient) {
        patientService.updatePatient(patient);
        System.out.println("patient updated successfully");
    }


}
