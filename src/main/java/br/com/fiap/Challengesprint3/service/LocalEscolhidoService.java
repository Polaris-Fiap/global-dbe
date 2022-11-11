package br.com.fiap.Challengesprint3.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.Challengesprint3.dto.CreateLocalWithUserDto;
import br.com.fiap.Challengesprint3.model.Endereco;
import br.com.fiap.Challengesprint3.model.LocalEscolhido;
import br.com.fiap.Challengesprint3.model.Mulher;
import br.com.fiap.Challengesprint3.repository.EnderecoRepository;
import br.com.fiap.Challengesprint3.repository.LocalEscolhidoRepository;
import br.com.fiap.Challengesprint3.repository.MulherRepository;

@Service
@Transactional
public class LocalEscolhidoService {

    @Autowired
    LocalEscolhidoRepository localRepository;

    @Autowired
    MulherRepository mulherRepository;

    @Autowired
    EnderecoRepository enderecoRepository;

    public void save(LocalEscolhido avLocal) {
        localRepository.save(avLocal);
    }

    public void saveLocalWithUser(CreateLocalWithUserDto dto) {
        enderecoRepository.save(dto.getEndereco());

        LocalEscolhido local = new LocalEscolhido();

        Optional<Mulher> verifMulher = mulherRepository.findById(dto.getCodMulher());
        if (verifMulher.isEmpty())
            throw new Error("Nao encontrado");

        Optional<Endereco> verifEndereco = enderecoRepository.findById(dto.getEndereco().getId());
        if (verifEndereco.isEmpty())
            throw new Error("Nao encontrado");

        Endereco endereco = verifEndereco.get();
        Mulher mulher = verifMulher.get();

        local.setMulher(mulher);
        local.setIncidente(dto.getIncidente());
        local.setDtOcorrencia(dto.getDtOcorrencia());
        local.setAvaliacaoPerigo(dto.getAvaliacaoPerigo());
        local.setEndereco(endereco);

        localRepository.save(local);
    }

    public List<LocalEscolhido> findAll() {
        return localRepository.findAll();
    }

    public void remove(Long id) {
        localRepository.deleteById(id);
    }

    public Optional<LocalEscolhido> getById(Long id) {
        return localRepository.findById(id);
    }
}
