package Food;


import People.MaxCharacters;

public class NutricionalSpecs {
    private String productID;
    private String name;
    private Float energiaKCla;
    private Float energiaKj;
    private Float agua;
    private Float proteina;
    private Float gorduraTotal;
    private Float totalHCDisponiveis;
    private Float totalHCMonossacaridos;
    private Float monoDissacaridos;
    private Float acidosOrganicos;
    private Float alcool;
    private Float amido;
    private Float oligossacaridos;
    private Float fibraAlimentar;
    private Float acidosGordosSaturados;
    private Float acidosGordosMonoinsaturados;
    private Float acidosGordosPolinsaturados;
    private Float acidosGordosTrans;
    private Float acidoLinoleico;
    private Float colesterol;
    private Float Retinol;
    private Float vitATotal;
    private Float caroteno;
    private Float vitD;
    private Float aTocoferol;
    private Float Tiamina;
    private Float Riboflavina;
    private Float equivalentesNiacina;
    private Float niacina;
    private Float triptofano;
    private Float vitB6;
    private Float vitB12;
    private Float vitC;
    private Float folatos;
    private Float cinza;
    private Float Na;
    private Float K;
    private Float Ca;
    private Float P;
    private Float Mg;
    private Float Fe;
    private Float Zn;




    public NutricionalSpecs(String specs){
        String[] x=   specs.split(";");

        this.productID = x[0];
        this.name =  x[1];
        this.energiaKCla =  Float.parseFloat(x[2]);
        this.energiaKj =  Float.parseFloat(x[3]);
        this.agua = Float.parseFloat(x[4]);
        this.proteina =  Float.parseFloat(x[5]);
        this.gorduraTotal =  Float.parseFloat(x[6]);
        this.totalHCDisponiveis =  Float.parseFloat(x[7]);
        this.totalHCMonossacaridos =  Float.parseFloat(x[8]);
        this.monoDissacaridos =  Float.parseFloat(x[9]);
        this.acidosOrganicos =  Float.parseFloat(x[10]);
        this.alcool =  Float.parseFloat(x[11]);
        this.amido =  Float.parseFloat(x[12]);
        this.oligossacaridos =  Float.parseFloat(x[13]);
        this.fibraAlimentar =  Float.parseFloat(x[14]);
        this.acidosGordosSaturados =  Float.parseFloat(x[15]);
        this.acidosGordosMonoinsaturados =  Float.parseFloat(x[16]);
        this.acidosGordosPolinsaturados =  Float.parseFloat(x[17]);
        this.acidosGordosTrans =  Float.parseFloat(x[18]);
        this.acidoLinoleico =  Float.parseFloat(x[19]);
        this.colesterol =  Float.parseFloat(x[20]);
        this.Retinol=Float.parseFloat(x[21]);
        this.vitATotal =  Float.parseFloat(x[22]);
        this.caroteno =  Float.parseFloat(x[23]);
        this.vitD = Float.parseFloat(x[24]);
        this.aTocoferol = Float.parseFloat(x[25]);
        Tiamina = Float.parseFloat(x[26]);
        Riboflavina = Float.parseFloat(x[27]);
        this.equivalentesNiacina = Float.parseFloat(x[28]);
        this.niacina =  Float.parseFloat(x[29]);
        this.triptofano =Float.parseFloat(x[30]);
        this.vitB6 = Float.parseFloat(x[31]);
        this.vitB12 = Float.parseFloat(x[32]);
        this.vitC = Float.parseFloat(x[33]);
        this.folatos =  Float.parseFloat(x[34]);
        this.cinza =Float.parseFloat(x[35]);
        Na = Float.parseFloat(x[36]);
        K = Float.parseFloat(x[37]);
        Ca = Float.parseFloat(x[38]);
        P =  Float.parseFloat(x[38]);
        Mg =Float.parseFloat(x[40]);
        Fe = Float.parseFloat(x[41]);
        Zn = Float.parseFloat(x[42]);
    }

