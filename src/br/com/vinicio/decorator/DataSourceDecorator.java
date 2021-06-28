package br.com.vinicio.decorator;

public class DataSourceDecorator implements Datasource {

    private Datasource datasource;

    public DataSourceDecorator(Datasource datasource) {
        this.datasource = datasource;
    }

    @Override
    public void writeData(String data) {
        datasource.writeData(data);
    }

    @Override
    public String readData() {
        return datasource.readData();
    }
}
