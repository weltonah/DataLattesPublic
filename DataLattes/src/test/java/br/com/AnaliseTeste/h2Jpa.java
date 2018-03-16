package br.com.AnaliseTeste;

import java.io.IOException;
import java.util.Optional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.DAO.QualisRepository;
import br.com.Modelo.Qualis;
import br.com.Modelo.QualisEntidade;

public class h2Jpa {
	@Autowired
	QualisRepository qualisRepository;

	@Test
	public void teste() throws IOException {
		this.qualisRepository
				.save(new Qualis(new QualisEntidade("2236-6695", "A BARRIGUDA: REVISTA CIENTÍFICA"), "B4"));
		
		
		Optional<Qualis> qualis = this.qualisRepository
				.findById(new QualisEntidade("2236-6695", "A BARRIGUDA: REVISTA CIENTÍFICA"));
		System.out.println(qualis.isPresent());

	}
}
