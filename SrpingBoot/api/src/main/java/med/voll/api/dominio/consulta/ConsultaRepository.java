package med.voll.api.dominio.consulta;

import med.voll.api.dominio.medico.Medico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta,Long> {

    Boolean existsByPacienteIdAndDateBetween(Long idPaciente, LocalDateTime primerHorario, LocalDateTime ultimoHorario);

    Boolean existsByMedicoIdAndDate(Long idMedico, LocalDateTime fecha);
}
