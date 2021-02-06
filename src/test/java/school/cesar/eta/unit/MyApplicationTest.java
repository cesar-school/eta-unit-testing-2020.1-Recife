package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyApplicationTest {
    class TestMessageService extends MessageService {
        @Override
        public boolean send(String msg, String rec) {
            return true;
        }
    }

    @Test
    public void processMessage_anyMsgAndAnyRec_true(){
        TestMessageService service = new TestMessageService();
        MyApplication app = new MyApplication();
        app.setService(service);
        Message dummy = new Message();
        boolean actual = app.processMessage(dummy);
        Assertions.assertTrue(actual);
    }
}
