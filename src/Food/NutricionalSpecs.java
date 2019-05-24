package Food;







public class NutricionalSpecs {
    private String productID;
    private String name;
    private Integer energiaKCla;
    private Integer energiaKj;
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
    private Float acidosGordosAcidosGordosTrans;
    private Float acidoLinoleico;
    private Float colesterol;
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


    public NutricionalSpecs(String productID, String name, Integer energiaKCla, Integer energiaKj, Float agua, Float proteina, Float gorduraTotal, Float totalHCDisponiveis, Float totalHCMonossacaridos, Float monoDissacaridos, Float acidosOrganicos, Float alcool, Float amido, Float oligossacaridos, Float fibraAlimentar, Float acidosGordosSaturados, Float acidosGordosMonoinsaturados, Float acidosGordosPolinsaturados, Float acidosGordosAcidosGordosTrans, Float acidoLinoleico, Float colesterol, Float vitATotal, Float caroteno, Float vitD, Float aTocoferol, Float tiamina, Float riboflavina, Float equivalentesNiacina, Float niacina, Float triptofano, Float vitB6, Float vitB12, Float vitC, Float folatos, Float cinza, Float na, Float k, Float ca, Float p, Float mg, Float fe, Float zn) {
        this.productID = productID;
        this.name = name;
        this.energiaKCla = energiaKCla;
        this.energiaKj = energiaKj;
        this.agua = agua;
        this.proteina = proteina;
        this.gorduraTotal = gorduraTotal;
        this.totalHCDisponiveis = totalHCDisponiveis;
        this.totalHCMonossacaridos = totalHCMonossacaridos;
        this.monoDissacaridos = monoDissacaridos;
        this.acidosOrganicos = acidosOrganicos;
        this.alcool = alcool;
        this.amido = amido;
        this.oligossacaridos = oligossacaridos;
        this.fibraAlimentar = fibraAlimentar;
        this.acidosGordosSaturados = acidosGordosSaturados;
        this.acidosGordosMonoinsaturados = acidosGordosMonoinsaturados;
        this.acidosGordosPolinsaturados = acidosGordosPolinsaturados;
        this.acidosGordosAcidosGordosTrans = acidosGordosAcidosGordosTrans;
        this.acidoLinoleico = acidoLinoleico;
        this.colesterol = colesterol;
        this.vitATotal = vitATotal;
        this.caroteno = caroteno;
        this.vitD = vitD;
        this.aTocoferol = aTocoferol;
        Tiamina = tiamina;
        Riboflavina = riboflavina;
        this.equivalentesNiacina = equivalentesNiacina;
        this.niacina = niacina;
        this.triptofano = triptofano;
        this.vitB6 = vitB6;
        this.vitB12 = vitB12;
        this.vitC = vitC;
        this.folatos = folatos;
        this.cinza = cinza;
        Na = na;
        K = k;
        Ca = ca;
        P = p;
        Mg = mg;
        Fe = fe;
        Zn = zn;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEnergiaKCla() {
        return energiaKCla;
    }

    public void setEnergiaKCla(Integer energiaKCla) {
        this.energiaKCla = energiaKCla;
    }

    public Integer getEnergiaKj() {
        return energiaKj;
    }

    public void setEnergiaKj(Integer energiaKj) {
        this.energiaKj = energiaKj;
    }

    public Float getAgua() {
        return agua;
    }

    public void setAgua(Float agua) {
        this.agua = agua;
    }

    public Float getProteina() {
        return proteina;
    }

    public void setProteina(Float proteina) {
        this.proteina = proteina;
    }

    public Float getGorduraTotal() {
        return gorduraTotal;
    }

    public void setGorduraTotal(Float gorduraTotal) {
        this.gorduraTotal = gorduraTotal;
    }

    public Float getTotalHCDisponiveis() {
        return totalHCDisponiveis;
    }

    public void setTotalHCDisponiveis(Float totalHCDisponiveis) {
        this.totalHCDisponiveis = totalHCDisponiveis;
    }

    public Float getTotalHCMonossacaridos() {
        return totalHCMonossacaridos;
    }

    public void setTotalHCMonossacaridos(Float totalHCMonossacaridos) {
        this.totalHCMonossacaridos = totalHCMonossacaridos;
    }

    public Float getMonoDissacaridos() {
        return monoDissacaridos;
    }

    public void setMonoDissacaridos(Float monoDissacaridos) {
        this.monoDissacaridos = monoDissacaridos;
    }

    public Float getAcidosOrganicos() {
        return acidosOrganicos;
    }

    public void setAcidosOrganicos(Float acidosOrganicos) {
        this.acidosOrganicos = acidosOrganicos;
    }

    public Float getAlcool() {
        return alcool;
    }

    public void setAlcool(Float alcool) {
        this.alcool = alcool;
    }

    public Float getAmido() {
        return amido;
    }

    public void setAmido(Float amido) {
        this.amido = amido;
    }

    public Float getOligossacaridos() {
        return oligossacaridos;
    }

    public void setOligossacaridos(Float oligossacaridos) {
        this.oligossacaridos = oligossacaridos;
    }

    public Float getFibraAlimentar() {
        return fibraAlimentar;
    }

    public void setFibraAlimentar(Float fibraAlimentar) {
        this.fibraAlimentar = fibraAlimentar;
    }

    public Float getAcidosGordosSaturados() {
        return acidosGordosSaturados;
    }

    public void setAcidosGordosSaturados(Float acidosGordosSaturados) {
        this.acidosGordosSaturados = acidosGordosSaturados;
    }

    public Float getAcidosGordosMonoinsaturados() {
        return acidosGordosMonoinsaturados;
    }

    public void setAcidosGordosMonoinsaturados(Float acidosGordosMonoinsaturados) {
        this.acidosGordosMonoinsaturados = acidosGordosMonoinsaturados;
    }

    public Float getAcidosGordosPolinsaturados() {
        return acidosGordosPolinsaturados;
    }

    public void setAcidosGordosPolinsaturados(Float acidosGordosPolinsaturados) {
        this.acidosGordosPolinsaturados = acidosGordosPolinsaturados;
    }

    public Float getAcidosGordosAcidosGordosTrans() {
        return acidosGordosAcidosGordosTrans;
    }

    public void setAcidosGordosAcidosGordosTrans(Float acidosGordosAcidosGordosTrans) {
        this.acidosGordosAcidosGordosTrans = acidosGordosAcidosGordosTrans;
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
