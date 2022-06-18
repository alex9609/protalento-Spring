package ar.com.educacionit.controllers;

import ar.com.educacionit.domain.Cupones;
import ar.com.educacionit.enums.ViewsEnum;
import ar.com.educacionit.service.CuponesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(path = "/cupon")
public class CuponesController {

    @Autowired
    private CuponesService service;

    @GetMapping(value = "list")
    public String list(Model model) {

        List<Cupones> cupones = service.findAll();
        model.addAttribute("CUPONES", cupones);
        return ViewsEnum.LISTADO.getView();
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable(name="id") Long id,Model model){
        Cupones cupon = this.service.getById(id);

        model.addAttribute("CUPON",cupon);
        return "cupones/edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("CUPON") Cupones cupon){
        this.service.update(cupon);
        return "redirect:/cupon/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value="id", required = true) Long id){
        this.service.delete(id);
        return "redirect:/cupon/list";
    }

    @RequestMapping("/new")
    public ModelAndView newCupon(){

        Cupones cupon = new Cupones();
        ModelAndView modelAndView = new ModelAndView(ViewsEnum.NEW.getView());
        modelAndView.addObject("CUPON",cupon);
        return modelAndView;
    }

    @RequestMapping(value="/save", method=RequestMethod.POST)
    public String save(@Valid @ModelAttribute(name="CUPON") Cupones cupones, BindingResult result){

        if(result.hasErrors()){
            return ViewsEnum.NEW.getView();
        }
        this.service.save(cupones);
        return "redirect:/cupon/list";
    }
}
