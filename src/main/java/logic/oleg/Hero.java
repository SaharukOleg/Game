import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Hero {
    private String NickName;
    private int YearsOld;
    private int Experience;
    private int Level;
    private Enum Gender;
    private Enum Races;
    private EquipmentSlots equpmentSlots;
    private  HeroCharacteristics heroCharacteristics;
    private Slot slot;
}
