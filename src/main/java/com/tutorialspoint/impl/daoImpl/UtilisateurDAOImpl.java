package com.tutorialspoint.impl.daoImpl;

import com.tutorialspoint.contract.dao.UtilisateurDAO;
import com.tutorialspoint.mapper.UtilisateurMapper;
import com.tutorialspoint.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.inject.Named;
import javax.sql.DataSource;
import java.util.List;


/**
 * Classe d'implémentation de {@link UtilisateurDAO}.
 */
@Named
public class UtilisateurDAOImpl implements UtilisateurDAO {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate (JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    /*public void create(String pseudo, String firstName, String lastName, String password, Integer nbTopo) {
        String SQL = "insert into Utilisateur (pseudo, firstName, lastName, password, nbTopo ) values (?, ?, ?, ?, ?)";
        jdbcTemplateObject.update( SQL, pseudo, firstName, lastName, password, nbTopo);
        System.out.println("Enregistrement des utilisateurs :  \n" + "-" + "Pseudo : " + pseudo + ", Firstname = " + firstName + ", Lastname = " + lastName + ", Password = " + password + ", nbTopo = " + nbTopo);
        return;
    }

    public Utilisateur getUtilisateur(String pseudo) {
        String SQL = "select * from Utilisateur where pseudo = ?";
        Utilisateur utilisateur = jdbcTemplateObject.queryForObject(SQL, new Object[]{pseudo}, new UtilisateurMapper());
        return utilisateur;
    }*/

    public List<Utilisateur> listUtilisateur() {
        String SQL = "select * from Utilisateur";
        List<Utilisateur> utilisateurs = jdbcTemplate.query(SQL, new UtilisateurMapper());
        return utilisateurs;
    }
    /* public void delete(String pseudo) {
        String SQL = "delete from Utilisateur where pseudo = ?";
        jdbcTemplateObject.update(SQL, pseudo);
        System.out.println("Supprimer l'utilisateur avec le pseudo = " + pseudo );
        return;
    }

    public void update(String pseudo, Integer nbTopo) {
        String SQL = "update Utilisateur set nbTopo = ? where pseudo = ?";
        jdbcTemplateObject.update(SQL, nbTopo, pseudo);
        System.out.println("Modification du nb de topo de l'utilisateur  = " + nbTopo );
        return;
    }


    public List<Utilisateur> recupererUtilisateurs() {
        return null;

    }*/

}