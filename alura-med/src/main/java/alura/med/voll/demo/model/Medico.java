package alura.med.voll.demo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "Medico")
@Table(name = "medicos")
public class Medico implements Entidade {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;

    @Enumerated
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;


    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {

    }
}
