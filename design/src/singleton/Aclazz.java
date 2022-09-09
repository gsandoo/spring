package singleton;

public class Aclazz {

//    private  SocketClient socketClient;
//
//    public Aclazz(){
//        this.socketClient = SocketClient.getInstance();
//    }
//
//    public SocketClient getSocketClient(){
//        return  this.socketClient;
//    }


    private  SocketClient socketClient;

    public Aclazz(){
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }
}
