package school.cesar.eta.unit;

public class MyApplication {
    private MessageService service;

    public void setService(MessageService svc){
        this.service = svc;
    }

    public boolean processMessage(Message msg){
        return service.send(msg.getContent(), msg.getRec());
    }
}
