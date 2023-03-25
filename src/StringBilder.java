public class StringBilder {
    public static void main(String[] args) {
        /*String x = "hello"; // иньтибл объект(изменить объект невозможно при помощи метода x.toUpperCase(), можно изменить, присвоив ему новое значение)
        x = x.toUpperCase();
        System.out.println(x);*/

        /*String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1+string2+string3; // в этой операции суммирования создаются дополнительные два объекта под капотом Java
        System.out.println(stringAll); // поэтому такая простая операция довольно много памяти занимает, если нужно много операций, то StringBuilder*/

        StringBuilder sb = new StringBuilder("Hello"); // Объект StringBuilder аниньютибл, т.е. может изменять значение
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" friend"); // Мы меняем объект "sb" и не создаем новую строку и тем самым высвобождаем память
        System.out.println(sb.toString());
    }
}