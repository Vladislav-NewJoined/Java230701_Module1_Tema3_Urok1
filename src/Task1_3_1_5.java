import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

//        Пример _ ППППППППППППППППППППППППППППППППППП
public class Task1_3_1_5 {

    public static void main(String[] args) throws IOException {
        System.out.println("Задание : \n1.\tСохраните снимок дня NASA в свой созданный класc\n\nРешение: ");

        String pageNasa = downloadWebPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
        int urlBegin = pageNasa.lastIndexOf("url");
        int urlEnd = pageNasa.lastIndexOf("}");
        String urlPhoto = pageNasa.substring(urlBegin + 6, urlEnd - 1);
        try (InputStream in = new URL(urlPhoto).openStream()) {
            Files.copy(in, Paths.get("photo.jpg"));
        }
        System.out.println("\n" + "Картинка сохранена!");

        int explanationBegin = pageNasa.lastIndexOf("explanation");
        int explanationEnd = pageNasa.lastIndexOf("hdurl");
        String explanation = pageNasa.substring(explanationBegin + 14, explanationEnd - 3);
        System.out.println("Пояснение к фртографии: \n" + explanation);
        System.out.println();  // Это перенос строки
        System.out.println("Создаем класс String downloadWebPage, который позволит нам сохранить изображение в файл.");
    }

    private static String downloadWebPage(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }
}
//        Конец Примера _ КККККККККККККККК