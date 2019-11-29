package algo;

import org.junit.Assert;
import org.junit.Test;

import java.sql.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SQLTrainingTest {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/"
            + SQLTraining.DB_NAME + "?serverTimezone=GMT";

    private static Connection connection = null;

    private static Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(
                    DB_URL, SQLTraining.DB_USER, SQLTraining.DB_PASSWORD
            );
        }
        return connection;
    }

    @Test
    public void testConnection() {
        try {
            getConnection();
        } catch (SQLException e) {
            Assert.fail("Test connection: " + e.getMessage());
        }
    }

    @Test
    public void testRequest1() {

        String request = SQLTraining.request1();

        try {
            Assert.assertEquals(new HashSet<>(Arrays.asList(
                    new Request("Restoration"),
                    new Request("Illusion"),
                    new Request("Alteration"),
                    new Request("Conjuration"),
                    new Request("Destruction")
            )), sendRequest(request, (set, r) -> {

                r.add(new Request(set.getObject(1)));
                return r;
            }));
        } catch (SQLException e) {
            Assert.fail("Request 1: " + e.getMessage());
        }
    }

    @Test
    public void testRequest2() {

        String request = SQLTraining.request2();

        try {
            Assert.assertEquals(new HashSet<>(Arrays.asList(
                    new Request("A Philter of Bless Weapon", 4),
                    new Request("A Draught of Bowmanship", 4),
                    new Request("A Vial of Nymph Breath", 4)
            )), sendRequest(request, (set, r) -> {

                r.add(new Request(set.getObject(1), set.getObject(2)));
                return r;
            }));
        } catch (SQLException e) {
            Assert.fail("Request 2: " + e.getMessage());
        }
    }

    @Test
    public void testRequest3() {

        String request = SQLTraining.request3();

        try {
            Assert.assertEquals(new HashSet<>(Arrays.asList(
                    new Request("Angel Tooth"),
                    new Request("Angel Flesh")
            )), sendRequest(request, (set, r) -> {

                r.add(new Request(set.getObject(1)));
                return r;
            }));
        } catch (SQLException e) {
            Assert.fail("Request 3: " + e.getMessage());
        }
    }

    @Test
    public void testRequest4() {

        String request = SQLTraining.request4();

        try {
            Assert.assertEquals(new HashSet<>(Arrays.asList(
                    new Request("A Elixir of Oracle", 6),
                    new Request("A Elixir of Dreams", 2)
            )), sendRequest(request, (set, r) -> {

                r.add(new Request(set.getObject(1), set.getObject(2)));
                return r;
            }));
        } catch (SQLException e) {
            Assert.fail("Request 4: " + e.getMessage());
        }
    }

    @Test
    public void testRequest5() {

        String request = SQLTraining.request5();

        try {
            Assert.assertEquals(new HashSet<>(Arrays.asList(
                    new Request("9")
            )), sendRequest(request, (set, r) -> {

                r.add(new Request(set.getString("maxPower")));
                return r;
            }));
        } catch (SQLException e) {
            Assert.fail("Request 5: " + e.getMessage());
        }
    }

    @Test
    public void testRequest6() {

        String request = SQLTraining.request6();
        try {
            Assert.assertEquals(new HashSet<>(Arrays.asList(
                    new Request("A Vial of Dead Ringer"),
                    new Request("A Juice of Love"),
                    new Request("A Philter of Musical Breath"),
                    new Request("A Elixir of Dreams")
            )), sendRequest(request, (set, r) -> {

                r.add(new Request(set.getObject(1)));
                return r;
            }));
        } catch (SQLException e) {
            Assert.fail("Request 6: " + e.getMessage());
        }
    }

    @Test
    public void testRequest7() {

        String request = SQLTraining.request7();
        try {
            Assert.assertEquals(new HashSet<>(Arrays.asList(
                    new Request("A Juice of Love", "Illusion"),
                    new Request("A Elixir of Gods Touch", "Conjuration"),
                    new Request("A Draught of Youth", "Restoration")
            )), sendRequest(request, (set, r) -> {

                r.add(new Request(set.getObject(1), set.getObject(2)));
                return r;
            }));
        } catch (SQLException e) {
            Assert.fail("Request 7: " + e.getMessage());
        }
    }

    @Test
    public void testRequest8() {

        String request = SQLTraining.request8();
        try {
            Assert.assertEquals(new HashSet<>(Arrays.asList(
                    new Request("Phoenix Spit"),
                    new Request("Gargoyle Dust"),
                    new Request("Hellhound Honey")
            )), sendRequest(request, (set, r) -> {

                r.add(new Request(set.getObject(1)));
                return r;
            }));
        } catch (SQLException e) {
            Assert.fail("Request 8: " + e.getMessage());
        }
    }

    @Test
    public void testRequest9() {

        String request = SQLTraining.request9();
        try {
            Assert.assertEquals(new HashSet<>(Arrays.asList(
                    new Request("Mermaid Scale"),
                    new Request("Bone Cabbage"),
                    new Request("Chimera Bittersweet"),
                    new Request("Witch's Bone Meal"),
                    new Request("Fairy Dust"),
                    new Request("Hydra Tongue"),
                    new Request("Golem Dust")
            )), sendRequest(request, (set, r) -> {

                r.add(new Request(set.getObject(1)));
                return r;
            }));
        } catch (SQLException e) {
            Assert.fail("Request 8: " + e.getMessage());
        }
    }

    @Test
    public void testRequest10() {

        String request = SQLTraining.request10();
        try {
            Assert.assertEquals(new HashSet<>(Arrays.asList(
                    new Request("A Juice of The Bard", "Phoenix Spit"),
                    new Request("A Ichor of Gracefulness", "Sphinx's Blood"),
                    new Request("A Ichor of Gracefulness", "Kobold Gland"),
                    new Request("A Ichor of Gracefulness", "Hydra Claw"),
                    new Request("A Philter of Flame Resistance", "Basilisk Scale"),
                    new Request("A Tonic of True form", "Gargoyle Dust"),
                    new Request("A Tonic of True form", "Angel Flesh")
            )), sendRequest(request, (set, r) -> {

                r.add(new Request(set.getObject(1), set.getObject(2)));
                return r;
            }));
        } catch (SQLException e) {
            Assert.fail("Request 10: " + e.getMessage());
        }
    }

    private Set<Request> sendRequest(String request, Selection selection) throws SQLException {
        PreparedStatement statement = getConnection().prepareStatement(request);

        ResultSet resultSet = statement.executeQuery();
        Set<Request> result = new HashSet<>();
        while (resultSet.next()) {
            result = selection.get(resultSet, result);
        }
        return result;
    }

    private interface Selection {

        Set<Request> get(ResultSet resultSet, Set<Request> result) throws SQLException;
    }

    static class Request {

        Object value1;
        Object value2 = null;

        Request(Object value1) {
            this.value1 = value1;
        }

        public Request(Object value1, Object value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Request request = (Request) o;
            if (value2 != null) {
                return value1.equals(request.value1) &&
                        value2.equals(request.value2);
            }
            return value1.equals(request.value1);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value1, value2);
        }

        @Override
        public String toString() {
            if (value2 != null) {
                return "{" +
                        value1 +
                        ", " + value2 +
                        '}';
            }
            return "{" +
                    value1 +
                    '}';
        }
    }
}
