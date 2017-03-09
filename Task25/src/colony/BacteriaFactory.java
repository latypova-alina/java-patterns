package colony;

/**
 * Created by alina on 09.03.17.
 */
import java.util.Map;
import java.util.TreeMap;

public class BacteriaFactory {
    private static TreeMap<String, Bacteria> map = new TreeMap<>();

    public static Bacteria getClassFromFactory(String gender){
        BacteriaType bacteriaType = BacteriaType.valueOf(gender.toUpperCase());
        switch (bacteriaType) {
            case FEMALE: {
                FemaleBacteria femaleBacteria = new FemaleBacteria();
                map.put(gender, femaleBacteria);
                return femaleBacteria;
            }
            case MALE: {
                MaleBacteria maleBacteria = new MaleBacteria();
                map.put(gender, maleBacteria);
                return maleBacteria;
            }
            default:
                throw new EnumConstantNotPresentException(BacteriaType.class, bacteriaType.name());
        }
    }
}
