package med.voll.api.dominio.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.dominio.direccion.Direccion;

@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Paciente")
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private String documentoIdentidad;
    private String telefono;
    private Boolean activo;

    @Embedded
    private Direccion direccion;

    public Paciente(DatosRegistroPaciente datos) {
        this.activo=true;
        this.nombre = datos.nombre();
        this.email = datos.email();
        this.telefono = datos.telefono();
        this.documentoIdentidad = datos.documentoIdentidad();
        this.direccion = new Direccion(datos.direccion());
    }


    public void actualizarDatos(DatosActualizarPaciente datosActualizarPaciente) {
        if (datosActualizarPaciente.nombre()!=null){
            this.nombre= datosActualizarPaciente.nombre();
        }
        if(datosActualizarPaciente.documentoIdentidad()!=null){
            this.documentoIdentidad= datosActualizarPaciente.documentoIdentidad();
        }
        if(datosActualizarPaciente.email()!=null){
            this.email=datosActualizarPaciente.email();
        }

    }

    public void desactivarPaciente() {
        this.activo=false;
    }
}
