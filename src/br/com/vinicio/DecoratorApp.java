package br.com.vinicio;

import br.com.vinicio.decorator.*;

public class DecoratorApp {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
//        DataSourceDecorator encoded = new CompressionDecorator(
//                new EncryptionDecorator(
//                        new FileDataSource("out/OutputDemo.txt")));
        DataSourceDecorator encoded = new CompressionDecorator(
                        new FileDataSource("out/OutputDemo.txt"));
        encoded.writeData(salaryRecords);
        Datasource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
