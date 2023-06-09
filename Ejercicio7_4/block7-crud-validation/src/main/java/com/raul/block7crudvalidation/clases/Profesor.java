package com.raul.block7crudvalidation.clases;

import com.raul.block7crudvalidation.Application.PersonaService;
import com.raul.block7crudvalidation.controller.dto.PersonaInputDto;
import com.raul.block7crudvalidation.controller.dto.PersonaOutputDto;
import com.raul.block7crudvalidation.controller.dto.ProfesorInputDto;
import com.raul.block7crudvalidation.controller.dto.ProfesorOutputDto;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "profesor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profesor   {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id_profesor;

    @OneToOne
    @JoinColumn(name = "id_persona")
    Persona persona;

    @Column(name = "comentarios")
    String coments;

    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Alumnos_Estudios> alumnosEstudios = new ArrayList<>();

    @Column(name = "rama")
    String branch;

    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Alumnos_Estudios> estudios = new ArrayList<>();

    public Profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public Profesor(ProfesorInputDto profesor) {

        id_profesor = profesor.getId_profesor();

    }

    public ProfesorOutputDto profesorOutputDto() {
        return new ProfesorOutputDto(this.id_profesor, this.persona, this.coments, this.alumnosEstudios, this.branch, this.estudios);
    }
}