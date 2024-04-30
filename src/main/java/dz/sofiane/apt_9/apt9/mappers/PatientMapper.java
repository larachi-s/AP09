package dz.sofiane.apt_9.apt9.mappers;

import dz.sofiane.apt_9.apt9.models.Patient;
import dz.sofiane.apt_9.apt9.models.RendezVous;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatientMapper {
//read tous les patients
     List<Patient> getAll();
//recharche patient by name
    List<Patient> getByName(String name);
    //create patient
     void createPatient(Patient patient) ;
     //update patient
    void updatePatient(Patient patient);
    //delete Patient
    void deletPatient(int id);
}
