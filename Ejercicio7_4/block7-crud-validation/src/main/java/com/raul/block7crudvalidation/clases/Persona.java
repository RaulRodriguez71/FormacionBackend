package com.raul.block7crudvalidation.clases;

import com.raul.block7crudvalidation.controller.dto.PersonaInputDto;
import com.raul.block7crudvalidation.controller.dto.PersonaOutputDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Persona")
public class Persona {
    @GeneratedValue
    @Id
    int id_persona;
    String usuario;
    String password;
    String name;
    String surname;
    String company_email;

    String city;
    boolean active;
    Date created_date;
    String imagen_url;
    Date termination_date;


    public Persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public Persona(PersonaInputDto persona) {

        id_persona = persona.getId_persona();
        usuario = persona.getUsuario();
        password = persona.getPassword();
        name = persona.getName();
        surname = persona.getSurname();
        company_email = persona.getCompany_email();
        city = persona.getCity();
        active = persona.isActive();
        created_date = persona.getCreated_date();
        imagen_url = persona.getImagen_url();
        termination_date = persona.getTermination_date();


    }

    public PersonaOutputDto personaToPersonaOutputDto() {
        return new PersonaOutputDto(this.id_persona, this.usuario, this.password, this.name, this.surname, this.company_email, this.city, this.active,
                this.created_date, this.imagen_url, this.termination_date);
    }


}
