package artifacts;
import logic.oleg.EquipmentSlots;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Artifacts {
    EquipmentSlots equipmentSlots;
    String name;
    int damage;
    String hand;
    String slot;
    SpecEffects specEffects;





}
