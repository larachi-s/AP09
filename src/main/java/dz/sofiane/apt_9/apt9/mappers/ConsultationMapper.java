package dz.sofiane.apt_9.apt9.mappers;

import dz.sofiane.apt_9.apt9.models.Consultation;
import dz.sofiane.apt_9.apt9.models.Patient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ConsultationMapper {

    //reade touis les consultation
   List<Consultation> getAllConsultation();


   //get consultaion
    Consultation getById(int id);

    //create consultaion
    void createConsultaion(Consultation consultation);
    //update consultation
    void updateConsultaion(Consultation consultation);
    //delete consultation
    void deletConsultation(int id);
}
