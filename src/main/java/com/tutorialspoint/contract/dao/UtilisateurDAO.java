package com.tutorialspoint.contract.dao;

import com.tutorialspoint.model.Utilisateur;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;


/**
 * Interface DAO du package
 * {@link }
 */
public interface UtilisateurDAO {
        /**
         * This is the method to be used to initialize
         * database resources ie. connection.
         */
        public void setJdbcTemplate(JdbcTemplate jdbcTemplate);

        /**
         * This is the method to be used to create
         * a record in the Student table.
         */
       // public void create(String pseudo, String firstName, String lastName, String password, Integer nbTopo);

        /**
         * This is the method to be used to list down
         * a record from the Student table corresponding
         * to a passed student id.
         */
        //public Utilisateur getUtilisateur(String pseudo);

        /**
         * This is the method to be used to list down
         * all the records from the Student table.
         */
        public List<Utilisateur> listUtilisateur();

        /**
         * This is the method to be used to delete
         * a record from the Student table corresponding
         * to a passed student id.
         */
        //public void delete(String pseudo);

        /**
         * This is the method to be used to update
         * a record into the Student table.
         */
        //public void update(String pseudo, Integer nbTopo);
    }
