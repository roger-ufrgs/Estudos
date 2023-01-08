package alura.med.voll.demo.model.dto.paciente;

import alura.med.voll.demo.model.dto.endereco.CadastroEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CadastroPaciente(

        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String cpf,

        @NotBlank
        String telefone,

        @NotBlank
        @Valid
        CadastroEndereco endereco) {
}
