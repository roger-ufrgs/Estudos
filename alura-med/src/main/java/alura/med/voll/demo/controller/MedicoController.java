package alura.med.voll.demo.controller;


import alura.med.voll.demo.model.Medico;
import alura.med.voll.demo.model.dao.MedicoRepository;
import alura.med.voll.demo.model.dto.medico.CadastroMedico;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    MedicoRepository medicoRepository;

    @PostMapping
    @Transactional
    public void save(@RequestBody @Valid CadastroMedico medico)
    {
        medicoRepository.save(new Medico(medico));

    }

    @GetMapping
    public Iterable<Medico> listall()
    {
        return medicoRepository.findAll();

    }
}
