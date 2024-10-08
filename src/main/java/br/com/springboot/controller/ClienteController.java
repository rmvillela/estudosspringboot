package br.com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.springboot.bo.ClienteBO;
import br.com.springboot.model.Cliente;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	@Autowired
	private ClienteBO bo;
	
	@RequestMapping(value = "/novo", method = RequestMethod.GET)
	public ModelAndView novo(ModelMap model) {
		model.addAttribute("cliente", new Cliente());
		
		// o primeiro parâmetro é o path a partir de /templates do arquivo html que irá ser usado como referência
		return new ModelAndView("/cliente/formulario", model); 
	}
	
	@RequestMapping(value = "", method=RequestMethod.POST)
	public String salva(@ModelAttribute("cliente") Cliente cliente) {
	if (cliente.getId() == null)
		bo.insere(cliente);
	else
		bo.atualiza(cliente);
	return "redirect:/clientes";
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView lista(ModelMap model) {
		model.addAttribute("clientes", bo.listaTodos());
		
		// o primeiro parâmetro é o path a partir de /templates do arquivo html que irá ser usado como referência
		return new ModelAndView("/cliente/lista", model); 
	}
	
	@RequestMapping(value = "/edita/{id}", method = RequestMethod.GET)
	public ModelAndView edita(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("cliente", bo.pesquisaPeloId(id));
		return new ModelAndView("/cliente/formulario", model); 	
	}
	
	@RequestMapping(value = "/inativa/{id}", method = RequestMethod.GET)
	public String inativa(@PathVariable("id") Long id) {
		Cliente cliente = bo.pesquisaPeloId(id);
		bo.inativa(cliente);
		return "redirect:/clientes";	
	}
	
	@RequestMapping(value = "/ativa/{id}", method = RequestMethod.GET)
	public String ativa(@PathVariable("id") Long id) {
		Cliente cliente = bo.pesquisaPeloId(id);
		bo.ativa(cliente);
		return "redirect:/clientes";	
	}
}
