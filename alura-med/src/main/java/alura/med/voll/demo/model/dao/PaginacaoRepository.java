package alura.med.voll.demo.model.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface PaginacaoRepository <T, Long extends Serializable> extends CrudRepository<T, Long> {
    public Iterable<T> findAll(Sort s);
    public Page<T> findAll(Pageable p);
}