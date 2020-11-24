package be.n.springbootproject.dao;

import be.n.springbootproject.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class PersonDataAccessServicePostgres implements PersonDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDataAccessServicePostgres(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        String sql = "SELECT * FROM person;";

        return jdbcTemplate.query(sql,(resultSet, i) -> {
            UUID id = UUID.fromString(resultSet.getString("id"));
            String name = resultSet.getString("name");
            return new Person(
                    id,
                    name);
        });
    }

    @Override
    public Optional<Person> selectPersonByID(UUID id) {
        String sql = "SELECT id, name FROM person WHERE id = ?";
        Person person = jdbcTemplate.queryForObject(
                sql,
                new Object[]{id},
                (resultSet, i) -> {
            UUID personID = UUID.fromString(resultSet.getString("id"));
            String name = resultSet.getString("name");
            return new Person(
                    personID,
                    name);
        });
        return Optional.ofNullable(person);
    }

    @Override
    public int updatePersonByID(UUID id, Person person) {
        return 0;
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }
}
