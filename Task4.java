public class Task4 {
    public static void main(String[] args) {
        File[] files=new File[4];
        files[0]=new TextFile("doc1.txt",500,"UTF-8");
        files[1]=new TextFile("doc2.txt",700,"ASCII");
        files[2]=new ImageFile("img1.png",20000,"1024x768");
        files[3]=new ArchiveFile("arch1.rar",50000,10);
        int totalSize=0;
        for (File f: files) {
            System.out.println(f.toString());
            System.out.println(f.getDescription());
            totalSize=totalSize+f.getSize();
        }
        System.out.println("Общий размер всех файлов: "+totalSize+" байт");
    }
}