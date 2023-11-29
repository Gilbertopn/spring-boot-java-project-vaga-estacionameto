package com.emiballem.demoparkapi.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EstacionamentoUtils {

    // 2023-03-16T15:23:48.616463500
    // 20230316-152121
    public static String gerarRecibo() {
        LocalDateTime date = LocalDateTime.now();
        String recibo = date.toString().substring(0,19);
        return recibo.replace("-", "")
                .replace(":", "")
                .replace("T", "-");
    }
}
