package logic;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Level {

    private Map<EnumsMove, Checkpoint> levelMap = new HashMap<>();

    public static Level createStartLevel() {

        Level lvl = new Level();

        Map<EnumsMove, Checkpoint> levelMap = lvl.getLevelMap();

        Checkpoint checkpoint0 = Checkpoint.generateTrueCheckpoint();
        Checkpoint checkpoint1 = Checkpoint.generateFalseCheckpoint();
        Checkpoint checkpoint2 = Checkpoint.generateFalseCheckpoint();

        List<Checkpoint> list = Arrays.asList(checkpoint0, checkpoint1, checkpoint2);
        Collections.shuffle(list);

        levelMap.put(EnumsMove.FORWARD, list.get(EnumsMove.FORWARD.getDirectionOrdinal()));
        levelMap.put(EnumsMove.RIGHT, list.get(EnumsMove.RIGHT.getDirectionOrdinal()));
        levelMap.put(EnumsMove.LEFT, list.get(EnumsMove.LEFT.getDirectionOrdinal()));

        return lvl;
    }

    public static Level createOrdinaryLevel() {
        Level lvl = new Level();
        Map<EnumsMove, Checkpoint> ordinaryLevel = lvl.getLevelMap();

        Checkpoint checkpoint0 = Checkpoint.generateTrueCheckpoint();
        Checkpoint checkpoint1 = Checkpoint.generateFalseCheckpoint();
        Checkpoint checkpoint2 = Checkpoint.generateFalseCheckpoint();

        List<Checkpoint> list = Arrays.asList(checkpoint0, checkpoint1, checkpoint2);
        Collections.shuffle(list);

        ordinaryLevel.put(EnumsMove.FORWARD, list.get(EnumsMove.FORWARD.getDirectionOrdinal()));
        ordinaryLevel.put(EnumsMove.LEFT, list.get(EnumsMove.LEFT.getDirectionOrdinal()));
        ordinaryLevel.put(EnumsMove.RIGHT, list.get(EnumsMove.RIGHT.getDirectionOrdinal()));


        return lvl;
    }

    public static Level createFinishLevel() {
        Level lvl = new Level();

        Map<EnumsMove, Checkpoint> levelMap = lvl.getLevelMap();

        Checkpoint checkpoint0 = Checkpoint.generateTrueCheckpoint();


        List<Checkpoint> list = Collections.singletonList(checkpoint0);
        Collections.shuffle(list);

        levelMap.put(EnumsMove.FORWARD, list.get(EnumsMove.FORWARD.getFinishDirectional()));


        return lvl;
    }
}
