package dz.sofiane.apt_9.apt9.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consultation {

    private  int id;
    private String motif;
    private Timestamp date_consultation;
   private int id_patient;
   //private Patient patient;
}
