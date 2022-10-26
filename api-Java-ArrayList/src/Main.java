import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Essa e uma das classes que mais se usa em projetos reais, atenção especial.
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "B");
        System.out.println(arrayList);

        //Busca no arraylist usando boolean e if else para ver se o elemento existe na busca ou não
        boolean existe = arrayList.contains("A");
        if (existe) {
            System.out.println("Elemento existe no array");
        } else {
            System.out.println("Elemento não existe no array");
        }
        //Retorna o indicie que o objeto se encontra
        int pos = arrayList.indexOf("D");
        if (pos > -1) {
            System.out.println("Elemento existe no array" + pos);
        } else {
            System.out.println("Elemento não existe no array" + pos);
        }
        //ArraList por buscar de posição
        System.out.println(arrayList.get(2));

        //Vai remover index ou objeto da lista
        arrayList.remove(0);
        arrayList.remove("B");

        System.out.println(arrayList);

        //Tamanho
        System.out.println(arrayList.size());
    }
}