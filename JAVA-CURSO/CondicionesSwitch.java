public class CondicionesSwitch {
    public static void main(String[] args) {
        char letra = 'd';
        letra = Character.toLowerCase(letra);
        switch (letra) {
            case 'A':
                System.out.println("Letra -->A ");
            case 'a':
                System.out.println("Letra -->a ");
                break;
            case 'B':
                System.out.println("Letra -->B ");
            case 'b':
                System.out.println("Letra -->b");
                break;
            default:
                System.out.println("Letra no es ni A ni B ");

        }

    }

}