    public NutricionalSpecs() {
    }


    public NutricionalSpecs sum(NutricionalSpecs nutricionalSpecs,float quantity){

        this.energiaKCla  +=  (nutricionalSpecs.getEnergiaKCla()/100.0f)*quantity;
        this.energiaKj +=  (nutricionalSpecs.getEnergiaKj()/100.0f)*quantity;

        this.agua += (nutricionalSpecs.getAgua()/100.0f)*quantity;
        this.proteina += ( nutricionalSpecs.proteina/100.0f)*quantity;
        this.gorduraTotal += ( nutricionalSpecs.gorduraTotal/100.0f)*quantity;
        this.totalHCDisponiveis += ( nutricionalSpecs.totalHCDisponiveis/100.0f)*quantity;
        this.totalHCMonossacaridos += ( nutricionalSpecs.totalHCMonossacaridos/100.0f)*quantity;
        this.monoDissacaridos += ( nutricionalSpecs.monoDissacaridos/100.0f)*quantity;
        this.acidosOrganicos += ( nutricionalSpecs.acidosOrganicos/100.0f)*quantity;
        this.alcool += ( nutricionalSpecs.alcool/100.0f)*quantity;
        this.amido += ( nutricionalSpecs.amido/100.0f)*quantity;
        this.oligossacaridos += ( nutricionalSpecs.oligossacaridos/100.0f)*quantity;
        this.fibraAlimentar += (  nutricionalSpecs.fibraAlimentar/100.0f)*quantity;
        this.acidosGordosSaturados += ( nutricionalSpecs.acidosGordosSaturados/100.0f)*quantity;
        this.acidosGordosMonoinsaturados += (  nutricionalSpecs.acidosGordosMonoinsaturados/100.0f)*quantity;
        this.acidosGordosPolinsaturados += (  nutricionalSpecs.acidosGordosPolinsaturados/100.0f)*quantity;
        this.acidosGordosTrans += (  nutricionalSpecs.acidosGordosTrans/100.0f)*quantity;
        this.acidoLinoleico += (  nutricionalSpecs.acidoLinoleico/100.0f)*quantity;
        this.colesterol += (  nutricionalSpecs.colesterol/100.0f)*quantity;
        this.Retinol += (  nutricionalSpecs.Retinol/100.0f)*quantity;
        this.vitATotal += (  nutricionalSpecs.vitATotal/100.0f)*quantity;
        this.caroteno += (  nutricionalSpecs.caroteno/100.0f)*quantity;
        this.vitD += (  nutricionalSpecs.vitD/100.0f)*quantity;
        this.aTocoferol += (  nutricionalSpecs.aTocoferol/100.0f)*quantity;
        this.Tiamina += (  nutricionalSpecs.Tiamina/100.0f)*quantity;
        this.Riboflavina += ( nutricionalSpecs.Riboflavina/100.0f)*quantity;
        this.equivalentesNiacina += ( nutricionalSpecs.equivalentesNiacina/100.0f)*quantity;
        this.niacina += ( nutricionalSpecs.niacina/100.0f)*quantity;
        this.triptofano += ( nutricionalSpecs.triptofano/100.0f)*quantity;
        this.vitB6 += ( nutricionalSpecs.vitB6/100.0f)*quantity;
        this.vitB12 += ( nutricionalSpecs.vitB12/100.0f)*quantity;
        this.vitC += ( nutricionalSpecs.vitC/100.0f)*quantity;
        this.folatos += ( nutricionalSpecs.folatos/100.0f)*quantity;
        this.cinza += ( nutricionalSpecs.cinza/100.0f)*quantity;
        this.Na += ( nutricionalSpecs.Na/100.0f)*quantity;
        this.K += ( nutricionalSpecs.K/100.0f)*quantity;
        this.Ca += ( nutricionalSpecs.Ca/100.0f)*quantity;
        this.P += ( nutricionalSpecs.P/100.0f)*quantity;
        this.Mg += ( nutricionalSpecs.Mg/100.0f)*quantity;
        this.Fe += ( nutricionalSpecs.Fe/100.0f)*quantity;
        this.Zn += ( nutricionalSpecs.Zn/100.0f)*quantity;

        return this;
    }


