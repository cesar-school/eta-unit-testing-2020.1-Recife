package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MyApplicationMockitoTest {

    @InjectMocks
    MyApplication app;

    @Mock
    MessageService service;

    @Test
    public void processMessage_anyMsgAndAnyRec_true() {
        when(service.send(null, null)).thenReturn(true);

        Message dummy = new Message();
        boolean actual = app.processMessage(dummy);
        Assertions.assertTrue(actual);
    }

    @Test
    public void processMessage_withMsgAndRec_false(){
        when(service.send("Hello world!", "mmcj@cesar.school")).thenReturn(false);

        Message message = new Message();
        message.setRec("mmcj@cesar.school");
        message.setContent("Hello world!");

        boolean actual = app.processMessage(message);
        Assertions.assertFalse(actual);
    }

}
