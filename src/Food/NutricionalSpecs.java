package Food;


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
        assert specs!=null;
        assert !specs.isEmpty();

        String[] x=   specs.split(";");

        setProductID( x[0]);
        setName( x[1]);
        setEnergiaKCla(Float.parseFloat(x[2]));
        setEnergiaKj(Float.parseFloat(x[3]));
        setAgua(Float.parseFloat(x[4]));
        setProteina( Float.parseFloat(x[5]));
        setGorduraTotal(Float.parseFloat(x[6]));
        setTotalHCDisponiveis(Float.parseFloat(x[7]));
        setTotalHCMonossacaridos( Float.parseFloat(x[8]));
        setMonoDissacaridos(Float.parseFloat(x[9]));
        setAcidosOrganicos(Float.parseFloat(x[10]));
        setAlcool( Float.parseFloat(x[11]));
        setAmido(Float.parseFloat(x[12]));
        setOligossacaridos( Float.parseFloat(x[13]));
        setFibraAlimentar(Float.parseFloat(x[14]));
        setAcidosGordosSaturados(Float.parseFloat(x[15]));
        setAcidosGordosMonoinsaturados(Float.parseFloat(x[16]));
        setAcidosGordosPolinsaturados(Float.parseFloat(x[17]));
        setAcidosGordosTrans( Float.parseFloat(x[18]));
        setAcidoLinoleico(Float.parseFloat(x[19]));
        setColesterol(Float.parseFloat(x[20]));
        setRetinol(Float.parseFloat(x[21]));
        setVitATotal(Float.parseFloat(x[22]));
        setCaroteno( Float.parseFloat(x[23]));
        setVitD(Float.parseFloat(x[24]));
        setaTocoferol( Float.parseFloat(x[25]));
        setTiamina( Float.parseFloat(x[26]));
        setRiboflavina(Float.parseFloat(x[27]));
        setEquivalentesNiacina( Float.parseFloat(x[28]));
        setNiacina( Float.parseFloat(x[29]));
        setTriptofano(Float.parseFloat(x[30]));
        setVitB6(Float.parseFloat(x[31]));
        setVitB12(Float.parseFloat(x[32]));
        setVitC( Float.parseFloat(x[33]));
        setFolatos(Float.parseFloat(x[34]));
        setCinza(Float.parseFloat(x[35]));
        setNa(Float.parseFloat(x[36]));
        setK(Float.parseFloat(x[37]));
        setCa(Float.parseFloat(x[38]));
        setP(Float.parseFloat(x[38]));
        setMg(Float.parseFloat(x[40]));
        setFe(Float.parseFloat(x[41]));
        setZn(Float.parseFloat(x[42]));
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
        return  "Energia (kcal),Energia (kJ),Água (g),Proteína (g),Gordura total (g),Total HC disponíveis (g),Total HC expresso em monossacáridos (g),Mono + dissacáridos (g),Ácidos orgânicos (g),Álcool (g),Amido (g),Oligossacáridos (g),Fibra alimentar (g),Ácidos gordos saturados (g),Ácidos gordos monoinsaturados (g),Ácidos gordos polinsaturados  (g),Ácidos gordos trans (g),Ácido linoleico (g),Colesterol (mg),Retinol (vit. A total) (mg),Vit A total (equivalentes retinol) (mg),Caroteno (mg),vit. D (µg),a-tocoferol (mg),Tiamina (mg),Riboflavina (mg),Equivalentes de niacina (mg) ,Niacina (mg),Triptofano/60 (mg),vit B6 (mg),Vit. B12 (µg),vit. C (mg),Folatos (µg),Cinza (g),Na (mg),K(mg),Ca (mg),P (mg),Mg (mg),Fe (mg),Zn (mg)\n"+ this.energiaKCla+","+ this.energiaKj  +","+ this.agua +","+ this.proteina +","+ this.gorduraTotal +","+ this.totalHCDisponiveis +","+ this.totalHCMonossacaridos +","+ this.monoDissacaridos +","+ this.acidosOrganicos +","+ this.alcool +","+ this.amido +","+ this.oligossacaridos +","+ this.fibraAlimentar +","+ this.acidosGordosSaturados +","+ this.acidosGordosMonoinsaturados +","+ this.acidosGordosPolinsaturados +","+ this.acidosGordosTrans +","+ this.acidoLinoleico +","+ this.colesterol +","+ this.Retinol +","+ this.vitATotal +","+ this.caroteno +","+ this.vitD +","+ this.aTocoferol +","+ this.Tiamina +","+ this.Riboflavina +","+ this.equivalentesNiacina +","+ this.niacina +","+ this.triptofano +","+ this.vitB6 +","+ this.vitB12 +","+ this.vitC +","+ this.folatos +","+ this.cinza +","+ this.Na +","+ this.K +","+ this.Ca +","+ this.P +","+ this.Mg +","+ this.Fe +","+ this.Zn ;
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
        assert amido>=0.0f;
        assert amido<=90.2f;

        this.amido = amido;
    }

    public void setOligossacaridos(Float oligossacaridos) {
        assert oligossacaridos != null;
        assert oligossacaridos >= 0.0f;
        assert oligossacaridos <= 6.3f;

        this.oligossacaridos = oligossacaridos;
    }

    public void setFibraAlimentar(Float fibraAlimentar) {
        assert fibraAlimentar != null;
        assert fibraAlimentar >= 0.0f;
        assert fibraAlimentar <= 30.0f;

        this.fibraAlimentar = fibraAlimentar;
    }


    public void setAcidosGordosSaturados(Float acidosGordosSaturados) {
        assert acidosGordosSaturados != null;
        assert acidosGordosSaturados >= 0.0f;
        assert acidosGordosSaturados <= 86.9f;
        this.acidosGordosSaturados = acidosGordosSaturados;
    }


    public void setAcidosGordosMonoinsaturados(Float acidosGordosMonoinsaturados) {
        assert acidosGordosMonoinsaturados != null;
        assert acidosGordosMonoinsaturados >= 0.0f;
        assert acidosGordosMonoinsaturados <= 78.6;
        this.acidosGordosMonoinsaturados = acidosGordosMonoinsaturados;
    }



    public void setAcidosGordosPolinsaturados(Float acidosGordosPolinsaturados) {
        assert acidosGordosPolinsaturados != null;
        assert acidosGordosPolinsaturados >= 0.0f;
        assert acidosGordosPolinsaturados <= 63.9f;

        this.acidosGordosPolinsaturados = acidosGordosPolinsaturados;
    }


    public void setAcidosGordosTrans(Float acidosGordosTrans) {
        assert acidosGordosTrans != null;
        assert acidosGordosTrans >= 0.0f;
        assert acidosGordosTrans <= 17.0f;
        this.acidosGordosTrans = acidosGordosTrans;
    }

    public void setRetinol(Float retinol) {
        assert retinol != null;
        assert retinol >= 0.0f;
        assert retinol < 15.0f;

        Retinol = retinol;
    }

    public void setAcidoLinoleico(Float acidoLinoleico) {
        assert acidoLinoleico != null;
        assert acidoLinoleico >= 0.0f;
        assert acidoLinoleico <= 64.0f;

        this.acidoLinoleico = acidoLinoleico;
    }


    public void setColesterol(Float colesterol) {
        assert colesterol != null;
        assert colesterol >= 0.0f;
        assert colesterol <= 1280.0;
        this.colesterol = colesterol;
    }
    public void setVitATotal(Float vitATotal) {
        assert vitATotal != null;
        assert vitATotal >= 0.0f;
        assert vitATotal <= 15000.0;
        this.vitATotal = vitATotal;
    }
    public void setCaroteno(Float caroteno) {
        assert caroteno != null;
        assert caroteno >= 0.0f;
        assert caroteno <= 30730.0f;
        this.caroteno = caroteno;
    }
    public void setVitD(Float vitD) {
        assert vitD != null;
        assert vitD >= 0.0f;
        assert vitD <= 92.0f;

        this.vitD = vitD;
    }
    public void setaTocoferol(Float aTocoferol) {
        assert aTocoferol != null;
        assert aTocoferol >= 0.0f;
        assert aTocoferol <= 84.0f;
        this.aTocoferol = aTocoferol;
    }
    public void setTiamina(Float tiamina) {
        assert tiamina != null;
        assert tiamina >= 0.0f;
        assert tiamina <= 2.5f;

        Tiamina = tiamina;
    }
    public void setRiboflavina(Float riboflavina) {
        assert riboflavina != null;
        assert riboflavina >= 0.0f;
        assert riboflavina <= 4.7f;

        Riboflavina = riboflavina;
    }

    public void setEquivalentesNiacina(Float equivalentesNiacina) {
        assert equivalentesNiacina != null;
        assert equivalentesNiacina >= 0.0f;
        assert equivalentesNiacina <= 33.0f;

        this.equivalentesNiacina = equivalentesNiacina;
    }
    public void setNiacina(Float niacina) {

        assert niacina != null;
        assert niacina >= 0.0f;
        assert niacina <= 31.0f;

        this.niacina = niacina;
    }
    public void setTriptofano(Float triptofano) {
        assert triptofano != null;
        assert triptofano >= 0.0f;
        assert triptofano <= 10.0f;

        this.triptofano = triptofano;
    }
    public void setVitB6(Float vitB6) {
        assert vitB6 != null;
        assert vitB6 >= 0.0f;
        assert vitB6 <= 3.4f;
        this.vitB6 = vitB6;
    }
    public void setVitB12(Float vitB12) {
        assert vitB12 != null;
        assert vitB12 >= 0.0f;
        assert vitB12 <= 110.0f;

        this.vitB12 = vitB12;
    }
    public void setVitC(Float vitC) {
        assert vitC != null;
        assert vitC >= 0.0f;
        assert vitC <= 375.0f;

        this.vitC = vitC;
    }
    public void setFolatos(Float folatos) {
        assert folatos != null;
        assert folatos >= 0.0f;
        assert folatos <= 2500.0f;

        this.folatos = folatos;
    }

    public void setCinza(Float cinza) {
        assert cinza != null;
        assert cinza >= 0.0f;
        assert cinza <= 98.0f;

        this.cinza = cinza;
    }
    public void setNa(Float na) {
        assert na != null;
        assert na >= 0.0f;
        assert na <= 40000.0;


        Na = na;
    }
    public void setK(Float k) {
        assert k != null;
        assert k >= 0.0f;
        assert k <= 3930.0f;


        K = k;
    }
    public void setCa(Float ca) {
        assert ca != null;
        assert ca >= 0.0f;
        assert ca <= 1300.0f;

        Ca = ca;
    }

    public void setP(Float p) {
        assert p != null;
        assert p >= 0.0f;
        assert p <= 10523.0f;

        P = p;
    }
    public void setMg(Float mg) {
        assert mg != null;
        assert mg >= 0.0f;
        assert mg <= 406.0f;
        Mg = mg;
    }
    public void setFe(Float fe) {
        assert fe != null;
        assert fe >= 0.0f;
        assert fe <= 38.0f;
        Fe = fe;
    }
    public void setZn(Float zn) {
        assert zn != null;
        assert zn >= 0.0f;
        assert zn <= 91.0f;

        Zn = zn;
    }
    public Float getColesterol(){return colesterol;}
    public Float getRetinol() {
        return Retinol;
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
    public Float getAcidoLinoleico() { return acidoLinoleico; }
    public Float getVitATotal() {
        return vitATotal;
    }
    public Float getCaroteno() {
        return caroteno;
    }
    public Float getVitD() {
        return vitD;
    }
    public Float getaTocoferol() {
        return aTocoferol;
    }
    public Float getTiamina() {
        return Tiamina;
    }
    public Float getRiboflavina() {
        return Riboflavina;
    }
    public Float getEquivalentesNiacina() {
        return equivalentesNiacina;
    }
    public Float getNiacina() {
        return niacina;
    }
    public Float getTriptofano() {
        return triptofano;
    }
    public Float getVitB6() {
        return vitB6;
    }
    public Float getVitB12() {
        return vitB12;
    }
    public Float getVitC() {
        return vitC;
    }
    public Float getFolatos() {
        return folatos;
    }
    public Float getCinza() {
        return cinza;
    }
    public Float getNa() {
        return Na;
    }
    public Float getK() {
        return K;
    }
    public Float getCa() {
        return Ca;
    }
    public Float getP() {
        return P;
    }
    public Float getMg() {
        return Mg;
    }
    public Float getFe() {
        return Fe;
    }
    public Float getZn() {
        return Zn;
    }


}

