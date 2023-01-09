package alura.med.voll.demo.model.dto.medico;

import alura.med.voll.demo.model.Especialidade;
import alura.med.voll.demo.model.Medico;

public record ListarMedicos(Long id,String nome, String crm, String email, Especialidade especialidade) {

    public  ListarMedicos(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getCrm(), medico.getEmail(), medico.getEspecialidade());
    }
}
