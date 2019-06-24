import com.example.annotations.JavaComponent;
import com.example.configuration.JavaConfiguration;
import com.example.java.JavaAnnotationBeanClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;


/**
 * Cette classe de test ne compile pas
 * Pour la faire compiler vous devez ajouter les dépendances nécessaires
 * Puis vous devrez faire passer les tests
 */
@ContextConfiguration(classes = {JavaConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class ComponentJavaTestClass {

    @Autowired(required = false)
    private JavaAnnotationBeanClass javaAnnotationBeanClass;

    @Test
    public void testJavaAnnotationBeanClassIsAvailableInSpringContext() {
        /**
         * Ce test va rechercher un bean de type JavaAnnotationBeanClass danss le contexte Spring
         * Attention au remplissage des propriétés
         */
        assertNotNull(javaAnnotationBeanClass);
        assertNotNull(javaAnnotationBeanClass.getJavaBeanClass());
        assertNotNull(javaAnnotationBeanClass.getUpperJavaBeanClass().getJavaBeanClass());
    }
}
