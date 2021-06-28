package br.com.vinicio.decorator;

public interface Datasource {

    void writeData(String data);

    String readData();
}
