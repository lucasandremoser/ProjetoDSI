package br.univille.projetodsi.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetodsi.model.Consulta;
import br.univille.projetodsi.model.Medico;
import br.univille.projetodsi.model.Paciente;
import br.univille.projetodsi.model.Procedimento;
import br.univille.projetodsi.repository.ConsultaRepository;
import br.univille.projetodsi.repository.MedicoRepository;
import br.univille.projetodsi.repository.PacienteRepository;
import br.univille.projetodsi.repository.ProcedimentoRepository;

@Controller
@RequestMapping("/consulta")
public class ConsultaController {
    @Autowired
    private ConsultaRepository consultaRepository;
    @Autowired
    private PacienteRepository pacienteRepository;
    @Autowired
    private MedicoRepository medicoRepository;
    @Autowired
    private ProcedimentoRepository procedimentoRepository;
    
    @GetMapping("")
    public ModelAndView index() {
        List<Consulta> listaConsulta = this.consultaRepository.findAll();
        
        return new ModelAndView("consulta/index","listaConsulta",listaConsulta);
    }
    
    @GetMapping("/novo")
    public ModelAndView createForm(@ModelAttribute Consulta consulta) {
        List<Medico> listaMedico = this.medicoRepository.findAll();
        List<Paciente> listaPaciente = this.pacienteRepository.findAll();
        List<Procedimento> listaProcedimento = this.procedimentoRepository.findAll();
        
        HashMap<String, Object> dados = new HashMap<String, Object>();
        dados.put("listaMedico", listaMedico);
        dados.put("listaPaciente", listaPaciente);
        dados.put("listaProcedimento", listaProcedimento);
        
        return new ModelAndView("consulta/form",dados);
    }
    
}