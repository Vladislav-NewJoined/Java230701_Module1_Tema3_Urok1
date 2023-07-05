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







////        Пример 2 ППППППППППППППППППППППППППППППППППП
//public class Draft5_Task1_3_1 {
//
//    public static void main(String[] args) throws IOException {
//
//
//    }
//}
//
////        Конец Примера 2 КККККККККККККККК







////        Пример 1 ППППППППППППППППППППППППППППППППППП
//public class Draft5_Task1_3_1 {
//
//    public static void main(String[] args) throws IOException {
//
//
//        String pageNasa = downloadWebPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
//        int urlBegin = pageNasa.lastIndexOf("url");
//        int urlEnd = pageNasa.lastIndexOf("}");
//        String urlPhoto = pageNasa.substring(urlBegin + 6, urlEnd - 1);
//        try (InputStream in = new URL(urlPhoto).openStream()) {
//            /*Files.copy(in, Paths.get("photo.jpg"));*/
//        }
//
//        System.out.println("\n" + "Картинка сохранена!");
//
//        int explanationBegin = pageNasa.lastIndexOf("explanation");
//        int explanationEnd = pageNasa.lastIndexOf("hdurl");
//        String explanation = pageNasa.substring(explanationBegin + 14, explanationEnd - 3);
//        System.out.println(explanation);
//
//    }
//
//    private static String downloadWebPage(String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//    }
//}
////        Конец Примера 1 КККККККККККККККК
