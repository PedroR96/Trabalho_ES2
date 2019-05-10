package People;

public class Physical_Data {

    private float peso;
    private float altura;
    private float IMC;
    private float BF;
    private float GorduraV;
    private float Musculo;
    private float IdadeMetabo;
    private float H2O;
    private float MetabolismoBassal;
    private int Osso;

    public Physical_Data(float peso, float altura, float IMC, float BF, float gorduraV, float musculo, float idadeMetabo, float h2O, float metabolismoBassal, int osso) {
        this.peso = peso;
        this.altura = altura;
        this.IMC = IMC;
        this.BF = BF;
        GorduraV = gorduraV;
        Musculo = musculo;
        IdadeMetabo = idadeMetabo;
        H2O = h2O;
        MetabolismoBassal = metabolismoBassal;
        Osso = osso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getIMC() {
        return IMC;
    }

    public void setIMC(float IMC) {
        this.IMC = IMC;
    }

    public float getBF() {
        return BF;
    }

    public void setBF(float BF) {
        this.BF = BF;
    }

    public float getGorduraV() {
        return GorduraV;
    }

    public void setGorduraV(float gorduraV) {
        GorduraV = gorduraV;
    }

    public float getMusculo() {
        return Musculo;
    }

    public void setMusculo(float musculo) {
        Musculo = musculo;
    }

    public float getIdadeMetabo() {
        return IdadeMetabo;
    }

    public void setIdadeMetabo(float idadeMetabo) {
        IdadeMetabo = idadeMetabo;
    }

    public float getH2O() {
        return H2O;
    }

    public void setH2O(float h2O) {
        H2O = h2O;
    }

    public float getMetabolismoBassal() {
        return MetabolismoBassal;
    }

    public void setMetabolismoBassal(float metabolismoBassal) {
        MetabolismoBassal = metabolismoBassal;
    }

    public int getOsso() {
        return Osso;
    }

    public void setOsso(int osso) {
        Osso = osso;
    }

}
