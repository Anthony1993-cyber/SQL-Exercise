/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Appunti {

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

    public class Table {

        public static void main(String[] args) {
            try{
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "Anthony1993!");
                Statement statement = connection.createStatement();
                //statement.executeUpdate("create table if not exists students(student_id int(10) auto_increment primary key not null)");
                //statement.executeUpdate("alter table students add last_name varchar(30) not null after student_id");
                //statement.executeUpdate("alter table students add first_name varchar(30) not null after last_name");
                //statement.executeUpdate("insert into students (last_name, first_name) values ('Rossi', 'Mario')");
                //statement.executeUpdate("insert into students (last_name, first_name) values ('Verdi', 'Marco')");
                //statement.executeUpdate("insert into students (last_name, first_name) values ('Gialli', 'Francesco')");
                //statement.executeUpdate("insert into students (last_name, first_name) values ('Bianchi', 'Dario')");
                statement.executeUpdate("update students set last_name = 'Verdi' where student_id = 2");
                //statement.executeUpdate("update students set first_name = 'Mario' where student_id = 2");
                //statement.executeUpdate("alter table students add constraint students_pk primary key(student_id)");
                //statement.executeUpdate("update students set last_name = 'Bianchi' where student_id = 4");
                //statement.executeUpdate("update students set first_name = 'Dario' where student_id = 4");
                //statement.executeUpdate("delete from students where student_id = 5");*/


                /*try{
            statement.executeUpdate("alter table students add country varchar(30) not null after first_name");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

        try{
            statement.executeUpdate("update students set country = 'Italy' where student_id = 1");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            statement.executeUpdate("update students set country = 'Italy' where student_id = 2");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            statement.executeUpdate("update students set country = 'Germany' where student_id = 3");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            statement.executeUpdate("update students set country = 'Germany' where student_id = 4");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }*/
                //statement.executeUpdate("drop view italian_students");
                //statement.executeUpdate("drop view german_students");

            //}catch(Exception e){
                //e.printStackTrace();

