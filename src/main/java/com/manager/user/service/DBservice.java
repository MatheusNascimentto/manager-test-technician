package com.manager.user.service;


import com.manager.user.domain.Endereco;
import com.manager.user.domain.Pessoa;
import com.manager.user.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;

@Service
public class DBservice implements CommandLineRunner {

    @Autowired
    private PessoaRepository pessoaRepository;
    public void instanciaBaseDeDados() {

        // ====================== ENDEREÇO =============================

        Endereco e1 = new Endereco();
        e1.setRua("Rua Nascimento");
        e1.setCidade("Capao Bonito");
        e1.setEstado("Sao Paulo");

        Endereco e2 = new Endereco();
        e2.setRua("Rua Lima");
        e2.setCidade("Itapeva");
        e2.setEstado("Sao Paulo");

        // ====================== PESSOA =============================

        LocalDate localDate = LocalDate.now();

        Pessoa p1 = new Pessoa();
        p1.setNome("Gabriel Proença");
        p1.setCpf("(15)99865-8914");
        p1.setDataNascimento(localDate);
        p1.setEndereco(e1);

        Pessoa p2 = new Pessoa();
        p2.setNome("Matheus Nascimento");
        p2.setCpf("(15)99865-3214");
        p2.setDataNascimento(localDate);
        p2.setEndereco(e2);

        this.pessoaRepository.saveAll(Arrays.asList(p1, p2));

    }

    @Override
    public void run(String... args) throws Exception {

        // ====================== ENDEREÇO =============================

        Endereco e1 = new Endereco();
        e1.setRua("Rua Nascimento");
        e1.setCidade("Capao Bonito");
        e1.setEstado("Sao Paulo");

        Endereco e2 = new Endereco();
        e2.setRua("Rua Lima");
        e2.setCidade("Itapeva");
        e2.setEstado("Sao Paulo");

        // ====================== PESSOA =============================

        LocalDate localDate = LocalDate.now();

        Pessoa p1 = new Pessoa();
        p1.setNome("Gabriel Proença");
        p1.setCpf("(15)99865-3214");
        p1.setDataNascimento(localDate);
        p1.setEndereco(e1);

        Pessoa p2 = new Pessoa();
        p2.setNome("Matheus Nascimento");
        p2.setCpf("(15)99865-3214");
        p2.setDataNascimento(localDate);
        p2.setEndereco(e2);


        this.pessoaRepository.saveAll(Arrays.asList(p1, p2));

    }
}
