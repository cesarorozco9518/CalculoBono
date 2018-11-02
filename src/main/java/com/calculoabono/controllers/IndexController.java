package com.calculoabono.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Cesar M Orozco R
 */
@Controller
public class IndexController {
    
    /** Se instancia como static y final la clase para el archivo .log **/
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);    
    
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String indexPage() {
        return "index";
    }
    
}
