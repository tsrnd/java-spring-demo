package Demo;

class CharEX {
    char ch = 'a';
    char uniChar = '\u039A';
    char[] charArray = {'a', 'b', 'c'};
    Character demoChar = 'd';
    void display() {
        System.out.println(ch);
        System.out.println(uniChar);
        System.out.println(charArray);
        System.out.println(Character.isLetter('e'));

        System.out.println("\n\n-----------------------\n\n");
    }
}