package engine;

public interface Logic {

    void init(Window window) throws Exception;

    void input(Window window, MouseInput mouseInput);

    void update(float interval, MouseInput mouseInput);

    void render(Window window) throws Exception;

    void cleanup();
}
