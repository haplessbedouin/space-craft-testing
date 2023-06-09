import com.cydeo.spacecraft.dto.CreateGameDTO;
import com.cydeo.spacecraft.entity.Player;
import com.cydeo.spacecraft.enumtype.Boost;
import com.cydeo.spacecraft.enumtype.Level;
import com.cydeo.spacecraft.service.impl.CreatePlayerServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreatePlayerServiceImplTest {

    private CreatePlayerServiceImpl createPlayerService;

    @BeforeEach
    public void setUp(){
        createPlayerService = new CreatePlayerServiceImpl();
    }

    @Test
    public void should_create_player_with_big_bomb_boost_type(){
        //given
        CreateGameDTO createGameDTO = new CreateGameDTO();
        createGameDTO.setBoost(Boost.BIG_BOMB);
        createGameDTO.setLevel(Level.EASY);
        createGameDTO.setUsername("username");

        //when
        Player player = createPlayerService.createPlayer(createGameDTO);

        //then
        assertEquals(player.getHealth(), 2000);


    }

}
