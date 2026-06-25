class Computer {

    private final String cpu;
    private final String ram;
    private final String storage;

    // Private Constructor
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }

    public void display() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println();
    }

    // Static Nested Builder Class
    static class Builder {
        private String cpu;
        private String ram;
        private String storage;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

public class BuilderPatternExample {

    public static void main(String[] args) {

        Computer computer1 = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("8GB")
                .setStorage("256GB SSD")
                .build();

        Computer computer2 = new Computer.Builder()
                .setCpu("Intel i7")
                .setRam("16GB")
                .setStorage("512GB SSD")
                .build();

        System.out.println("Computer 1 Details:");
        computer1.display();

        System.out.println("Computer 2 Details:");
        computer2.display();
    }
}