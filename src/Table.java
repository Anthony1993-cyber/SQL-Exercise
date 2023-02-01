import java.sql.*;
import java.util.ArrayList;

public class Table {

    public static void main(String[] args){
        try{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "Anthony1993!");
        Statement statement = connection.createStatement();

        //Creating table students

        statement.executeUpdate("create table if not exists students(student_id int(10) auto_increment primary key not null)");
        statement.executeUpdate("alter table students add last_name varchar(30) not null after student_id");
        statement.executeUpdate("alter table students add first_name varchar(30) not null after last_name");
        statement.executeUpdate("insert into students (last_name, first_name) values ('Rossi', 'Mario')");
        statement.executeUpdate("insert into students (last_name, first_name) values ('Verdi', 'Marco')");
        statement.executeUpdate("insert into students (last_name, first_name) values ('Gialli', 'Francesco')");
        statement.executeUpdate("insert into students (last_name, first_name) values ('Bianchi', 'Dario')");
        statement.executeUpdate("insert into students (last_name, first_name) values ('Neri', 'Mirko')");

        //Creating ArrayList surnames

        ResultSet rs = statement.executeQuery("select * from students");
        ArrayList<String> surnames = new ArrayList<>();

        while(rs.next()){
            System.out.println(rs.getString("first_name"));
            surnames.add(rs.getString("last_name"));
        }

        System.out.println(surnames);


        //Adding column country and populating it

        statement.executeUpdate("alter table students add country varchar(30) not null after first_name");
        statement.executeUpdate("update students set country = 'Italy' where student_id = 1");
        statement.executeUpdate("update students set country = 'Italy' where student_id = 2");
        statement.executeUpdate("update students set country = 'Germany' where student_id = 3");
        statement.executeUpdate("update students set country = 'Germany' where student_id = 4");


        //Creating view italian_students and ArrayList italianStudents

        statement.executeUpdate("create view italian_students as select last_name, first_name from students where country = 'Italy'");

        ResultSet rsItalianStudents = statement.executeQuery("select * from italian_students");
        ArrayList<Student> italianStudents = new ArrayList<>();

        while(rsItalianStudents.next()){
            String firstName = rsItalianStudents.getString("first_name");
            String lastName = rsItalianStudents.getString("last_name");
            Student student = new Student(firstName, lastName);
            italianStudents.add(student);
        }

        System.out.println("Italian Students: ");
        for(Student student : italianStudents){
            System.out.println(student.getName() + " " + student.getSurname());
        }

        //Creating view german_students and ArrayList germanStudents

        statement.executeUpdate("create view german_students as select last_name, first_name from students where country = 'Germany'");

        ResultSet rsGermanStudents = statement.executeQuery("select * from german_students");
        ArrayList<Student> germanStudents = new ArrayList<>();

        while(rsGermanStudents.next()) {
            String firstName = rsGermanStudents.getString("first_name");
            String lastName = rsGermanStudents.getString("last_name");
            Student student = new Student(firstName, lastName);
            germanStudents.add(student);
        }

        System.out.println("German Students: ");
        for(Student student : germanStudents) {
            System.out.println(student.getName() + " " + student.getSurname());
        }

        rs.close();
        rsItalianStudents.close();
        rsGermanStudents.close();
        statement.close();
        connection.close();

        }catch(SQLException e){
            e.getMessage();
        }
    }
}


