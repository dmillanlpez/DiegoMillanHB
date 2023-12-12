package com.gestorDatos.datoscuriosos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
@RestController
public class DatosCuriososController {

    List<String> datosCuriosos = List.of(
            "Nieva en el desierto del Sahara",
            "Sólo hay dos países en el mundo donde no existe la Coca Cola",
            "Sudán es el país con más pirámides del mundo (no Egipto)",
            "El arco iris más brillante de Colombia está en su río",
            "El desierto del Sáhara solía ser una selva tropical",
            "Macchu Pichu es una ciudad a prueba de terremotos",
            "China tiene un solo huso horario",
            "El puente Golden Gate de San Francisco 'habla'",
            "Puedes hacer un safari en Sri Lanka",
            "Tailandia tiene un festival para apreciar a sus monos",
            "En Etiopía siempre hay siete años de retraso",
            "Francia es el país más visitado, con 89 millones de turistas anuales",
            "Hay un pueblo en Holanda que no tiene calles, sólo canales",
            "Hay una roca en Australia más grande que la Roca Uluru",
            "Nueva Zelanda tiene la zona residencial más empinada del mundo",
            "En Hawái, puedes experimentar playas soleadas y montañas nevadas en la misma isla"
    );

    @GetMapping
    public String obtenerDatoCurioso(){
        Random random = new Random();
        int datoAleatorio = random.nextInt(datosCuriosos.size());
        return datosCuriosos.get(datoAleatorio);
    }
}
