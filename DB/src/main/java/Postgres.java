import java.sql.*;
import java.util.Properties;

public class Postgres
{
    String jdbcUrl = "jdbc:postgresql://localhost:5432/";
    Properties props = new Properties();
    public Postgres()
    {

        try
        {
            props.setProperty("user", "postgres");
            props.setProperty("password", "postgres");

            // Conectando ao Banco
            Connection connection = DriverManager.getConnection(jdbcUrl, props);
            DatabaseMetaData metaData = connection.getMetaData();

            // Executando uma consulta
            String[] types = {"test", "COLUMN"};

            ResultSet resultSet = metaData.getTables(null, null, null, types);

            // Processar os resultados
            while (resultSet.next())
            {
                System.out.println();
            }

            // Fechar os recursos
            resultSet.close();
            connection.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