    public String nutricionalSpecsToString(){

        return   "Energia (kcal),Energia (kJ),Água (g),Proteína (g),Gordura total (g),Total HC disponíveis (g),Total HC expresso em monossacáridos (g),Mono + dissacáridos (g),Ácidos orgânicos (g),Álcool (g),Amido (g),Oligossacáridos (g),Fibra alimentar (g),Ácidos gordos saturados (g),Ácidos gordos monoinsaturados (g),Ácidos gordos polinsaturados  (g),Ácidos gordos trans (g),Ácido linoleico (g),Colesterol (mg),Retinol (vit. A total) (mg),Vit A total (equivalentes retinol) (mg),Caroteno (mg),vit. D (µg),a-tocoferol (mg),Tiamina (mg),Riboflavina (mg),Equivalentes de niacina (mg) ,Niacina (mg),Triptofano/60 (mg),vit B6 (mg),Vit. B12 (µg),vit. C (mg),Folatos (µg),Cinza (g),Na (mg),K(mg),Ca (mg),P (mg),Mg (mg),Fe (mg),Zn (mg)\n"+
                this.energiaKCla+","+
                this.energiaKj  +","+
                this.agua +","+
                this.proteina +","+
                this.gorduraTotal +","+
                this.totalHCDisponiveis +","+
                this.totalHCMonossacaridos +","+
                this.monoDissacaridos +","+
                this.acidosOrganicos +","+
                this.alcool +","+
                this.amido +","+
                this.oligossacaridos +","+
                this.fibraAlimentar +","+
                this.acidosGordosSaturados +","+
                this.acidosGordosMonoinsaturados +","+
                this.acidosGordosPolinsaturados +","+
                this.acidosGordosTrans +","+
                this.acidoLinoleico +","+
                this.colesterol +","+
                this.Retinol +","+
                this.vitATotal +","+
                this.caroteno +","+
                this.vitD +","+
                this.aTocoferol +","+
                this.Tiamina +","+
                this.Riboflavina +","+
                this.equivalentesNiacina +","+
                this.niacina +","+
                this.triptofano +","+
                this.vitB6 +","+
                this.vitB12 +","+
                this.vitC +","+
                this.folatos +","+
                this.cinza +","+
                this.Na +","+
                this.K +","+
                this.Ca +","+
                this.P +","+
                this.Mg +","+
                this.Fe +","+
                this.Zn ;
    }




    public void setProductID(String productID)  {

        assert productID!=null;
        assert productID.length()<10;
        assert productID.length()>3;

        this.productID = productID;
    }



    public void setName(String name)  {

        assert name!=null;
        assert name.length()<50;
        assert name.length()>2;

        this.name = name;
    }

    public void setEnergiaKCla(Float energiaKCla) {
        assert energiaKCla!=null;
        assert energiaKCla>=0.0f;
        assert energiaKCla<1000.0f;

        this.energiaKCla = energiaKCla;
    }


    public void setEnergiaKj(Float energiaKj)  {

        assert energiaKj!=null;
        assert energiaKj>=0.0f;
        assert energiaKj<4500;

        this.energiaKj = energiaKj;
    }


    public void setAgua(Float agua)  {
        assert agua!=null;
        assert agua>=1.5f;
        assert agua<100.0f;


        this.agua = agua;
    }


    public void setProteina(Float proteina) {
        assert proteina!=null;
        assert proteina>=0.0f;
        assert proteina<=100.0f;

        this.proteina = proteina;
    }


