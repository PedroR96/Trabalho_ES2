import Food.NutricionalSpecs;
import People.MaxCharacters;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.FontUIResource;
import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class NutricionalSpecsTest {

    @BeforeEach
    void setUp() {
    }


    /**
     * Tests from ProductID
     * @throws MaxCharacters
     */
    @Test
    void testProductIDRight() throws MaxCharacters {
        NutricionalSpecs ns = new NutricionalSpecs();

        ns.setProductID("IS019");

        assertEquals("IS019",ns.getProductID());
    }

    @Test
    void testProductIDNull(){
        NutricionalSpecs ns =  new NutricionalSpecs();

        assertThrows(NullPointerException.class,()->{
            ns.setProductID(null);
            ns.getProductID();
        });
    }


    @Test
    void testProductIDBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
            ns.setProductID("IS152635824");
            ns.getProductID();
        });
    }

    @Test
    void testProductIDSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
            ns.setProductID("IS");
            ns.getProductID();
        });
    }

    /**
     * Tests from Name of product
     * @throws MaxCharacters
     */
    @Test
    void testNameRight() throws MaxCharacters {
        NutricionalSpecs ns = new NutricionalSpecs();

        ns.setName("Leite de Ovelha cru");
        assertEquals("Leite de Ovelha cru",ns.getName());
    }

    @Test
    void testNameNull(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(NullPointerException.class,()->{
           ns.setName(null);
           ns.getName();
        });
    }

    @Test
    void testNameBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
            ns.setName("Leite de Ovelha cru com brao de milho e arroz com feijão");
            ns.getName();
        });
    }

    @Test
    void testNameSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
            ns.setName("q");
            ns.getName();
        });
    }

    /**
     * Tests from energiaKCla of product
     */

    @Test
    void testEnergyKClaRight() throws MaxCharacters {
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setEnergiaKCla(352.0f);
        assertEquals(352,ns.getEnergiaKCla());
    }

    @Test
    void testEnergyKClaBigger() {
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
            ns.setEnergiaKCla(1001.0f);
            ns.getEnergiaKCla();
        });
    }

    @Test
    void testEnergyKClaSmaller() {
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
            ns.setEnergiaKCla(-1.0f);
            ns.getEnergiaKCla();
        });
    }

    /**
     *tests from energiaKj of products
     */
    @Test
    void testEnergyKJRight() throws MaxCharacters {
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setEnergiaKj(125.0f);
        assertEquals(125,ns.getEnergiaKj());
    }
    @Test
    void testEnergyKjBigger() {
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
           ns.setEnergiaKj(4501.0f);
           ns.getEnergiaKj();
        });
    }
    @Test
    void testEnergyKjSmaller() {
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
            ns.setEnergiaKj(-1.0f);
            ns.getEnergiaKj();
        });
    }

    /**
     *test from water of products
     */
    @Test
    void testWaterRight() throws MaxCharacters {
        NutricionalSpecs ns = new NutricionalSpecs();

        ns.setAgua((float) 25.3);
        assertEquals((float)25.3,ns.getAgua());
    }

    @Test
    void testWaterBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
           ns.setAgua((float)100.1);
           ns.getAgua();
        });
    }

    @Test
    void testWaterSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(MaxCharacters.class,()->{
            ns.setAgua((float)1.4);
            ns.getAgua();
        });
    }

    /**
     * test from Protein of product
     */
    @Test
    void testProteinRight() throws MaxCharacters {
        NutricionalSpecs ns =new NutricionalSpecs();
        ns.setProteina((float) 20.2);
        assertEquals((float)20.2,ns.getProteina());
    }

    @Test
    void testProteinBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(MaxCharacters.class,()->{
           ns.setProteina((float)40.1);
           ns.getProteina();
        });
    }

    @Test
    void testProteinSmaller(){
        NutricionalSpecs ns  = new NutricionalSpecs();
        assertThrows(MaxCharacters.class,()->{
           ns.setProteina((float)-0.1);
           ns.getProteina();
        });
    }

    /**
     * test from total fat
     */
    @Test
    void testTotalFatRight() throws MaxCharacters {
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setGorduraTotal((float) 50.2 );
        assertEquals((float)50.2,ns.getGorduraTotal());
    }

    @Test
    void testTotalFatBigger(){
        NutricionalSpecs ns =  new NutricionalSpecs();
        assertThrows(MaxCharacters.class,()->{
           ns.setGorduraTotal((float) 100.1);
           ns.getGorduraTotal();
        });
    }
    @Test
    void testTotalFatSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(MaxCharacters.class,()->{
           ns.setGorduraTotal((float) -0.1);
           ns.getGorduraTotal();
        });
    }

    /**
     * test from total HC disponiveis
     */
    @Test
    void testTotalHCFreeRight() throws MaxCharacters {
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setTotalHCDisponiveis((float) 50.2 );
        assertEquals((float)50.2,ns.getTotalHCDisponiveis());
    }
    @Test
    void testTotalHCFreeBigger() {
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(MaxCharacters.class,()->{
            ns.setTotalHCDisponiveis((float) 100.1);
            ns.getTotalHCDisponiveis();
        });
    }
    @Test
    void testTotalHCFreeSmaller() {
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(MaxCharacters.class,()->{
            ns.setTotalHCDisponiveis((float) -0.1);
            ns.getTotalHCDisponiveis();
        });
    }

    /**
     * test from total HC Monossacaridos
     */

    @Test
    void testTotalHCMonossacaridosRight() throws MaxCharacters {
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setTotalHCMonossacaridos((float) 50.2 );
        assertEquals((float)50.2,ns.getTotalHCMonossacaridos());
    }

    @Test
    void testTotalHCMonossacaridosBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(MaxCharacters.class,()->{
            ns.setTotalHCMonossacaridos((float) 120.1);
            ns.getTotalHCMonossacaridos();
        });
    }

    @Test
    void testTotalHCMonossacaridosSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(MaxCharacters.class,()->{
            ns.setTotalHCMonossacaridos((float) -0.1);
            ns.getTotalHCMonossacaridos();
        });
    }

    /**
     * test from  MonoDissacaridos
     */
    @Test
    void testMonoDissacaridosRight() throws MaxCharacters {
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setMonoDissacaridos((float) 50.2 );
        assertEquals((float)50.2,ns.getMonoDissacaridos());
    }

    @Test
    void testMonoDissacaridosBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(MaxCharacters.class,()->{
            ns.setMonoDissacaridos((float) 100.1);
            ns.getMonoDissacaridos();
        });
    }

    @Test
    void testMonoDissacaridosSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(MaxCharacters.class,()->{
            ns.setMonoDissacaridos((float) -0.1);
            ns.getMonoDissacaridos();
        });
    }

    /**
     * test from  AcidosOrganicos
     */
    @Test
    void testAcidosOrganicosRight() throws MaxCharacters {
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setAcidosOrganicos((float) 0.5);
        assertEquals((float)0.5,ns.getAcidosOrganicos());
    }
    @Test
    void testAcidosOrganicosBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(MaxCharacters.class,()->{
            ns.setAcidosOrganicos((float) 2.1);
            ns.getAcidosOrganicos();
        });
    }
    @Test
    void testAcidosOrganicosSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(MaxCharacters.class,()->{
            ns.setAcidosOrganicos((float) -0.1);
            ns.getAcidosOrganicos();
        });
    }

    /**
     * test from alcool
     */
    @Test
    void testAlcoolRight() throws MaxCharacters {
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setAcidosOrganicos((float) 1.0);
        assertEquals((float)1.0,ns.getAcidosOrganicos());
    }

    @Test
    void testAlcoolBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(MaxCharacters.class,()->{
            ns.setAcidosOrganicos((float) 60.1);
            ns.getAcidosOrganicos();
        });
    }

    @Test
    void testAlcoolSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(MaxCharacters.class,()->{
            ns.setAcidosOrganicos((float) -0.1);
            ns.getAcidosOrganicos();
        });
    }

    /**
     * test from amido
     */

    @Test
    void testAmidoNull(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(AssertionError.class, ()->{
            ns.setAmido(null);

        });
    }

    @Test
    void testAmidoZero(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(AssertionError.class, ()->{
            ns.setAmido(0.0f);
        });
    }

    @Test
    void testAmidoRight(){
        NutricionalSpecs ns = new NutricionalSpecs();

        ns.setAmido(0.1f);
        assertEquals(0.1f, ns.getAmido());
    }

    /**
     *  test for getOligossacaridos
     */
    @Test
    void testOligossacaridosRight(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setOligossacaridos(0.1f);
        assertEquals(0.1f, ns.getOligossacaridos());
    }
    @Test
    void testOligossacaridosSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
           ns.setOligossacaridos(0.0f);
        });
    }
    @Test
    void testOligossacaridosNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
            ns.setOligossacaridos(null);
        });
    }

    /**
     *  test for fibraalimentar
     */

    @Test
    void testFibraAlimentarNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
           ns.setFibraAlimentar(null);
        });
    }
    @Test
    void testFibraAlimentarZero(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
           ns.setFibraAlimentar(0.0f);
        });
    }
    @Test
    void testFibraAlimentarRight(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setFibraAlimentar(0.1f);
        assertEquals(0.1f, ns.getFibraAlimentar());
    }

    /**
     *  test acidosgordossaturados
     */
    @Test
    void testAcidosGordosSaturadosRight(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setAcidosGordosSaturados(0.1f);
        assertEquals(0.1f,ns.getAcidosGordosSaturados());
    }

    @Test
    void testAcidosGordosSaturadosZero(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
           ns.setAcidosGordosSaturados(0.0f);
        });
    }

    @Test
    void testAcidosGordosSaturadosNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
            ns.setAcidosGordosSaturados(null);
        });
    }

    /**
     *  test
     */
    @Test
    void testAcidosGordosMonoinsaturadosNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{ns.setAcidosGordosMonoinsaturados(null);});
    }

    @Test
    void testAcidosGordosMonoinsaturadosZero(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{ns.setAcidosGordosMonoinsaturados(0.0f);});
    }
    @Test
    void testAcidosGordosMonoinsaturadosRight(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setAcidosGordosMonoinsaturados(0.1f);
        assertEquals(0.1f,ns.getAcidosGordosMonoinsaturados());
    }

    /**
     *  test AcidosGordosPolinsaturados
     */
    @Test
    void testAcidosGordosPolinsaturados(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setAcidosGordosPolinsaturados(0.1f);
        assertEquals(0.1f,ns.getAcidosGordosPolinsaturados());
    }
    @Test
    void testAcidosGordosPolinsaturadosNull(){

        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
           ns.setAcidosGordosPolinsaturados(null);
        });
    }
    @Test
    void testAcidosGordosPolinsaturadosZero(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
            ns.setAcidosGordosPolinsaturados(0.0f);
        });
    }

    /**
     * test for AcidosGordosTrans
     */
    @Test
    void testAcidosGordosTrans(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setAcidosGordosTrans(0.1f);
        assertEquals(0.1f,ns.getAcidosGordosTrans());
    }

    @Test
    void testAcidosGordosTransNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
           ns.setAcidosGordosTrans(null);
        });
    }

    @Test
    void testAcidosGordosTransZero(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
           ns.setAcidosGordosTrans(0.0f);
        });
    }



}