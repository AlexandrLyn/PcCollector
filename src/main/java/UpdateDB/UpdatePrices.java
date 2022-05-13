package UpdateDB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/*Принимаем url, через buffer присваиваем строки html переменной inputline и text, через ключ. знак ₽ проверяем
есть ли товар в наличии, если есть сост. строку по ключ. занку ₽<. У
сост. строки убираем все элементы, кроме цифр и преобразуем строку в число. Если товара нет в наличии, то возвр. -1 */

public class UpdatePrices {

    public int issuingAPrice(String urlUpdate) throws IOException {
        URL url = new URL(urlUpdate);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String inputLine = null;
        String text = null;
        while ((inputLine = in.readLine()) != null) {
            text = text + inputLine;
        }
        if (!text.contains("₽")) {
            return -1;
        } else {
            int end = text.indexOf("₽<");
            int begin = end - 10;
            String part = text.substring(begin, end);
            String result = part.replaceAll("[^0-9]", "");
            return Integer.valueOf(result);
        }

    }

}



