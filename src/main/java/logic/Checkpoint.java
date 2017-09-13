package logic;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Checkpoint {

    String checkpointDescription;

    boolean isCorrectMove;

    public static Checkpoint generateTrueCheckpoint(String description) {

        Checkpoint ckPoint = new Checkpoint();
        ckPoint.isCorrectMove = true;
        ckPoint.checkpointDescription = description;

        return ckPoint;
    }

    public static Checkpoint generateFalseCheckpoint(String description) {
        Checkpoint checkpoint = new Checkpoint();
        checkpoint.isCorrectMove = false;
        checkpoint.checkpointDescription = description;
        return checkpoint;
    }
}
