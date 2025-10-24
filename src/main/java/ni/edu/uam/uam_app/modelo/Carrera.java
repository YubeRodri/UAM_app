package ni.edu.uam.uam_app.modelo;


import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Carrera {
        @Id
        private String Id;
        @Column(name = "Nombre", length = 30, nullable = false)
        @Required(message = "Nombre no puede quedar vacio...")
        private String nombre;
        private String descripcion;

}
