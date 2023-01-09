package alura.med.voll.demo.model;


import alura.med.voll.demo.model.dto.medico.AtualizarMedico;
import alura.med.voll.demo.model.dto.medico.CadastroMedico;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "Medico")
@Table(name="medicos")
public class Medico implements Entidade {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    private String telefone;

    private String crm;

    @Enumerated
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;
    private boolean ativo;


    @Override
    public Long getId() {
        return this.id;
    }

    public Medico(CadastroMedico medico){
        this.email = medico.email();
        this.crm= medico.crm();
        this.especialidade = medico.especialidade();
        this.nome = medico.nome();
        this.telefone = medico.telefone();
        this.endereco = new Endereco(medico.endereco());
    }

    public void atualizarInformacoes(AtualizarMedico medico) {
        this.nome = medico.nome() != null ? medico.nome() : this.getNome();
        this.telefone = medico.telefone() != null ? medico.telefone() : this.getTelefone();
        if (medico.nome() != null) {
            this.nome = medico.nome();
        }
        if (medico.telefone() != null) {
            this.telefone = medico.telefone();
        }
        if (medico.endereco() != null) {
            this.endereco.atualizaEndereco(medico.endereco());
        }

    }

}
