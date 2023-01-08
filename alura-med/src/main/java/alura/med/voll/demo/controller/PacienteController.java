package alura.med.voll.demo.controller;

import alura.med.voll.demo.model.Medico;
import alura.med.voll.demo.model.Paciente;
import alura.med.voll.demo.model.dao.PacienteRepository;
import alura.med.voll.demo.model.dto.medico.CadastroMedico;
import alura.med.voll.demo.model.dto.paciente.CadastroPaciente;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    PacienteRepository pacienteRepository;

    @PostMapping
    @Transactional
    public void save(@RequestBody @Valid CadastroPaciente paciente)
    {
        pacienteRepository.save(new Paciente(paciente));

    }

    @GetMapping
    public Iterable<Paciente> listall()
    {
        return pacienteRepository.findAll();

    }
}
