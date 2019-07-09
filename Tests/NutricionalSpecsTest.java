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

//    ______________________________________________________________________


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
    void testEnergyKJValid() {
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
        ns.setProteina(0.0f);
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
    void testTotalHCFreeValid()  {
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
    void testAcidosOrganicosValid()  {
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
    void testAlcoolValid(){
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
    void testAmidoBiggerThanMax(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(AssertionError.class, ()->{
            ns.setAmido(90.3f);
        });
    }


    @Test
    void testAmidoSmallerThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();

        assertThrows(AssertionError.class, ()->{
            ns.setAmido(-0.01f);
        });
    }

    @Test
    void testAmidoValid(){
        NutricionalSpecs ns = new NutricionalSpecs();

        ns.setAmido(0.0f);
        assertEquals(0.0f, ns.getAmido());

        ns.setAmido(90.2f);
        assertEquals(90.2f, ns.getAmido());
   }

    /**
     *  test for getOligossacaridos
     */
    @Test
    void testOligossacaridosValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setOligossacaridos(0.0f);
        assertEquals(0.0f, ns.getOligossacaridos());

        ns.setOligossacaridos(6.3f);
        assertEquals(6.3f, ns.getOligossacaridos());
    }
    @Test
    void testOligossacaridosLesserThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
           ns.setOligossacaridos(-0.1f);
        });
    }
    @Test
    void testOligossacaridosNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
            ns.setOligossacaridos(null);
        });
    }
    @Test
    void testOligossacaridosBiggerThanMax(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
            ns.setOligossacaridos(6.4f);
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
    void testFibraAlimentarLesserThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
           ns.setFibraAlimentar(-0.1f);
        });
    }

    @Test
    void testFibraAlimentarBiggerThanMax(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
            ns.setFibraAlimentar(30.1f);
        });
    }
    @Test
    void testFibraAlimentarValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setFibraAlimentar(0.1f);
        assertEquals(0.1f, ns.getFibraAlimentar());
        ns.setFibraAlimentar(30.0f);
        assertEquals(30.0f, ns.getFibraAlimentar());
    }

    /**
     *  test acidosgordossaturados
     */
    @Test
    void testAcidosGordosSaturadosValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setAcidosGordosSaturados(0.0f);
        assertEquals(0.0f,ns.getAcidosGordosSaturados());
        ns.setAcidosGordosSaturados(86.9f);
        assertEquals(86.9f,ns.getAcidosGordosSaturados());
    }

    @Test
    void testAcidosGordosSaturadosLesserThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
           ns.setAcidosGordosSaturados(-0.1f);
        });
    }

    @Test
    void testAcidosGordosSaturadosBiggerThanMax(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
            ns.setAcidosGordosSaturados(87.0f);
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
    void testAcidosGordosMonoinsaturadosLesserThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{ns.setAcidosGordosMonoinsaturados(-0.1f);});
    }

    @Test
    void testAcidosGordosMonoinsaturadosBiggerThanMax(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{ns.setAcidosGordosMonoinsaturados(78.7f);});
    }
    @Test
    void testAcidosGordosMonoinsaturadosValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setAcidosGordosMonoinsaturados(0.0f);
        assertEquals(0.0f,ns.getAcidosGordosMonoinsaturados());
        ns.setAcidosGordosMonoinsaturados(78.6f);
        assertEquals(78.6f,ns.getAcidosGordosMonoinsaturados());
    }

    /**
     *  test AcidosGordosPolinsaturados
     */
    @Test
    void testAcidosGordosPolinsaturadosValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setAcidosGordosPolinsaturados(0.0f);
        assertEquals(0.0f,ns.getAcidosGordosPolinsaturados());

        ns.setAcidosGordosPolinsaturados(63.9f);
        assertEquals(63.9f,ns.getAcidosGordosPolinsaturados());
    }
    @Test
    void testAcidosGordosPolinsaturadosNull(){

        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
           ns.setAcidosGordosPolinsaturados(null);
        });
    }
    @Test
    void testAcidosGordosPolinsaturadosLesserThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
            ns.setAcidosGordosPolinsaturados(-0.1f);
        });
    }

    @Test
    void testAcidosGordosPolinsaturadosBiggerThanMax(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
            ns.setAcidosGordosPolinsaturados(64.0f);
        });
    }
    /**
     * test for AcidosGordosTrans
     */
    @Test
    void testAcidosGordosTrans(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setAcidosGordosTrans(0.0f);
        assertEquals(0.0f,ns.getAcidosGordosTrans());

        ns.setAcidosGordosTrans(17.0f);
        assertEquals(17.0f,ns.getAcidosGordosTrans());

    }

    @Test
    void testAcidosGordosTransNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
           ns.setAcidosGordosTrans(null);
        });
    }

    @Test
    void testAcidosGordosTransSmalleThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()->{
           ns.setAcidosGordosTrans(-0.1f);
        });
    }

//    ________________________________

    @Test
    void testRetinolValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setRetinol(0.0f);
        assertEquals(0.0f,ns.getRetinol());
        ns.setRetinol(14.9f);
        assertEquals(14.9f,ns.getRetinol());
    }

    @Test
    void testRetinolnull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setRetinol(null));
    }

    @Test
    void testRetinolLesserThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setRetinol(-0.1f));
    }

    @Test
    void testRetinolBiggerThanMax(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setRetinol(15.0f));
    }


