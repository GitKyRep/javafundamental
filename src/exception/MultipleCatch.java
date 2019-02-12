package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class MultipleCatch {
    public static void main(String[] args) {

        try {

            // Mencoba membaca berkas latihan.txt
            File file = new File("D://latihan.txt");
            FileReader fr = new FileReader(file);

            // Jika berhasil maka tampilkan pesan
            System.out.println("Read file berhasil");

        } catch (Exception e) {
            // Jika terjadi kesalahan maka tampilkan pesan
            System.out.println("Error "+e.getMessage());
        }

        //java < 7
        /*
        try {

        } catch (ExceptionType name) {

        } catch (ExceptionType name) {

        }
        */

        //java > 7
        /*catch (IOException|SQLException ex) {
            logger.log(ex);
            throw ex;
        }*/

    }
}
