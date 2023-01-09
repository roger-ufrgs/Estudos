package alura.med.voll.demo.controller;


import alura.med.voll.demo.model.Medico;
import alura.med.voll.demo.model.dao.MedicoRepository;
import alura.med.voll.demo.model.dto.medico.AtualizarMedico;
import alura.med.voll.demo.model.dto.medico.CadastroMedico;
import alura.med.voll.demo.model.dto.medico.ListarMedicos;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableDefault;
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
    public Page<ListarMedicos> listall(@PageableDefault(page = 0, sort = {"nome"},direction = Sort.Direction.ASC) Pageable paginacao)
    {
        return medicoRepository.findAllByAtivoTrue(paginacao).map(ListarMedicos::new);

    }

    @PutMapping
    @Transactional
    public void update(@RequestBody AtualizarMedico medico)
    {
        var medicoAntigo = medicoRepository.getReferenceById(medico.id());
        medicoAntigo.atualizarInformacoes(medico);

    }
    @DeleteMapping("{id}")
    @Transactional
    public void delete(@PathVariable Long id)
    {
        var medico = medicoRepository.getReferenceById(id);
        medico.setAtivo(false);

    }
}
