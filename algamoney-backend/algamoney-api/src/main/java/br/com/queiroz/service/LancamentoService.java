package br.com.queiroz.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.queiroz.model.Lancamento;
import br.com.queiroz.model.Pessoa;
import br.com.queiroz.repository.LancamentoRepository;
import br.com.queiroz.repository.PessoaRepository;
import br.com.queiroz.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	
	@Autowired
	private PessoaRepository pessoaRepository;

	@Autowired
	private LancamentoRepository lancamentoRepository;
	

	public Lancamento salvar(Lancamento lancamento) {
		validarPessoa(lancamento);
		return lancamentoRepository.save(lancamento);
	}

	public Lancamento atualizar(Long codigo, Lancamento lancamento) {
		Lancamento lancamentoSalvo = buscarLancamentoExistente(codigo);
		if (!lancamento.getPessoa().equals(lancamentoSalvo.getPessoa())) {
			validarPessoa(lancamento);
		}
		//para copiar as propriedades que vem de lancamento exceto o codigo
		BeanUtils.copyProperties(lancamento, lancamentoSalvo, "codigo");
		return lancamentoRepository.save(lancamentoSalvo);
	}

	private void validarPessoa(Lancamento lancamento) {
		Optional<Pessoa> pessoa = null;
		if (lancamento.getPessoa().getCodigo() != null) {
			pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo());
		}
		if (!pessoa.isPresent()|| pessoa.get().isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
	}

	private Lancamento buscarLancamentoExistente(Long codigo) {
		Optional<Lancamento> lancamentoSalvo = lancamentoRepository.findById(codigo);
		
		if (!lancamentoSalvo.isPresent()) {
			throw new IllegalArgumentException();
		}
		
		return lancamentoSalvo.get();
	}

}
