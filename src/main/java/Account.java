public class Account {

    private static String name;

    public Account() {
        this.name = name;
    }

    public boolean checkNameToEmboss(String name) {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
             принтеру передают строку с именем и фамилией — например,
              «Тимоти Шаламе». Её получится напечатать, если соблюдены требования:
в строке не меньше 3 и не больше 19 символов,
в строке есть только один пробел,
пробел стоит не в начале и не в конце строки.
         */
        int phraseLength = name.length();
        int minPhraseLength = 3;
        int maxPhraseLength = 19;
        int i = name.indexOf(" ");
        int count = 0;
        while (i != -1) {
            i = name.indexOf(" ", i + 1);
            count += 1;
        }
        System.out.println(count);
        System.out.println(phraseLength);
        if (count == 1 &&
                phraseLength >= minPhraseLength &&
                phraseLength <= maxPhraseLength &&
                (name.indexOf(" ") != 0 &&
                name.indexOf(" ") != phraseLength-1))
        {
         //   System.out.println("условия выполнены   пробел по индексу " + (name.indexOf(" ")));
            return true;}
        else
         //   System.out.println("условия НЕ выполнены   пробел по индексу " + (name.indexOf(" ")));
            return false;


    }
}











