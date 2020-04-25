package br.usjt.ex02previsao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrevisaoService {
	
		@Autowired
		private PrevisaoRepository previsoesRepo;
		

		public void salvar(Previsao previ) {
			previsoesRepo.save(previ);
		}

		public List<Previsao> listarTodos() {
			List<Previsao> previ = previsoesRepo.findAll();
			for (Previsao pre : previ) {
				
			}

				
			return previ;
		}
	}