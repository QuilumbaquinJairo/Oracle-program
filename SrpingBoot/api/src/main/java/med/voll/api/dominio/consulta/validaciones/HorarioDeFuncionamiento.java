package med.voll.api.dominio.consulta.validaciones;

import jakarta.validation.ValidationException;
import med.voll.api.dominio.consulta.DatosAgendarConsulta;
import med.voll.api.infra.errores.ValidationDeIntegridad;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
@Component
public class HorarioDeFuncionamiento implements ValidadorDeConsultas {
    public void validar(DatosAgendarConsulta datos){
        var domingo= DayOfWeek.SUNDAY.equals(datos.fecha().getDayOfWeek());
        var antesDeApertura =datos.fecha().getHour()<7;
        var despuesDeCierre=datos.fecha().getHour()>19;
        if(domingo||antesDeApertura||despuesDeCierre){
            throw  new ValidationException("el horario de atencion de la clinica es de lunes a sabado");
        }
    }
}
