package med.voll.api.dominio.consulta.validaciones;

import jakarta.validation.ValidationException;
import med.voll.api.dominio.consulta.DatosAgendarConsulta;
import med.voll.api.dominio.medico.MedicoRepository;
import med.voll.api.dominio.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MedicosActivos implements ValidadorDeConsultas{
    @Autowired
    private MedicoRepository repository;
    public void validar(DatosAgendarConsulta datos){
        if(datos.idMedico()==null){
            return;
        }
        var medicoActivo=repository.findActivoById(datos.idPaciente());
        if (!medicoActivo){
            throw new ValidationException("No se puede permitir agendar citas con medicos inactivos");
        }
    }
}
