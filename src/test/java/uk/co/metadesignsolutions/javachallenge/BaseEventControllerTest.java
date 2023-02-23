package uk.co.metadesignsolutions.javachallenge;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.cronn.testutils.h2.H2Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import uk.co.metadesignsolutions.javachallenge.repositories.EventRepository;

@SpringBootTest
@AutoConfigureMockMvc
@Import(H2Util.class)
public class BaseEventControllerTest {

    @Autowired
    MockMvc mvc;

    @Autowired
    EventRepository eventRepository;

    final static String SCHEDULE_URL = "/schedule";

    protected String asJsonString(final Object object) {
        try {
            return new ObjectMapper().writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
