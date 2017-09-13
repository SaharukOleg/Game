package logic;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum EnumsMove {

    FORWARD(0), LEFT(1), RIGHT(2);

    private int directionOrdinal;

    private int finishDirectional;

    EnumsMove(int i) {
        this.directionOrdinal = i;
        this.finishDirectional = i;
    }
}
