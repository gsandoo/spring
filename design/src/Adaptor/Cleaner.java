package Adaptor;

public class Cleaner implements Electronic220V{
    @Override
    public void connect() {
        System.out.println("청소기 220v 전원 on...");
    }
}
