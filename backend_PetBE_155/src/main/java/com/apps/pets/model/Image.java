package com.apps.pets.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.apps.pets.model.Visit;
import com.apps.pets.model.Pet;
import com.apps.pets.model.PetOwner;
import com.apps.pets.model.VisitScheduler;
import com.apps.pets.model.Veterian;
import com.apps.pets.model.Appointment;
import com.apps.pets.model.VaccineScheduler;
import com.apps.pets.model.Image;
import com.apps.pets.converter.DurationConverter;
import com.apps.pets.converter.UUIDToByteConverter;
import com.apps.pets.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Image")
@Table(name = "\"Image\"", schema =  "\"petcare\"")
@Data
                        
public class Image {
	public Image () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"ImageId\"", nullable = true )
  private Integer imageId;
	  
  @Column(name = "\"ImageType\"", nullable = true )
  private String imageType;
  
	  
  @Column(name = "\"ImageName\"", nullable = true )
  private String imageName;
  
  @Column(name = "\"Content\"")
  @EdmMediaStream(contentTypeAttribute = "docFileType")
  private byte[] content;
  
  @Column(name = "\"DocFileType\"")
  private String docFileType;
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Image [" 
  + "ImageId= " + imageId  + ", " 
  + "ImageType= " + imageType  + ", " 
  + "ImageName= " + imageName 
 + "]";
	}
	
}