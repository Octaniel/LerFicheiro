package st.finasncas.imposto;

import io.micronaut.http.annotation.*;

@Controller("/lerFicheiro")
public class LerFicheiroController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}