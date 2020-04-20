import com.example.configuration.JavaConfiguration;
import com.example.configuration.OtherJavaConfiguration;
import com.example.java.JavaBeanClass;
import com.example.java.UpperJavaBeanClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 * Cette classe de test ne compile pas
 * Pour la faire compiler vous devez ajouter les dépendances nécessaires
 * Puis vous devrez faire passer les tests
 * Tous se basent sur de la Configuration Java
 */
@ContextConfiguration(classes = {JavaConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class MainJavaTestClass {


    @Autowired(required = false)
    private String javaRandomString;

    @Autowired(required = false)
    private JavaBeanClass monBean;

    @Autowired(required = false)
    private JavaBeanClass monBean2;

    @Autowired(required = false)
    private UpperJavaBeanClass upperBean;


    @Test
    public void testStringIsNotNull() {
        /**
         * Ce test vérifie l'injection d'une chaine de caractères à déclarer en configuration Java
         */
        assertNotNull(javaRandomString);
        assertEquals(javaRandomString, "test");
    }

    @Test
    public void testBeanIsNotNull() {
        /**
         * Ce test vérifie l'injection d'un objet de type JavaBeanClass
         */
        assertNotNull(monBean);
        assertEquals(monBean.getRandomValue(), 2);
    }

    @Test
    public void testBean2IsNotNull() {
        /**
         * Ce test vérifie l'injection d'un second objet de type JavaBeanClass, different du premier
         */
        assertNotNull(monBean2);
        assertEquals(monBean2.getRandomValue(), 3);
    }

    @Test
    public void testUpperBeanIsNotNull() {
        /**
         * Ce test vérifie l'injection d'un objet de type UpperJavaBeanClass
         * Il doit lui meme contenir un objet de type JavaBeanClass correctement valorisé
         */
        assertNotNull(upperBean);
        assertEquals(upperBean.getJavaBeanClass(), monBean2);
        assertEquals(upperBean.getJavaBeanClass().getRandomValue(), 3);
    }
}
