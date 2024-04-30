package dz.sofiane.apt_9.apt9.services;

import dz.sofiane.apt_9.apt9.mappers.ConsultationMapper;
import dz.sofiane.apt_9.apt9.models.Consultation;
import dz.sofiane.apt_9.apt9.models.Traitement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationService {
    @Autowired
    ConsultationMapper consultationMapper;
    //reade touis les consultation
    List<Consultation> getAllConsultation() {

        return consultationMapper.getAllConsultation();
    }


    //get consultaion
    public Consultation getById(int id) {
        return consultationMapper.getById(id);
    }

    //create consultaion
    public void createConsultation(Consultation consultation) {
      consultationMapper.createConsultaion(consultation);
    }

    //update consultation
   public  void updateConsultation(Consultation consultation) {
   consultationMapper.updateConsultaion(consultation);
    }

    //delete consultation
   public  void deletConsultationt(int id) {
       consultationMapper.deletConsultation(id);
    }
}
