package alura.med.voll.demo.model;


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
}
