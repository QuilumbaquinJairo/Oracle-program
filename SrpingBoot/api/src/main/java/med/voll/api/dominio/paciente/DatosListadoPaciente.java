package med.voll.api.dominio.paciente;

public record DatosListadoPaciente(String nombre,String documentoIdentidad,String email,String telefono) {
    public DatosListadoPaciente(Paciente paciente){
        this(paciente.getNombre(), paciente.getDocumentoIdentidad(), paciente.getEmail(), paciente.getTelefono());
    }
}
