package br.com.fiap.globalSolutionPolaris.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.globalSolutionPolaris.dto.CreateLocalWithUserDto;
import br.com.fiap.globalSolutionPolaris.model.Endereco;
import br.com.fiap.globalSolutionPolaris.model.LocalEscolhido;
import br.com.fiap.globalSolutionPolaris.model.Mulher;
import br.com.fiap.globalSolutionPolaris.repository.EnderecoRepository;
import br.com.fiap.globalSolutionPolaris.repository.LocalEscolhidoRepository;
import br.com.fiap.globalSolutionPolaris.repository.MulherRepository;

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

    // public void saveLocalWithUser(CreateLocalWithUserDto dto) {
    // LocalEscolhido local = new LocalEscolhido();
    // Endereco endereco = new Endereco();

    // Optional<Mulher> mulherExist = mulherRepository.findById(dto.getCodMulher());
    // if(mulherExist.isEmpty()) throw new Error("User not found nao deu");

    // Mulher mulher = mulherExist.get();

    // endereco.setNumeroCep(dto.getNumeroCep());
    // endereco.setNomeRua(dto.getNomeRua());
    // endereco.setNumeroRua(dto.getNumeroRua());
    // endereco.setDesComplemento(dto.getDesComplemento());

    // // endereco.getBairro().setNomeBairro(dto.getNomeBairro());
    // // endereco.getBairro().getCidade().setNomeCidade(dto.getNomeCidade());
    // // endereco.getBairro().getCidade().setSiglaCidade(dto.getSiglaCidade());
    // //
    // endereco.getBairro().getCidade().getEstado().setNomeEstado(dto.getNomeEstado());
    // //
    // endereco.getBairro().getCidade().getEstado().setSiglaEstado(dto.getSiglaEstado());
    // // enderecoRepository.save(endereco);

    // Optional<Endereco> endExist = enderecoRepository.findById(1L);
    // if(endExist.isEmpty()) throw new Error("User not found");

    // Endereco enderecoN = endExist.get();
    // local.setMulher(mulher);
    // local.setEndereco(endereco);
    // local.setIncidente(dto.getIncidente());
    // local.setDtOcorrencia(dto.getDtOcorrencia());
    // local.setAvaliacaoPerigo(dto.getAvaliacaoPerigo());
    // //local.getEndereco().setNumeroCep(dto.getEndereco().getNumeroCep());

    // // local.getEndereco().setNomeRua(dto.getNomeRua());
    // // local.getEndereco().setNumeroRua(dto.getNumeroRua());
    // // local.getEndereco().setDesComplemento(dto.getDesComplemento());
    // // local.getEndereco().getBairro().setNomeBairro(dto.getNomeBairro());
    // //
    // local.getEndereco().getBairro().getCidade().setNomeCidade(dto.getNomeCidade());
    // //
    // local.getEndereco().getBairro().getCidade().setSiglaCidade(dto.getSiglaCidade());
    // //
    // local.getEndereco().getBairro().getCidade().getEstado().setNomeEstado(dto.getNomeEstado());
    // //
    // local.getEndereco().getBairro().getCidade().getEstado().setSiglaEstado(dto.getSiglaEstado());

    // localRepository.save(local);

    // }

    public void saveLocalWithUser(CreateLocalWithUserDto dto) {
        enderecoRepository.save(dto.getEndereco());

        LocalEscolhido local = new LocalEscolhido();
        
        Optional<Mulher> verifMulher = mulherRepository.findById(dto.getCodMulher());
        if(verifMulher.isEmpty()) throw new Error("Nao encontrado");
        
        Optional<Endereco> verifEndereco = enderecoRepository.findById(dto.getEndereco().getId());
        if(verifEndereco.isEmpty()) throw new Error("Nao encontrado");

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
