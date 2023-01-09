package alura.med.voll.demo.model.dto.medico;

import alura.med.voll.demo.model.dto.endereco.CadastroEndereco;
import jakarta.validation.constraints.NotNull;

public record AtualizarMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        CadastroEndereco endereco) {
}
