package med.voll.api.dominio.paciente;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarPaciente(@NotNull Long id,String nombre,String email,String documentoIdentidad) {
}
