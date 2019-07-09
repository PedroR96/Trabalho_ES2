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
    void testProductIDRight(){


    }

    @Test
    void testProductIDNull(){
        NutricionalSpecs ns =  new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setProductID(null));
    }

    @Test
    void testProductIDBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setProductID("IS152635824"));
    }


    @Test
    void testProductIDSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->ns.setProductID("IS0"));
    }
    @Test
    void testProductIDValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setProductID("IS01");
        assertEquals("IS01",ns.getProductID());
        ns.setProductID("IS1111111");
        assertEquals("IS1111111",ns.getProductID());
    }

//    ________________________________________________________________________


    /**
     * Tests from Name of product
     * @throws MaxCharacters
     */
    @Test
    void testNameValid() {
        NutricionalSpecs ns = new NutricionalSpecs();

        ns.setName("Lei");
        assertEquals("Lei",ns.getName());

        ns.setName("Leite de Ovelha cruuLeite de Ovelha cruuLeite de ");
        assertEquals("Leite de Ovelha cruuLeite de Ovelha cruuLeite de ",ns.getName());
    }

    @Test
    void testNameNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->ns.setName(null));
    }

    @Test
    void testNameBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setName("Leite de Ovelha cru com brao de milho e arroz com feijão"));
    }

    @Test
    void testNameSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(AssertionError.class,()-> ns.setName("Le"));
    }

    /**
     * Tests from energiaKCla of product
     */

    @Test
    void testEnergyKClaValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setEnergiaKCla(0.00f);
        assertEquals(0.00f,ns.getEnergiaKCla());

        ns.setEnergiaKCla(999.9f);
        assertEquals(999.9f,ns.getEnergiaKCla());
    }

    @Test
    void testEnergyKClaNull() {
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setEnergiaKCla(null));
    }

    @Test
    void testEnergyKClaBigger() {
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setEnergiaKCla(1000.0f));
    }

    @Test
    void testEnergyKClaSmaller() {
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setEnergiaKCla(-0.1f));
    }

    /**
     *tests from energiaKj of products
     */
    @Test
    void testEnergyKJRight() {
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setEnergiaKj(0.0f);
        assertEquals(0.0f,ns.getEnergiaKj());

        ns.setEnergiaKj(999.9f);
        assertEquals(999.9f,ns.getEnergiaKj());
    }
    @Test
    void testEnergyKjNull() {
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->ns.setEnergiaKj(null) ) ;
    }


    @Test
    void testEnergyKjBigger() {
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->ns.setEnergiaKj(4500.0f) ) ;
    }
    @Test
    void testEnergyKjSmaller() {
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(AssertionError.class,()->ns.setEnergiaKj(-0.1f));
    }

    /**
     *test from water of products
     */
    @Test
    void testWaterValid()  {
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setAgua(1.5f);
        assertEquals(1.5f,ns.getAgua());

        ns.setAgua(99.9f);
        assertEquals(99.9f,ns.getAgua());
    }

    @Test
    void testWaterBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setAgua((float)100.0));
    }

    @Test
    void testWaterNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setAgua(null));
    }

    @Test
    void testWaterSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setAgua((float)1.4));
    }

    /**
     * test from Protein of product
     */
    @Test
    void testProteinValid() {
        NutricionalSpecs ns =new NutricionalSpecs();
        ns.setProteina( 0.0f);
        assertEquals((float)0.0,ns.getProteina());

        ns.setProteina(100.0f);
        assertEquals((float)100.0,ns.getProteina());
    }

    @Test
    void testProteinNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setProteina(null));
    }

    @Test
    void testProteinBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setProteina(100.1f));
    }

    @Test
    void testProteinSmaller(){
        NutricionalSpecs ns  = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setProteina((float)-0.1));
    }

    /**
     * test from total fat
     */
    @Test
    void testTotalFatValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setGorduraTotal((float) 0.0);
        assertEquals((float)0.0,ns.getGorduraTotal());

        ns.setGorduraTotal((float) 100.0);
        assertEquals((float)100.0,ns.getGorduraTotal());
    }

    @Test
    void testTotalFatNull(){
        NutricionalSpecs ns =  new NutricionalSpecs();
        assertThrows(AssertionError.class,()->ns.setGorduraTotal(null));
    }

    @Test
    void testTotalFatBigger(){
        NutricionalSpecs ns =  new NutricionalSpecs();
        assertThrows(AssertionError.class,()->ns.setGorduraTotal((float) 100.1));
    }
    @Test
    void testTotalFatSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->ns.setGorduraTotal((float) -0.1));
    }

    /**
     * test from total HC disponiveis
     */
    @Test
    void testTotalHCFreeRight()  {
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setTotalHCDisponiveis((float) 0.0);
        assertEquals((float)0.0,ns.getTotalHCDisponiveis());
        ns.setTotalHCDisponiveis((float) 100.0);
        assertEquals((float)100.0,ns.getTotalHCDisponiveis());
    }

    @Test
    void testTotalHCFreeNull() {
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setTotalHCDisponiveis(null));
    }


    @Test
    void testTotalHCFreeBigger() {
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setTotalHCDisponiveis((float) 100.1));
    }
    @Test
    void testTotalHCFreeSmaller() {
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setTotalHCDisponiveis((float) -0.1));
    }

    /**
     * test from total HC Monossacaridos
     */

    @Test
    void testTotalHCMonossacaridosValid()  {
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setTotalHCMonossacaridos((float) 0.0 );
        assertEquals((float)0.0,ns.getTotalHCMonossacaridos());

        ns.setTotalHCMonossacaridos((float) 120.0 );
        assertEquals((float)120.0,ns.getTotalHCMonossacaridos());
    }

    @Test
    void testTotalHCMonossacaridosNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->ns.setTotalHCMonossacaridos(null));
    }


    @Test
    void testTotalHCMonossacaridosBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->ns.setTotalHCMonossacaridos((float) 120.1));
    }

    @Test
    void testTotalHCMonossacaridosSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setTotalHCMonossacaridos((float) -0.1));
    }

    /**
     * test from  MonoDissacaridos
     */
    @Test
    void testMonoDissacaridosValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setMonoDissacaridos((float) 0.0 );
        assertEquals((float)0.0,ns.getMonoDissacaridos());
        ns.setMonoDissacaridos((float) 400.0 );
        assertEquals((float)400.0,ns.getMonoDissacaridos());
    }

    @Test
    void testMonoDissacaridosBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->ns.setMonoDissacaridos((float) 400.1));
    }

    @Test
    void testMonoDissacaridosSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setMonoDissacaridos((float) -0.1));
    }

    @Test
    void testMonoDissacaridosNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setMonoDissacaridos(null));
    }

    /**
     * test from  AcidosOrganicos
     */
    @Test
    void testAcidosOrganicosRight()  {
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setAcidosOrganicos((float)0.0);
        assertEquals((float)0.0,ns.getAcidosOrganicos());
        ns.setAcidosOrganicos((float)500.0);
        assertEquals((float)500.0,ns.getAcidosOrganicos());
    }

    @Test
    void testAcidosOrganicosBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setAcidosOrganicos((float) 500.1));
    }

    @Test
    void testAcidosOrganicosSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setAcidosOrganicos((float) -0.1));
    }

    @Test
    void testAcidosOrganicosNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setAcidosOrganicos(null));
    }


    /**
     * test from alcool
     */
    @Test
    void testAlcoolRight(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setAlcool((float) 0.0);
        assertEquals((float)0.0,ns.getAlcool());

        ns.setAlcool((float) 60.0);
        assertEquals((float)60.0,ns.getAlcool());
    }

    @Test
    void testAlcoolBigger(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->ns.setAlcool((float) 60.1));
    }

    @Test
    void testAlcoolSmaller(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->ns.setAlcool((float) -0.1));
    }
    @Test
    void testAlcoolNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->ns.setAlcool(null));
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