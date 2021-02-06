package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyApplicationTest {
    class SpyMessageService extends MessageService {
        public int count = 0;
        String msg;
        String rec;


        @Override
        public boolean send(String msg, String rec) {
            count++;
            this.msg = msg;
            this.rec = rec;
            return false;
        }
    }


    MyApplication app;

    @BeforeEach
    public void setup() {
        app = new MyApplication();
    }

    @Test
    public void processMessage_anyMsgAndAnyRec_false() {
        SpyMessageService service = new SpyMessageService();
        app.setService(service);
        Message dummy = new Message();
        boolean actual = app.processMessage(dummy);
        Assertions.assertEquals(1, service.count);
    }

    @Test
    public void processMessage_anyMsgAndAnyRec_true() {
        MessageService service = new MessageService() {
            @Override
            public boolean send(String msg, String rec) {
                return true;
            }
        };

        app.setService(service);
        Message dummy = new Message();
        boolean actual = app.processMessage(dummy);
        Assertions.assertTrue(actual);
    }

    @Test
    public void processMessage_withMsgAndRec_false(){
        SpyMessageService service = new SpyMessageService();

        Message message = new Message();
        message.setRec("mmcj@cesar.school");
        message.setContent("Hello world!");

        app.setService(service);
        app.processMessage(message);

        Assertions.assertEquals("Hello world!", service.msg);
        Assertions.assertEquals("mmcj@cesar.school", service.rec);
    }
}