//    ________________________________

    @Test
    void testAcidoLinoleicoValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setAcidoLinoleico(0.0f);
        assertEquals(0.0f,ns.getAcidoLinoleico());
        ns.setAcidoLinoleico(64.0f);
        assertEquals(64.0f,ns.getAcidoLinoleico());
    }

    @Test
    void testAcidoLinoleiconull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setAcidoLinoleico(null));
    }

    @Test
    void testAcidoLinoleicoLesserThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setAcidoLinoleico(-0.1f));
    }

    @Test
    void testAcidoLinoleicoBiggerThanMax(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setAcidoLinoleico(14500.1f));
    }
//    ________________________________
@Test
void testColesterolValid(){
    NutricionalSpecs ns = new NutricionalSpecs();
    ns.setColesterol(0.0f);
    assertEquals(0.0f,ns.getColesterol());
    ns.setColesterol(1280.0f);
    assertEquals(1280.0f,ns.getColesterol());
}

    @Test
    void testColesterolNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setColesterol(null));
    }

    @Test
    void testColesterolLesserThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setColesterol(-0.1f));
    }

    @Test
    void testColesterolBiggerThanMax(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setColesterol(1280.1f));
    }

    //    ________________________________

    @Test
    void testVitATotalValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setVitATotal(0.0f);
        assertEquals(0.0f,ns.getVitATotal());
        ns.setVitATotal(15000.0f);
        assertEquals(15000.0f,ns.getVitATotal());
    }

    @Test
    void testVitATotalNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setVitATotal(null));
    }

    @Test
    void testVitATotalLesserThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setVitATotal(-0.1f));
    }

    @Test
    void testVitATotalBiggerThanMax(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setVitATotal(15000.1f));
    }

    //    ________________________________

    @Test
    void testCarotenoValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setCaroteno(0.0f);
        assertEquals(0.0f,ns.getCaroteno());
        ns.setCaroteno(30730.0f);
        assertEquals(30730.0f,ns.getCaroteno());
    }

    @Test
    void testCarotenoNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setCaroteno(null));
    }

    @Test
    void testCarotenoLesserThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setCaroteno(-0.1f));
    }

    @Test
    void testCarotenoBiggerThanMax(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setCaroteno(30730.1f));
    }

    //    ________________________________

    @Test
    void testVitDValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setVitD(0.0f);
        assertEquals(0.0f,ns.getVitD());
        ns.setVitD(92.0f);
        assertEquals(92.0f,ns.getVitD());
    }

    @Test
    void testVitDNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setVitD(null));
    }

    @Test
    void testVitDLesserThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setVitD(-0.1f));
    }

    @Test
    void testVitDBiggerThanMax(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setVitD(92.1f));
    }

    //    ________________________________

    @Test
    void testaTocoferolValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setaTocoferol(0.0f);
        assertEquals(0.0f,ns.getaTocoferol());
        ns.setaTocoferol(84.0f);
        assertEquals(84.0f,ns.getaTocoferol());
    }

    @Test
    void testaTocoferolNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setaTocoferol(null));
    }

    @Test
    void testaTocoferolLesserThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setaTocoferol(-0.1f));
    }

    @Test
    void testaTocoferolBiggerThanMax(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setaTocoferol(84.1f));
    }

    //    ________________________________

    @Test
    void testTiaminaValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setTiamina(0.0f);
        assertEquals(0.0f,ns.getTiamina());
        ns.setTiamina(2.5f);
        assertEquals(2.5f,ns.getTiamina());
    }

    @Test
    void testTiaminaNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setTiamina(null));
    }

    @Test
    void testTiaminaLesserThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setTiamina(-0.1f));
    }

    @Test
    void testTiaminaBiggerThanMax(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setTiamina(2.6f));
    }

    //    ________________________________

    @Test
    void testRiboflavinaValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setRiboflavina(0.0f);
        assertEquals(0.0f,ns.getRiboflavina());
        ns.setRiboflavina(4.7f);
        assertEquals(4.7f,ns.getRiboflavina());
    }

    @Test
    void testRiboflavinaNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setRiboflavina(null));
    }

    @Test
    void testRiboflavinaLesserThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setRiboflavina(-0.1f));
    }

    @Test
    void testRiboflavinaBiggerThanMax(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setRiboflavina(4.8f));
    }

    //    ________________________________

    @Test
    void testEquivalentesNiacinaValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setEquivalentesNiacina(0.0f);
        assertEquals(0.0f,ns.getEquivalentesNiacina());
        ns.setEquivalentesNiacina(33.0f);
        assertEquals(33.0f,ns.getEquivalentesNiacina());
    }

    @Test
    void testEquivalentesNiacinaNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setEquivalentesNiacina(null));
    }

    @Test
    void testEquivalentesNiacinaLesserThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setEquivalentesNiacina(-0.1f));
    }

    @Test
    void testEquivalentesNiacinaBiggerThanMax(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setEquivalentesNiacina(33.1f));
    }


    //    ________________________________

    @Test
    void testNiacinaValid(){
        NutricionalSpecs ns = new NutricionalSpecs();
        ns.setNiacina(0.0f);
        assertEquals(0.0f,ns.getNiacina());
        ns.setNiacina(31.0f);
        assertEquals(31.0f,ns.getNiacina());
    }

    @Test
    void testNiacinaNull(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setNiacina(null));
    }

    @Test
    void testNiacinaLesserThanMin(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setNiacina(-0.1f));
    }

    @Test
    void testNiacinaBiggerThanMax(){
        NutricionalSpecs ns = new NutricionalSpecs();
        assertThrows(AssertionError.class,()-> ns.setNiacina(31.1f));
    }

}