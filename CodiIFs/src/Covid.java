import java.util.Arrays;
import java.util.List;

public class Covid {

    public static String covid(float bodyTemperature, boolean difficultyBreathing,
                               boolean diabetes, boolean cancer, boolean isPregnant,
                               boolean isOver60yearsold, boolean hepatic,
                               boolean kidnevDisease, boolean respiratoryDisease, String provincia
    ){
        List<Boolean> arrDiseases = Arrays.asList(difficultyBreathing, diabetes, cancer, isPregnant, isOver60yearsold, hepatic, kidnevDisease, respiratoryDisease);

        if (bodyTemperature>= 38){
            if (arrDiseases.contains(true)) {
                return "/diagnostico/"+provincia;
            }
            return "/cuarentena/";
        }
        return "/diagnostico_bueno/";
    }
}
