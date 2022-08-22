package utils;

import com.codeborne.selenide.Selenide;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class Util {
    public static void waitInSeconds(int milliseconds) {
        Selenide.sleep(milliseconds);

    }
}
