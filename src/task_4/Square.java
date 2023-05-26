package task_4;

public class Square extends Shape {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }
    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }

}
