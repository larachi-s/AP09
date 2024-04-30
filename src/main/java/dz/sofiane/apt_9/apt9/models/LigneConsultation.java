package dz.sofiane.apt_9.apt9.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor


public class LigneConsultation {

    private int id;
    private int id_consultation;
    private int id_traitement;
    private String posologie;
    private String unite_temps;
    private String quantite;
   // private Traitement traitement;

}