    public void setGorduraTotal(Float gorduraTotal){

        assert gorduraTotal!=null;
        assert gorduraTotal>=0.0f;
        assert gorduraTotal<=100.0f;

        this.gorduraTotal = gorduraTotal;
    }

    public void setTotalHCDisponiveis(Float totalHCDisponiveis)  {

        assert totalHCDisponiveis!=null;
        assert totalHCDisponiveis>=0.0f;
        assert totalHCDisponiveis<=100.0f;

        this.totalHCDisponiveis = totalHCDisponiveis;
    }


    public void setTotalHCMonossacaridos(Float totalHCMonossacaridos) {
        assert totalHCMonossacaridos!=null;
        assert totalHCMonossacaridos>=0.0f;
        assert totalHCMonossacaridos<=120.0f;


        this.totalHCMonossacaridos = totalHCMonossacaridos;
    }


    public void setMonoDissacaridos(Float monoDissacaridos) {
        assert monoDissacaridos!=null;
        assert monoDissacaridos>=0.0f;
        assert monoDissacaridos<=400.0f;

        this.monoDissacaridos = monoDissacaridos;
    }


    public void setAcidosOrganicos(Float acidosOrganicos)  {

        assert acidosOrganicos!=null;
        assert acidosOrganicos>=0.0f;
        assert acidosOrganicos<=500.0f;

        this.acidosOrganicos = acidosOrganicos;
    }


    public void setAlcool(Float alcool) {

        assert alcool!=null;
        assert alcool>=0.0f;
        assert alcool<=60.f;

        this.alcool = alcool;
    }


    public void setAmido(Float amido) {
        assert amido!=null;
        assert amido>0.0f;

        this.amido = amido;
    }

    public void setOligossacaridos(Float oligossacaridos) {
        assert oligossacaridos != null;
        assert oligossacaridos > 0.0f;

        this.oligossacaridos = oligossacaridos;
    }

    public void setFibraAlimentar(Float fibraAlimentar) {
        assert fibraAlimentar != null;
        assert fibraAlimentar > 0.0f;

        this.fibraAlimentar = fibraAlimentar;
    }


    public void setAcidosGordosSaturados(Float acidosGordosSaturados) {
        assert acidosGordosSaturados != null;
        assert acidosGordosSaturados > 0.0f;

        this.acidosGordosSaturados = acidosGordosSaturados;
    }


    public void setAcidosGordosMonoinsaturados(Float acidosGordosMonoinsaturados) {
        assert acidosGordosMonoinsaturados != null;
        assert acidosGordosMonoinsaturados > 0.0f;

        this.acidosGordosMonoinsaturados = acidosGordosMonoinsaturados;
    }



    public void setAcidosGordosPolinsaturados(Float acidosGordosPolinsaturados) {
        assert acidosGordosPolinsaturados != null;
        assert acidosGordosPolinsaturados > 0.0f;

        this.acidosGordosPolinsaturados = acidosGordosPolinsaturados;
    }


    public void setAcidosGordosTrans(Float acidosGordosTrans) {
        assert acidosGordosTrans != null;
        assert acidosGordosTrans > 0.0f;
        this.acidosGordosTrans = acidosGordosTrans;
    }




    public Float getFibraAlimentar() {
        return fibraAlimentar;
    }
    public Float getAcidosGordosMonoinsaturados() {
        return acidosGordosMonoinsaturados;
    }
    public Float getAcidosGordosPolinsaturados() {
        return acidosGordosPolinsaturados;
    }
    public Float getAcidosGordosTrans() {
        return acidosGordosTrans;
    }
    public Float getOligossacaridos() {
        return oligossacaridos;
    }
    public Float getAmido() {
        return amido;
    }
    public Float getAlcool() {
        return alcool;
    }
    public Float getAcidosOrganicos() {
        return acidosOrganicos;
    }
    public Float getMonoDissacaridos() {
        return monoDissacaridos;
    }
    public Float getTotalHCMonossacaridos() {
        return totalHCMonossacaridos;
    }

