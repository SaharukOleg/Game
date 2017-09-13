import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class EquipmentSlots {
    boolean head = false;
    boolean hands = false;
    boolean body = false;
    boolean legs = false;
    boolean shoulders = false;
}
