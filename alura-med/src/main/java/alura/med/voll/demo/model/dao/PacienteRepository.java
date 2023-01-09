package alura.med.voll.demo.model.dao;

import alura.med.voll.demo.model.Medico;
import alura.med.voll.demo.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
