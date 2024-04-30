package dz.sofiane.apt_9.apt9.mappers;

import dz.sofiane.apt_9.apt9.models.Traitement;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TraitmentMappers {

    //reade tous les Traitment
    List<Traitement> getAllTraitement();
    
    
    


    //get Traitement
    Traitement getById(String nom);

    //create Traitement
    void createTraitement(Traitement traitement);
    //update Traitement
    void updateTraitement(Traitement traitement);
    //delete Traitement
    void deletTraitement(int id);
}
