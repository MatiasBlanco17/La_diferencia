package Objetos;

public class Clientes {
    private int id;
    private String[] clientes={"Sermieh","Jacinta"};
    private int[] salarios={45000,55000};

    public Clientes(){
        id=1;
    }

    public Clientes(int id, String[] clientes, int[] salarios) {
        this.id = id;
        this.clientes = clientes;
        this.salarios = salarios;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClientes(String[] clientes) {
        this.clientes = clientes;
    }

    public void setSalarios(int[] salarios) {
        this.salarios = salarios;
    }

    public int getId() {
        return id;
    }

    public String[] getClientes() {
        return clientes;
    }

    public int[] getSalarios() {
        return salarios;
    }
}
