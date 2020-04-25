package br.usjt.ex02previsao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class PrevisaoController {

	@Autowired
	private PrevisaoService previService;

	@GetMapping("/previsao")
	public ModelAndView listarAlunos() {
		// passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView("lista_prev");
		mv.addObject(new Previsao());
		// Busque a coleção com o repositório
		List<Previsao> previ = previService.listarTodos();
		// adicione a coleção ao objeto ModelAndView
		mv.addObject("previ", previ);
		// devolva o ModelAndView
		return mv;
	}
	
	@PostMapping("/previsao")
	public String salvar (Previsao previsoes) {
		previService.salvar(previsoes);
	return "redirect:/previsao";
	}
}
