package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.dominio.consulta.AgendaDeConsultaService;
import med.voll.api.dominio.consulta.DatosAgendarConsulta;
import med.voll.api.dominio.consulta.DatosDetalleConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    private AgendaDeConsultaService service;
    @PostMapping
    @Transactional
    public ResponseEntity<Object> agendar(@RequestBody @Valid DatosAgendarConsulta datos){
       var response = service.agendar(datos);
        return ResponseEntity.ok(response);
    }
}
