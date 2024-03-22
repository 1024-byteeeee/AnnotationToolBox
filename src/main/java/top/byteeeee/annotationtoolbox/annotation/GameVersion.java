package top.byteeeee.annotationtoolbox.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface GameVersion {

    String[] version();

    String desc() default " ";

}
