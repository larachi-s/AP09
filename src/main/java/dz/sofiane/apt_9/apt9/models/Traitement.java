package dz.sofiane.apt_9.apt9.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Traitement {
    private  int id;
    private String nom ;
    private List<LigneConsultation> ligneConsultations;
}
