package dz.sofiane.apt_9.apt9.services;

import dz.sofiane.apt_9.apt9.mappers.TraitmentMappers;
import dz.sofiane.apt_9.apt9.models.Consultation;
import dz.sofiane.apt_9.apt9.models.Traitement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TraitementService {

    @Autowired
    TraitmentMappers traitmentMappers;

    //reade touis les consultation
    public List<Traitement> getAllTraitement() {
       return traitmentMappers.getAllTraitement();
    }


    //get consultaion
    public Traitement getById(String nom ) {

        return traitmentMappers.getById(nom);
    }

    //create consultaion
    public void createTraitement(Traitement traitement) {
        traitmentMappers.createTraitement(traitement);

    }

    //update consultation
    public void updateTraitement(Traitement traitement) {
     traitmentMappers.updateTraitement(traitement);
    }

    //delete consultation
    public void deletTraitement(int id) {
       traitmentMappers.deletTraitement(id);
    }
}
