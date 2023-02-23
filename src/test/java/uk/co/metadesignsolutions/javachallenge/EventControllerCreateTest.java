package uk.co.metadesignsolutions.javachallenge;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

public class EventControllerCreateTest  extends  BaseEventControllerTest{


    @Test
    @Disabled
    public void testySample() throws Exception{
        mvc.perform(
                MockMvcRequestBuilders.post(SCHEDULE_URL)
                        .accept(MediaType.APPLICATION_JSON)
        ).andExpect(content().string(Matchers.notNullValue()));
    }




}
