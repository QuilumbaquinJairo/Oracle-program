package med.voll.api.dominio.consulta.validaciones;

import jakarta.validation.ValidationException;
import med.voll.api.dominio.consulta.ConsultaRepository;
import med.voll.api.dominio.consulta.DatosAgendarConsulta;
import med.voll.api.dominio.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PacientesSinConsulta implements ValidadorDeConsultas{

    @Autowired
    private ConsultaRepository repository;
    public void validar(DatosAgendarConsulta datos){
        var primerHorario=datos.fecha().withHour(7);
        var ultimoHorario=datos.fecha().withHour(18);
        var pacienteConConsulta=repository.existsByPacienteIdAndDateBetween(datos.idPaciente(),primerHorario,ultimoHorario);
        if(pacienteConConsulta){
            throw new ValidationException("el paciente ya tiene una consulta para ese dia");
        }
    }
}
