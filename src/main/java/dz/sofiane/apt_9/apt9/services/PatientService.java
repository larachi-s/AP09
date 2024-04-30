package dz.sofiane.apt_9.apt9.services;

import dz.sofiane.apt_9.apt9.mappers.PatientMapper;

import dz.sofiane.apt_9.apt9.models.Consultation;
import dz.sofiane.apt_9.apt9.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientMapper patientMapper;

    public List<Patient> getAll(){
        return patientMapper.getAll();
    }


    public List<Patient> getPatientByName(String name) {
        return patientMapper.getByName(name);
    }
    public void createPatient(Patient patient) {
        patientMapper.createPatient(patient);
    }

    public  void updatePatient(Patient patient) {
        patientMapper.updatePatient(patient);
    }

    //delete consultation
    public  void deletPatient(int id) {
        patientMapper.deletPatient(id);
    }

}
