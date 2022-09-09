import Adaptor.*;
import singleton.Aclazz;
import singleton.Bclazz;
import singleton.SocketClient;

public class Main {
    public static void main(String[] args) {


//        싱글턴 패턴 예제

        Aclazz aclazz = new Aclazz();
        Bclazz bclazz = new Bclazz();

        SocketClient aClient = aclazz.getSocketClient();
        SocketClient bClient = bclazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));


        System.out.println("=====여기는 어댑터패턴 예제=====");


//        어댑터패턴
        HairDryer hairDryer = new HairDryer();
        Cleaner cleaner = new Cleaner();
        AirConditioner airConditioner = new AirConditioner();


        connect(hairDryer);

        // cleaner 와 airConditioner 는 220V로 connect 메서드의 매개변수가 될수없다.
        // 이럴때 어댑터패턴을 활용하자 !
        //connect(cleaner);
        //connect(airConditioner);

        Electronic110V adaptor = new SocketAdaptor(cleaner);
        connect(adaptor);

        Electronic110V adapter = new SocketAdaptor(airConditioner);
        connect(adapter);


    }
          //connect(콘센트) 의 매개변수로는 110v 밖에 못들어온다.
          public static void connect(Electronic110V electronic110v){
              electronic110v.powerOn();
    }

}