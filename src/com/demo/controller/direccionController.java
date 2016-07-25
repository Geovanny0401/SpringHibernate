package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.demo.pojo.Admin;
import com.demo.pojo.Direccion;
import com.demo.services.AdminService;
import com.demo.services.DireccionService;

@Controller
@SessionAttributes("admin")
public class direccionController {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private DireccionService dirService;

	@RequestMapping("/direccion/{idAd}")
	public String getAll(Model model, @ModelAttribute("resultado") String resultado, 
			@PathVariable("idAd") int idAd)
	{
		Admin admin = adminService.FinById(idAd);
		
		model.addAttribute("admin",admin);
		
		model.addAttribute("direccion", new Direccion());
		model.addAttribute("resultado",resultado);
		
		
		return "direccion";
	}
	
	@RequestMapping("/direccion/save")
	public String save(Model model, RedirectAttributes rd,
									@ModelAttribute("direccion") Direccion direccion,
			                        @ModelAttribute("admin") Admin admin)
	{
		dirService.save(admin, direccion);
		rd.addFlashAttribute("resultado","Guardado con Exito");
		return "redirect:/direccion/" + admin.getIdAd();
	}

}


