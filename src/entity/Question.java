package entity;

public class Question {
    private String id;
    private String name;
    private Level level;
    private ProgramLanguage programLanguage;

    public Question() {
    }

    public Question(String id, String name, Level level, ProgramLanguage programLanguage) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.programLanguage = programLanguage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public ProgramLanguage getProgramLanguage() {
        return programLanguage;
    }

    public void setProgramLanguage(ProgramLanguage programLanguage) {
        this.programLanguage = programLanguage;
    }
}
