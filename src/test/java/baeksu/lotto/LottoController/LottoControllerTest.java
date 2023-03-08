package baeksu.lotto.LottoController;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest
class LottoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("/lotto 요청시 hello world를 출력한다.")
    public void getHello() throws Exception{
        //given
        mockMvc.perform(MockMvcRequestBuilders.get("/lotto"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("hello world"))
                .andDo(MockMvcResultHandlers.print());


        //when
        
        //then
    }

}