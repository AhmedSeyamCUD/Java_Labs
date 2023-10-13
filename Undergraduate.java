public class Undergraduate extends Student {
    private int level;

    public Undergraduate() {
        super();
        level = 1;
    }

    public Undergraduate(String name, int studentNumber, int level) {
        super(name, studentNumber);
        this.level = level;
    }

    public void reset(String name, int studentNumber, int level) {
        super.reset(name, studentNumber);
        setLevel(level);
    }

    public void setLevel(int level) {
        if (level >= 1 && level <= 4) {
            this.level = level;
        } else {
            System.out.println("Illegal level");
            System.exit(0);
        }
    }

    public void writeOutput() {
        super.writeOutput();
        System.out.println("Level: " + level);
    }

    public boolean equals(Undergraduate otherUndergrad) {
        return super.equals(otherUndergrad) && level == otherUndergrad.level;
    }
}