import java.io.File;

public class Task1_3_1_4 {
    public static void main(String[] args) {
        System.out.println("Задание 4.: \n1.\tСохраните информацию о всех файлах в заданной директории в массив " +
                "FileInformation\n\nРешение: ");

        File dir = new File("text_files");
        File[] files = dir.listFiles();
        int fifesCount = files.length;
        FileInformation[] fileInfos = new FileInformation[fifesCount];

        System.out.println("Сохраняем информацию о файлах в директории text_files в массив fileInfos[] " +
                "и выводим в консоль");
        for (int i = 0; i < fifesCount; i++) {
            File currentFile = files[i];
            FileInformation info = new FileInformation();
            info.absolutePath = currentFile.getAbsolutePath();
            info.fileName = currentFile.getName();
            info.size = currentFile.length();
            fileInfos[i] = info;
        }

        //  Обойдем fileInfos[] в цикле
        for (int i =0; i < fileInfos.length; i++) {
            /*FileInformation current = fileInfos[i];*/
            System.out.println("fileName" + i + ": " + fileInfos[i].fileName);
            System.out.println("size" + i + ": " + fileInfos[i].size);
            System.out.println("absolutePath" + i + ": " + fileInfos[i].size);

        }
    }
}