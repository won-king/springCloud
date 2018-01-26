package spring.cloud.gateway.annotation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * Created by kewangk on 2018/1/19.
 */
@SupportedAnnotationTypes({"spring.cloud.gateway.annotation.Destroyed"})
public class DestroyedAnnotationProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        System.out.println("this is my first annotation processor");
        return false;
    }
}
