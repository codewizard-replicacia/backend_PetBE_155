package com.apps.pets.function;

import com.apps.pets.model.Visit;
import com.apps.pets.model.Pet;
import com.apps.pets.model.PetOwner;
import com.apps.pets.model.VisitScheduler;
import com.apps.pets.model.Veterian;
import com.apps.pets.model.Appointment;
import com.apps.pets.model.VaccineScheduler;
import com.apps.pets.model.Image;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.apps.pets.repository.AppointmentRepository;
import com.apps.pets.repository.PetOwnerRepository;
import com.apps.pets.repository.VeterianRepository;
import com.apps.pets.repository.VisitRepository;
import com.apps.pets.repository.VaccineSchedulerRepository;
import com.apps.pets.repository.ImageRepository;
import com.apps.pets.repository.PetRepository;
import com.apps.pets.repository.VisitSchedulerRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
