package br.com.queiroz.repository.projection;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.queiroz.model.enumerate.TipoLancamento;
import lombok.Data;

@Data
public class ResumoLancamento {

		private Long codigo;
		private String descricao;
		private LocalDate dataVencimento;
		private LocalDate dataPagamento;
		private BigDecimal valor;
		private TipoLancamento tipo;
		private String categoria;
		private String pessoa;
		
		public ResumoLancamento(Long codigo, String descricao, LocalDate dataVencimento, LocalDate dataPagamento,
				BigDecimal valor, TipoLancamento tipo, String categoria, String pessoa) {
			this.codigo = codigo;
			this.descricao = descricao;
			this.dataVencimento = dataVencimento;
			this.dataPagamento = dataPagamento;
			this.valor = valor;
			this.tipo = tipo;
			this.categoria = categoria;
			this.pessoa = pessoa;
		}	
		
}
