package com.tutorialspoint.mapper;

import com.tutorialspoint.model.Utilisateur;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UtilisateurMapper implements RowMapper<Utilisateur> {

    public Utilisateur mapRow(ResultSet rs, int rowNum) throws SQLException {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setPseudo(rs.getString("pseudo"));
        utilisateur.setFirstName(rs.getString("firstname"));
        utilisateur.setLastName(rs.getString("lastname"));
        utilisateur.setPassword(rs.getString("password"));
        utilisateur.setNbTopo(rs.getInt("nbtopo"));

        return utilisateur;
    }
}