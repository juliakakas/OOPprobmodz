import java.util.List;

public class Elephant implements Animal{
    private final String name;

    private String nickName;

    public Elephant(String name, String nickName) {
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
        this.nickName += nickName;
    }

    @Override
    public String nickName(List<String> nickNameList) {
        nickNameList.add(getNickName());
        return nickNameList.toString();
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
