public class TakeIn {
    public static void main(String[] args) {
        Elephant elephant = new Elephant("Rex Africa", "Dumbó");
        elephant.setNickName("Fáni");
        System.out.println(elephant);

        Lion lion = new Lion("Rex King", "Bandi");
        lion.setNickName("Szimba");
        System.out.println(lion);

        SeaDog seal = new SeaDog("Rex Seal", "Dagi");
    }
}
