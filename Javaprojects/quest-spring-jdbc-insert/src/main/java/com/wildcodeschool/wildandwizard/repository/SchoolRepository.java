package com.wildcodeschool.wildandwizard.repository;

import com.wildcodeschool.wildandwizard.entity.School;

// import java.sql
import java.sql.*;

public class SchoolRepository {

    private final static String DB_URL = "jdbc:mysql://localhost:3306/spring_jdbc_quest?serverTimezone=GMT";
    private final static String DB_USER = "h4rryp0tt3r";
    private final static String DB_PASSWORD = "Horcrux4life!";

    public School save(String name, Long capacity, String country) {

        // Processus de connection à la bd.
        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );

            // Requête mysql pour inserer les 3 variables dans la table.
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO school (name, capacity, country) VALUES (?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS
            );

            // Déclaration des "set" en fonction des variables.
            statement.setString(1, name);
            statement.setLong(2, capacity);
            statement.setString(3, country);

            // message d'erreur si l'ajout ne fonctionne pas.
            if (statement.executeUpdate() != 1) {
                throw new SQLException("failed to insert data");
            }

            // Définition de la variable qui prend en parametre la génération de la clef(id)
            ResultSet generatedKeys = statement.getGeneratedKeys();

            // Si le process réussi, création d'un objet école. Sinon message erreur.
            if (generatedKeys.next()) {
                Long id = generatedKeys.getLong(1);
                return new School(id, name, capacity, country);
            } else {
                throw new SQLException("failed to get inserted id");
            }

        // Ajout de l'sql exception si le try ne réussi pas.
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
