package br.com.queiroz.repository.filter;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.queiroz.model.Lancamento;
import br.com.queiroz.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);

}
