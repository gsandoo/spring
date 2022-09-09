package Adaptor;

//본연의 값(Electronic110V) 를 상속받아야한다.
public class SocketAdaptor implements Electronic110V{

    // 변환해야 할 값(Electronic220V) 를 정의해주기.
    private Electronic220V electronic220V;

    public SocketAdaptor(Electronic220V electronic220V){
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}
