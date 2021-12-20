package Controller;

public class ConnectionMySQL {
    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PreguntasRespuestas", "root", "");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }

}
