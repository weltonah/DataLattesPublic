package br.com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.Modelo.Qualis;
import br.com.Modelo.QualisEntidade;

@Repository
public interface QualisRepository extends JpaRepository<Qualis, QualisEntidade> {
}
