package top.byteeeee.annotationtoolbox.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 不知道做什么，先随便意思意思。
@SuppressWarnings("unused")
@Retention(RetentionPolicy.SOURCE)
public @interface GameVersion {
    String[] version();

    String desc() default " ";
}
