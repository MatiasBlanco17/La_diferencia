package Objetos;

public class Jarrones {
    private int id;
    private String[] jarrones={"Ceramica","Porcelana","Vidrio"};
    private int[] precios={4500,12500,25000};
    private int[] adicional={150,350,500};

    public Jarrones(){
        id=1;
    }

    public Jarrones(int id, String[] jarrones, int[] precios, int[] adicional) {
        this.id = id;
        this.jarrones = jarrones;
        this.precios = precios;
        this.adicional = adicional;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getJarrones() {
        return jarrones;
    }

    public void setJarrones(String[] jarrones) {
        this.jarrones = jarrones;
    }

    public int[] getPrecios() {
        return precios;
    }

    public void setPrecios(int[] precios) {
        this.precios = precios;
    }

    public int[] getAdicional() {
        return adicional;
    }

    public void setAdicional(int[] adicional) {
        this.adicional = adicional;
    }
    public int agregarAdicional(int valor,int adicional){
        return valor+adicional;
    }
    public int precioCeramica(int cantidad){
        int valorC=precios[0];
        int totalC=valorC*cantidad;
        return totalC;
    }
    public int precioporcelana(int cantidad){
        int valorC=precios[1];
        int totalC=valorC*cantidad;
        return totalC;
    }
    public int preciovidrio(int cantidad){
        int valorC=precios[2];
        int totalC=valorC*cantidad;
        return totalC;
    }
}
