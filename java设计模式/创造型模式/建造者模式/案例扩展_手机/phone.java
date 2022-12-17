package 创造型模式.建造者模式.案例扩展_手机;

public class phone {
    private String cpu;
    private String screen;
    private String memory;
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }

    //私有构建方法
    public phone(builder builder){
        this.cpu=builder.cpu;
        this.screen=builder.screen;
        this.memory=builder.memory;

    }
    public static final class builder{
        private String cpu;
        private String screen;
        private String memory;

        public builder cpu(String cpu){
            this.cpu=cpu;
            return this;
        }
        public builder screen(String screen){
            this.screen=screen;
            return this;
        }
        public builder memory(String memory){
            this.memory=memory;
            return this;
        }

        //由于不能创建对象，需要自己手写创建方法进行创建
        //使用构建者创建phone对象
        public  phone build(){
         //   return new phone(this);
        phone phone=new phone(this);
        return phone;
        }
    }
}
