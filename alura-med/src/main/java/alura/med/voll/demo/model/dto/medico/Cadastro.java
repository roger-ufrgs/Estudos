package alura.med.voll.demo.model.dto.medico;


public record Cadastro(String nome, String email, String crm, alura.med.voll.demo.model.dto.Endereco.Cadastro endereco) {
}
