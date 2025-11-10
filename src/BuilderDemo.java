import java.util.Objects;

public class BuilderDemo {
    public static void main(String[] args){
        Computer pc1 = Computer.builder()
                .cpu("Intel i5-14600KF")
                .ramMEM(32)
                .storageMEM(2048)
                .gpu("RX 9070 XT")
                .os("Windows 11")
                .build();

        System.out.println(pc1);

        Computer pc2 = Computer.builder()
                .cpu("Intel ceva")
                .ramMEM(24)
                .storageMEM(1024)
                .build();

        System.out.println(pc2);
    }

    static final class Computer {
        private final String  cpu;
        private final int     ramMEM;
        private final Integer storageMEM;
        private final String  gpu;
        private final String  os;

        // constructor privat: ia valorile din builder
        private Computer(Builder b) {
            this.cpu        = b.cpu;
            this.ramMEM     = b.ramMEM;
            this.storageMEM = b.storageMEM;
            this.gpu        = b.gpu;
            this.os         = b.os;
        }

        public static Builder builder() { return new Builder(); }

        // BUILDER
        public static final class Builder {
            private String  cpu;      // obligatoriu
            private Integer ramMEM;   // obligatoriu
            private Integer storageMEM;
            private String  gpu;
            private String  os;

            public Builder cpu(String cpu){
                this.cpu = Objects.requireNonNull(cpu, "cpu is required");
                return this;
            }
            public Builder ramMEM(int mem) {
                if (mem <= 0) throw new IllegalArgumentException("ramMEM must be > 0");
                this.ramMEM = mem;
                return this;
            }
            public Builder storageMEM(Integer mem){
                if (mem != null && mem <= 0) throw new IllegalArgumentException("storageMEM must be > 0");
                this.storageMEM = mem;
                return this;
            }
            public Builder gpu(String gpu) {
                this.gpu = gpu;
                return this;
            }
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            public Computer build (){
                if (cpu == null)    throw new IllegalStateException("cpu is required");
                if (ramMEM == null) throw new IllegalStateException("ramMEM is required");
                return new Computer(this);
            }
        }

        @Override
        public String toString(){
            return String.format(
                    "Computer[cpu=%s, ram=%dMEM, storage=%s, gpu=%s, os=%s]",
                    cpu, ramMEM,
                    (storageMEM == null ? "-" : storageMEM + "MEM"),
                    (gpu == null ? "-" : gpu),
                    (os == null ? "-" : os)
            );
        }
    }
}

/*static final class ClassicComputerTelescoping {
        private final String  cpu;
        private final int     ramGB;
        private final Integer storageGB;
        private final String  gpu;
        private final String  os;

        // constructor cu obligatorii
        ClassicComputerTelescoping(String cpu, int ramGB) {
            this(cpu, ramGB, null, null, null);
        }
        // constructor cu un opțional
        ClassicComputerTelescoping(String cpu, int ramGB, Integer storageGB) {
            this(cpu, ramGB, storageGB, null, null);
        }
        // constructor cu două opționale
        ClassicComputerTelescoping(String cpu, int ramGB, Integer storageGB, String gpu) {
            this(cpu, ramGB, storageGB, gpu, null);
        }
        // constructor cu toate
        ClassicComputerTelescoping(String cpu, int ramGB, Integer storageGB, String gpu, String os) {
            this.cpu = cpu;
            this.ramGB = ramGB;
            this.storageGB = storageGB;
            this.gpu = gpu;
            this.os = os;
        }

        @Override public String toString() {
            return String.format(
                    "ClassicTelescoping[cpu=%s, ram=%dGB, storage=%s, gpu=%s, os=%s]",
                    cpu, ramGB,
                    storageGB == null ? "-" : storageGB + "GB",
                    gpu == null ? "-" : gpu,
                    os == null ? "-" : os
            );
        }
    }*/