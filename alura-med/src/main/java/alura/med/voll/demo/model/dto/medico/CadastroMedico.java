package alura.med.voll.demo.model.dto.medico;


import alura.med.voll.demo.model.Especialidade;
import alura.med.voll.demo.model.dto.endereco.CadastroEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record CadastroMedico(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
                @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotNull
        @Valid
        CadastroEndereco endereco,
        Especialidade especialidade) {
}