    public Float getTotalHCDisponiveis() {
        return totalHCDisponiveis;
    }
    public Float getGorduraTotal() {
        return gorduraTotal;
    }
    public Float getProteina() {
        return proteina;
    }
    public Float getAgua() {
        return agua;
    }
    public Float getEnergiaKj() {
        return energiaKj;
    }

    public Float getEnergiaKCla() {
        return energiaKCla;
    }
    public String getName() {
        return name;
    }
    public String getProductID() {
        return productID;
    }
    public Float getAcidosGordosSaturados() {
        return acidosGordosSaturados;
    }

    public Float getAcidoLinoleico() {
        return acidoLinoleico;
    }

    public void setAcidoLinoleico(Float acidoLinoleico) {
        this.acidoLinoleico = acidoLinoleico;
    }

    public Float getColesterol() {
        return colesterol;
    }

    public void setColesterol(Float colesterol) {
        this.colesterol = colesterol;
    }

    public Float getVitATotal() {
        return vitATotal;
    }

    public void setVitATotal(Float vitATotal) {
        this.vitATotal = vitATotal;
    }

    public Float getCaroteno() {
        return caroteno;
    }

    public void setCaroteno(Float caroteno) {
        this.caroteno = caroteno;
    }

    public Float getVitD() {
        return vitD;
    }

    public void setVitD(Float vitD) {
        this.vitD = vitD;
    }

    public Float getaTocoferol() {
        return aTocoferol;
    }

    public void setaTocoferol(Float aTocoferol) {
        this.aTocoferol = aTocoferol;
    }

    public Float getTiamina() {
        return Tiamina;
    }

    public void setTiamina(Float tiamina) {
        Tiamina = tiamina;
    }

    public Float getRiboflavina() {
        return Riboflavina;
    }

    public void setRiboflavina(Float riboflavina) {
        Riboflavina = riboflavina;
    }

    public Float getEquivalentesNiacina() {
        return equivalentesNiacina;
    }

    public void setEquivalentesNiacina(Float equivalentesNiacina) {
        this.equivalentesNiacina = equivalentesNiacina;
    }

    public Float getNiacina() {
        return niacina;
    }

    public void setNiacina(Float niacina) {
        this.niacina = niacina;
    }

    public Float getTriptofano() {
        return triptofano;
    }

    public void setTriptofano(Float triptofano) {
        this.triptofano = triptofano;
    }

    public Float getVitB6() {
        return vitB6;
    }

    public void setVitB6(Float vitB6) {
        this.vitB6 = vitB6;
    }

    public Float getVitB12() {
        return vitB12;
    }

    public void setVitB12(Float vitB12) {
        this.vitB12 = vitB12;
    }

    public Float getVitC() {
        return vitC;
    }

    public void setVitC(Float vitC) {
        this.vitC = vitC;
    }

    public Float getFolatos() {
        return folatos;
    }

    public void setFolatos(Float folatos) {
        this.folatos = folatos;
    }

    public Float getCinza() {
        return cinza;
    }

    public void setCinza(Float cinza) {
        this.cinza = cinza;
    }

    public Float getNa() {
        return Na;
    }

    public void setNa(Float na) {
        Na = na;
    }

    public Float getK() {
        return K;
    }

    public void setK(Float k) {
        K = k;
    }

    public Float getCa() {
        return Ca;
    }

    public void setCa(Float ca) {
        Ca = ca;
    }

    public Float getP() {
        return P;
    }

    public void setP(Float p) {
        P = p;
    }

    public Float getMg() {
        return Mg;
    }

    public void setMg(Float mg) {
        Mg = mg;
    }

    public Float getFe() {
        return Fe;
    }

    public void setFe(Float fe) {
        Fe = fe;
    }

    public Float getZn() {
        return Zn;
    }

    public void setZn(Float zn) {
        Zn = zn;
    }



}

