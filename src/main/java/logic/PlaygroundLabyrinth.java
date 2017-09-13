package logic;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class PlaygroundLabyrinth {

    private Level start;
    private Level second;
    private Level third;
    private Level fourth;
    private Level fifth;
    private Level finish;


    public PlaygroundLabyrinth initPlayground(){
        PlaygroundLabyrinth pl = new PlaygroundLabyrinth();
        pl.setStart(Level.createStartLevel());
        pl.setSecond(Level.createOrdinaryLevel(EnumsLevels.SECOND));
        pl.setThird(Level.createOrdinaryLevel(EnumsLevels.THIRD));
        pl.setFourth(Level.createOrdinaryLevel(EnumsLevels.FOURTH));
        pl.setFourth(Level.createOrdinaryLevel(EnumsLevels.FIFTH));
        pl.setFinish(Level.createFinishLevel());
        return pl;
    }


}


