package com.apps.pets.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.apps.pets.model.Visit;
import com.apps.pets.model.Pet;
import com.apps.pets.model.PetOwner;
import com.apps.pets.model.VisitScheduler;
import com.apps.pets.model.Veterian;
import com.apps.pets.model.Appointment;
import com.apps.pets.model.VaccineScheduler;
import com.apps.pets.model.Image;

@Entity(name = "PetPetImage")
@Table(schema = "\"petcare\"", name = "\"PetPetImage\"")
@Data
public class PetPetImage{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"Pet_id\"")
	private Integer pet_id;

    
    @Column(name = "\"ImageId\"")
    private Integer imageId;
 
}