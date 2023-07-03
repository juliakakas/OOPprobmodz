import java.util.List;

public class SeaDog implements Animal{
    private final String name;

    private String nickName;

    public SeaDog(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getName() {
        return name;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String nickName(List<String> nickName) {
        nickName.add(getNickName());
        return nickName.toString();
    }

    @Override
    public String toString() {
        return "SeaDog{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
