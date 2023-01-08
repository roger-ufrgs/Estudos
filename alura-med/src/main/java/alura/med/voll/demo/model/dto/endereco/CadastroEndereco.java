package alura.med.voll.demo.model.dto.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record CadastroEndereco(
        @NotBlank
        String logradouro,

        @NotBlank
        String bairro,
        @NotBlank
                @Pattern(regexp = "\\d{5}\\-\\d{3}")
        String cep,

        @NotBlank
        String numero,
        String complemento,

        @NotBlank
        String uf,
        @NotBlank
        String cidade) {
}
