package med.voll.api.dominio.consulta.validaciones;

import jakarta.validation.ValidationException;
import med.voll.api.dominio.consulta.DatosAgendarConsulta;
import med.voll.api.dominio.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;
@Component
public class PacientesActivos implements ValidadorDeConsultas{
    @Autowired
    private PacienteRepository pacienteRepository;
    public void validar(DatosAgendarConsulta datos){
        if(datos.idPaciente()==null){
            return;
        }
        var pacienteActivo=pacienteRepository.findActivoById(datos.idPaciente());
        if (!pacienteActivo){
            throw new ValidationException("No se puede permitir agendar citas con pacientes inactivos");
        }
    }
}
