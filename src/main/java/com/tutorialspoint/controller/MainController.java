package com.tutorialspoint.controller;


import com.tutorialspoint.impl.daoImpl.UtilisateurDAOImpl;
import com.tutorialspoint.model.Utilisateur;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MainController {


        @RequestMapping("/")
        public String index() {
            return "index";
        }


        @RequestMapping("/test")
        @ResponseBody
        public String test() {
            return "test";
        }


        @RequestMapping(value = { "/login" }, method = RequestMethod.GET)
        public String login(Model model) {


            UtilisateurDAOImpl utilisateurDAOImpl = new UtilisateurDAOImpl();
            model.addAttribute("utilisateurs", utilisateurDAOImpl.listUtilisateur());

            return "login";
        }



        /*@RequestMapping(value = { "/login" })
        public String addUser(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
            Utilisateur utilisateur = new Utilisateur();
            utilisateur.setFirstName(request.getParameter("firstName"));
            utilisateur.setLastName(request.getParameter("lastName"));

            Noms tableNoms = new Noms();
            tableNoms.ajouterUtilisateur(utilisateur);

            model.addAttribute("utilisateurs", tableNoms.recupererUtilisateurs());

            return "login";

        }*/

}
