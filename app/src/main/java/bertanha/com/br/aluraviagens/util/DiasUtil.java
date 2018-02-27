package bertanha.com.br.aluraviagens.util;

import android.support.annotation.NonNull;

import bertanha.com.br.aluraviagens.model.Pacote;

/**
 * Created by berta on 2/20/2018.
 */

public class DiasUtil {

    public static final String PLURAL = " dias";
    public static final String SINGULAR = " dia";

    @NonNull

    public static String formataEmTexto(int quantidadeDeDias) {
        String diasEmTexto = "";
        if (quantidadeDeDias > 1) {
            return quantidadeDeDias + PLURAL;
        }
        return quantidadeDeDias + SINGULAR;
    }
}
